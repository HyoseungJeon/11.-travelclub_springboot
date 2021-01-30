package io.namoosori.travelclub.store;

import java.util.List;

import org.springframework.stereotype.Repository;

import io.namoosori.travelclub.entity.club.CommunityMember;
import io.namoosori.travelclub.store.mapper.MemberMapper;

@Repository
public class MemberMariaStore implements MemberStore{

	private final MemberMapper memberMapper;
	
	public MemberMariaStore(MemberMapper memberMapper) {
		this.memberMapper = memberMapper;
	}
	
	@Override
	public String create(CommunityMember member) {
		// TODO Auto-generated method stub
		return memberMapper.create(member);
	}

	@Override
	public CommunityMember retrieve(String email) {
		// TODO Auto-generated method stub
		return memberMapper.retrieve(email);
	}

	@Override
	public List<CommunityMember> retrieveByName(String name) {
		// TODO Auto-generated method stub
		return memberMapper.retrieveByName(name);
	}

	@Override
	public void update(CommunityMember member) {
		// TODO Auto-generated method stub
		memberMapper.update(member);
	}

	@Override
	public void delete(String email) {
		// TODO Auto-generated method stub
		memberMapper.delete(email);
	}

	@Override
	public boolean exists(String email) {
		// TODO Auto-generated method stub
		return memberMapper.retrieve(email) != null ? true : false;
	}

}
