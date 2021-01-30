package io.namoosori.travelclub.store;

import java.util.List;

import org.springframework.stereotype.Repository;

import io.namoosori.travelclub.entity.club.ClubMembership;
import io.namoosori.travelclub.store.mapper.MembershipMapper;

@Repository
public class MembershipMariaStore implements MembershipStore{

	private final MembershipMapper membershipMapper;
	
	public MembershipMariaStore(MembershipMapper membershipMapper) {
		this.membershipMapper = membershipMapper;
	}
	
	@Override
	public void create(ClubMembership membership) {
		// TODO Auto-generated method stub
		membershipMapper.create(membership);
	}

	@Override
	public ClubMembership retrieve(String email) {
		// TODO Auto-generated method stub
		return membershipMapper.retrieve(email);
	}

	@Override
	public List<ClubMembership> retrieveById(String clubId) {
		// TODO Auto-generated method stub
		return membershipMapper.retrieveById(clubId);
	}

	@Override
	public List<ClubMembership> retrieveByEmail(String memberEmail) {
		// TODO Auto-generated method stub
		return membershipMapper.retrieveByEmail(memberEmail);
	}

	@Override
	public void update(ClubMembership membership) {
		// TODO Auto-generated method stub
		membershipMapper.update(membership);
	}

	@Override
	public void delete(String clubId) {
		// TODO Auto-generated method stub
		membershipMapper.delete(clubId);
	}

	@Override
	public boolean exists(String clubId) {
		// TODO Auto-generated method stub
		return membershipMapper.retrieveById(clubId).size() > 0 ? true : false;
	}

}
