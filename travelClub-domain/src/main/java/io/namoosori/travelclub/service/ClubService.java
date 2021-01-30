package io.namoosori.travelclub.service;

import io.namoosori.travelclub.service.dto.ClubMembershipDto;
import io.namoosori.travelclub.service.dto.TravelClubDto;

import java.util.List;

public interface ClubService {
    public void registerClub(TravelClubDto clubDto);
    public TravelClubDto findClub(String clubId);
    public TravelClubDto findClubByName(String name);
    public void modify(TravelClubDto clubDto);
    public void remove(String clubId);
}
