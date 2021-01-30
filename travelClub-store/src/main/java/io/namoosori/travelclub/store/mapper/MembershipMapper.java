package io.namoosori.travelclub.store.mapper;

import io.namoosori.travelclub.entity.club.ClubMembership;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MembershipMapper {
    void create(ClubMembership membership);
    public ClubMembership retrieve(String email);
    public List<ClubMembership> retrieveById(String clubId);
    public List<ClubMembership> retrieveByEmail(String memberEmail);
    public void update(ClubMembership membership);
    public void delete(String clubId);

    public boolean exists(String clubId);
}
