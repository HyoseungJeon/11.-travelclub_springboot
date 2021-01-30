package io.namoosori.travelclub.logic;

import io.namoosori.travelclub.entity.ClubStoreMasterLycler;
import io.namoosori.travelclub.entity.club.ClubMembership;
import io.namoosori.travelclub.entity.club.CommunityMember;
import io.namoosori.travelclub.entity.club.RoleInClub;
import io.namoosori.travelclub.entity.club.TravelClub;
import io.namoosori.travelclub.service.MembershipService;
import io.namoosori.travelclub.service.dto.ClubMembershipDto;
import io.namoosori.travelclub.store.ClubStore;
import io.namoosori.travelclub.store.MemberStore;
import io.namoosori.travelclub.store.MembershipStore;
import io.namoosori.travelclub.util.MemberDuplicationException;
import io.namoosori.travelclub.util.NoSuchClubException;
import io.namoosori.travelclub.util.NoSuchMemberException;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class MembershipServiceLogic implements MembershipService {
    private ClubStore clubStore;
    private MemberStore memberStore;
    private MembershipStore membershipStore;

    public MembershipServiceLogic(){
        clubStore = ClubStoreMasterLycler.getInstance().requestClubStore();
        memberStore = ClubStoreMasterLycler.getInstance().requestMemberStore();
    }

    @Override
    public void addMembership(ClubMembershipDto membershipDto) {
        String memberId = membershipDto.getMemberEmail();

        CommunityMember member = Optional.ofNullable(memberStore.retrieve(memberId))
                .orElseThrow(() -> new NoSuchClubException("No such member with email: " + memberId));

        TravelClub club = clubStore.retrieve(membershipDto.getClubId());
        for (ClubMembership membership : club.getMembershipList()) {
            if (memberId.equals(membership.getMemberEmail())) {
                throw new MemberDuplicationException("Member already exists in the club -->" + memberId);
            }
        }

        ClubMembership clubMembership = membershipDto.toMembership();
        club.getMembershipList().add(clubMembership);
        membershipStore.create(clubMembership);
//        clubStore.update(club);
//        member.getMembershipList().add(clubMembership);
//        memberStore.update(member);
    }

    @Override
    public ClubMembershipDto findMembershipIn(String clubId, String memberId) {
        TravelClub club = clubStore.retrieve(clubId);
        ClubMembership membership = getMembershipIn(club, memberId);

        return new ClubMembershipDto(membership);
    }

    @Override
    public List<ClubMembershipDto> findAllMembershipsIn(String clubId) {
        return membershipStore.retrieveById(clubId).stream()
                .map(membership -> new ClubMembershipDto(membership))
                .collect(Collectors.toList());
    }

    @Override
    public void modifyMembership(String clubId, ClubMembershipDto newMembership) {
        String targetEmail = newMembership.getMemberEmail();
        RoleInClub newRole = newMembership.getRole();

        TravelClub targetClub = clubStore.retrieve(clubId);
        ClubMembership membershipOfClub = getMembershipIn(targetClub, targetEmail);
        membershipOfClub.setRole(newRole);
        clubStore.update(targetClub);

        CommunityMember targetMember = memberStore.retrieve(targetEmail);
        targetMember.getMembershipList().stream().forEach(membershipOfMember -> {
            if(membershipOfClub.getClubId().equals(clubId)){
                membershipOfClub.setRole(newRole);
            }
        });

        memberStore.update(targetMember);
    }

    @Override
    public void removeMembership(String clubId, String memberId) {
        TravelClub foundClub = clubStore.retrieve(clubId);
        CommunityMember foundMember = memberStore.retrieve(memberId);
        ClubMembership clubMembership = getMembershipIn(foundClub, memberId);

        foundClub.getMembershipList().remove(clubMembership);
        clubStore.update(foundClub);
        foundMember.getMembershipList().remove(clubMembership);
        memberStore.update(foundMember);
    }

    private ClubMembership getMembershipIn(TravelClub club, String memberEmail) {
        for( ClubMembership membership : club.getMembershipList()){
            if(memberEmail.equals(membership.getMemberEmail()))
                return membership;
        }

        String message = String.format("No such member[email:%s] in club[name:%s]", memberEmail, club.getName());
        throw new NoSuchMemberException(message);
    }
}
