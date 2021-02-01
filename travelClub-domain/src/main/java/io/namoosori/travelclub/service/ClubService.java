package io.namoosori.travelclub.service;


import java.util.List;

import io.namoosori.travelclub.service.dto.TravelClubDto;

public interface ClubService {
    public void registerClub(TravelClubDto clubDto);
    public TravelClubDto findClub(String clubId);
    public List<TravelClubDto> findClubByName(String name);
    public void modify(TravelClubDto clubDto);
    public void remove(String clubId);
}
