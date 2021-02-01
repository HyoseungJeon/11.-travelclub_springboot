package io.namoosori.travelclub.store;

import java.util.List;

import org.springframework.stereotype.Repository;

import io.namoosori.travelclub.entity.club.TravelClub;
import io.namoosori.travelclub.store.mapper.ClubMapper;

@Repository
public class ClubMariaStore implements ClubStore{

	private final ClubMapper clubMapper;
	
	public ClubMariaStore(ClubMapper clubMapper) {
		this.clubMapper = clubMapper;
	}
	
	@Override
	public String create(TravelClub club) {
		clubMapper.create(club);
		return club.getName();
	}

	@Override
	public TravelClub retrieve(String clubId) {
		return clubMapper.retrieve(clubId);
	}

	@Override
	public List<TravelClub> retrieveByName(String name) {
		// TODO Auto-generated method stub
		return clubMapper.retrieveByName(name.trim());
	}

	@Override
	public void update(TravelClub club) {
		// TODO Auto-generated method stub
		clubMapper.update(club);
	}

	@Override
	public void delete(String clubId) {
		// TODO Auto-generated method stub
		clubMapper.delete(clubId);
	}

	@Override
	public boolean exists(String clubId) {
		// TODO Auto-generated method stub
		return clubMapper.retrieve(clubId) != null ?  true : false; 
	}

}
