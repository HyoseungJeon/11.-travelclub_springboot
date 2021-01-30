package io.namoosori.travelclub.store.mapper;

import io.namoosori.travelclub.entity.club.TravelClub;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ClubMapper {
    public String create(TravelClub travelClub);
    public TravelClub retrieve(String clubId);
    public TravelClub retrieveByName(String name);
    public void update(TravelClub travelClub);
    public void delete(String clubId);

    public boolean exists(String clubId);
}
