package io.namoosori.travelclub.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.namoosori.travelclub.service.ClubService;

@RestController
@RequestMapping("/TravelClub")
public class TravelClubController {
	private final ClubService clubService;
	
	public TravelClubController(ClubService clubService) {
		this.clubService = clubService;
	}
	
	
}
