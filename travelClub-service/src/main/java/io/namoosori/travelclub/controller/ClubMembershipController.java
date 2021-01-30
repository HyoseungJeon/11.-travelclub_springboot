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

import io.namoosori.travelclub.service.MembershipService;
import io.namoosori.travelclub.service.dto.ClubMembershipDto;

@RestController
@RequestMapping("/ClubMembership")
public class ClubMembershipController {
	
	private final MembershipService membershipService;
	
	public ClubMembershipController(MembershipService membershipService) {
		this.membershipService = membershipService;
	}

	@PostMapping("/register")
	public void register(@RequestBody ClubMembershipDto membershipDto) {
		membershipService.addMembership(membershipDto);
	}
	
	@GetMapping("/find")
	public ClubMembershipDto find(@RequestParam String clubId, String memberId) {
		return membershipService.findMembershipIn(clubId, memberId);
	}
	
	@GetMapping("/find-all")
	public List<ClubMembershipDto> findByName(@RequestParam String clubId){
		return membershipService.findAllMembershipsIn(clubId);
	}
	
	@PutMapping("/update")
	public void update(@RequestBody String clubId, ClubMembershipDto member){
		membershipService.modifyMembership(clubId, member);
	}
	
	@DeleteMapping("/remove")
	public void remove(@RequestParam String clubId, String memberId) {
		membershipService.removeMembership(clubId, memberId);
	}
}
