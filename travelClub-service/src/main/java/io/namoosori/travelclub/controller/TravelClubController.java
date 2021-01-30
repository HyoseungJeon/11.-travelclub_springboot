package io.namoosori.travelclub.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.namoosori.travelclub.service.ClubService;
import io.namoosori.travelclub.service.dto.TravelClubDto;

@RestController
@RequestMapping("/TravelClub")
public class TravelClubController {
	private final ClubService clubService;
	
	public TravelClubController(ClubService clubService) {
		this.clubService = clubService;
	}
	
	@PostMapping("/register")
	public void registerClub(@RequestBody TravelClubDto clubDto) {
		clubService.registerClub(clubDto);
	}
	
	@GetMapping("/find")
    public TravelClubDto findClub(@RequestParam String clubId) {
		return clubService.findClub(clubId);
	}
	
	@GetMapping("/find-by-name")
    public TravelClubDto findClubByName(@RequestParam String name) {
		return clubService.findClubByName(name);
	}
	
	@PutMapping("/update")
    public void modify(@RequestBody TravelClubDto clubDto) {
		clubService.modify(clubDto);
	}
	
	@DeleteMapping("remove")
    public void remove(@RequestParam String clubId) {
		clubService.remove(clubId);
	}
	
	@GetMapping("/echo")
	public String echo() {
		return "alive";
		
	}
}
