package io.namoosori.travelclub.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.namoosori.travelclub.service.MemberService;
import io.namoosori.travelclub.service.dto.MemberDto;

@RestController
@RequestMapping("/CommunityMember")
public class CommunityMemberController {
	private final MemberService memberService;
	
	public CommunityMemberController(MemberService memberService) {
		this.memberService = memberService;
	}
	
	@PostMapping("/register")
	public void register(@RequestBody MemberDto memberDto) {
		memberService.register(memberDto);
	}
	
	@GetMapping("/find")
    public MemberDto find(@RequestParam String memberId) {
		return memberService.find(memberId);
    }
	
	@GetMapping("/find-by-name")
    public List<MemberDto> findByName(@RequestParam String memberName){
		return memberService.findByName(memberName);
	}
	
	@PutMapping("/update")
    public void modify(@RequestBody MemberDto memberDto) {
		memberService.modify(memberDto);
	}
	
	@DeleteMapping("/remove")
    public void remove(@RequestParam String memberId) {
		memberService.remove(memberId);
	}
}
