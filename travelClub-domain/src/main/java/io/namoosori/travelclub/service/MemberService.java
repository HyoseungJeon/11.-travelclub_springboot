package io.namoosori.travelclub.service;

import io.namoosori.travelclub.util.InvalidEmailException;
import io.namoosori.travelclub.service.dto.MemberDto;

import java.util.List;

public interface MemberService {
    public void register(MemberDto memberDto) throws InvalidEmailException;
    public MemberDto find(String memberId);
    public List<MemberDto> findByName(String memberName);
    public void modify(MemberDto memberDto) throws InvalidEmailException;
    public void remove(String memberId);
}
