package io.namoosori.travelclub.store;

import java.util.List;

import io.namoosori.travelclub.entity.club.TravelClub;

public interface ClubStore {

    public String create(TravelClub club);
    public TravelClub retrieve(String clubId);
    public List<TravelClub> retrieveByName(String name);
    public void update(TravelClub club);
    public void delete(String clubId);

    public boolean exists(String clubId);
}
