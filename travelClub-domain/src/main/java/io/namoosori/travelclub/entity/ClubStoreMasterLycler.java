package io.namoosori.travelclub.entity;

import io.namoosori.travelclub.store.ClubStore;
import io.namoosori.travelclub.store.ClubStoreLycler;
import io.namoosori.travelclub.store.MemberStore;
import io.namoosori.travelclub.store.MembershipStore;

public class ClubStoreMasterLycler implements ClubStoreLycler {
    private static ClubStoreLycler lycler;

    private ClubStoreMasterLycler(){}

    public static ClubStoreLycler getInstance(){

        //ClubStoreMariaLycler are 2, so u can convert each Lycler;
        //Check directory plz.
        if(lycler == null)
            lycler = new ClubStoreMasterLycler();

        return lycler;
    }

    @Override
    public MemberStore requestMemberStore() {
        return lycler.requestMemberStore();
    }

    @Override
    public ClubStore requestClubStore() {
        return lycler.requestClubStore();
    }

	@Override
	public MembershipStore requsetMembershipStore() {
		// TODO Auto-generated method stub
		return lycler.requsetMembershipStore();
	}
}
