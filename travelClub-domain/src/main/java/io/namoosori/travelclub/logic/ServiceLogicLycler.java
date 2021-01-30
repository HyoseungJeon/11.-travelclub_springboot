package io.namoosori.travelclub.logic;


import io.namoosori.travelclub.service.*;

public class ServiceLogicLycler implements ServiceLycler {

    private static ServiceLycler lycler;

    private ClubService clubService;
    private MemberService memberService;
    private MembershipService membershipService;

    private ServiceLogicLycler(){

    }

    public synchronized static ServiceLycler shareInstance(){
        if(lycler == null){
            lycler = new ServiceLogicLycler();
        }

        return lycler;
    }

    @Override
    public ClubService createClubService() {
        if (clubService == null) {
            clubService = new ClubServiceLogic();
        }
        return clubService;
    }

    @Override
    public MemberService createMemberService() {
        if (memberService == null) {
            memberService = new MemberServiceLogic();
        }

        return memberService;
    }


    @Override
    public MembershipService createMembershipService() {
        if (membershipService == null) {
            membershipService = new MembershipServiceLogic();
        }

        return membershipService;
    }
}
