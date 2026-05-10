package com.rafue.hackathon_booking.model;

public class Hackathon {
    private String title;
    private String description;
    private String location;
    private int maxParticipants;

    public Hackathon() {}

    public Hackathon(String title, String description, String location, int maxParticipants){
        this.title = title;
        this.description = description;
        this.location = location;
        this.maxParticipants = maxParticipants;
    }

    public String getTitle(){
        return title;
    }

    public String getDescription(){
        return description;
    }

    public String getLocation(){
        return location;
    }

    public int getMaxParticipants(){
        return maxParticipants;
    }
}
