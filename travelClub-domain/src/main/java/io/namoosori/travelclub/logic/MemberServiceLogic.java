package io.namoosori.travelclub.logic;

import io.namoosori.travelclub.entity.ClubStoreMasterLycler;
import io.namoosori.travelclub.entity.club.CommunityMember;
import io.namoosori.travelclub.util.InvalidEmailException;
import io.namoosori.travelclub.service.MemberService;
import io.namoosori.travelclub.service.dto.MemberDto;
import io.namoosori.travelclub.store.MemberStore;
import io.namoosori.travelclub.util.MemberDuplicationException;
import io.namoosori.travelclub.util.NoSuchMemberException;
import io.namoosori.travelclub.util.StringUtil;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class MemberServiceLogic implements MemberService {

    private MemberStore memberStore;

    public MemberServiceLogic(){
//        memberStore = ClubStoreMapLycler.getInstance().requestMemberStore();
        memberStore = ClubStoreMasterLycler.getInstance().requestMemberStore();
    }

    @Override
    public void register(MemberDto memberDto) throws InvalidEmailException {
        String email = memberDto.getEmail();
        Optional.ofNullable(memberStore.retrieve(email))
                .ifPresent(member -> {throw new MemberDuplicationException("Member already exists with email: " + member.getEmail());});
        memberStore.create(memberDto.toMember());
    }

    @Override
    public MemberDto find(String memberEmail) {
        return Optional.ofNullable(memberStore.retrieve(memberEmail))
                .map(member -> new MemberDto(member))
                .orElseThrow(() -> new NoSuchMemberException("No such member with email: " + memberEmail));
    }

    @Override
    public List<MemberDto> findByName(String memberName) {
        List<CommunityMember> members = memberStore.retrieveByName(memberName);
        if(members.isEmpty())
            throw new NoSuchMemberException("No such member with name: "+memberName);

        return members.stream()
                .map(member -> new MemberDto(member))
                .collect(Collectors.toList());
    }

    @Override
    public void modify(MemberDto memberDto) throws InvalidEmailException {
        CommunityMember targetMember = Optional.ofNullable(memberStore.retrieve(memberDto.getEmail()))
                .orElseThrow(() -> new NoSuchMemberException("No such member with email: " + memberDto.getEmail()));

        if(StringUtil.isEmpty(memberDto.getName())){
            memberDto.setName(targetMember.getName());
        }
        if(StringUtil.isEmpty(memberDto.getNickName())){
            memberDto.setNickName(targetMember.getNickName());
        }
        if(StringUtil.isEmpty(memberDto.getPhoneNumber())) {
            memberDto.setPhoneNumber(targetMember.getPhoneNumber());
        }
        if (StringUtil.isEmpty(memberDto.getBirthDay())) {
            memberDto.setBirthDay(targetMember.getBirthDay());
        }

        memberStore.update(memberDto.toMember());
    }

    @Override
    public void remove(String memberId) {

        if(!memberStore.exists(memberId)){
            throw new NoSuchMemberException("No such member with email: " + memberId);
        }
        memberStore.delete(memberId);
    }
}
