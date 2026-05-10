package com.rafue.hackathon_booking.model;

public class Booking {
    private String userId;
    private String hackathonId;

    public Booking(){}

    public Booking(String userId, String hackathonId){
        this.userId = userId;
        this.hackathonId = hackathonId;
    }

    public String getUserId(){
        return userId;
    }

    public String getHackathonId(){
        return hackathonId;
    }
}
