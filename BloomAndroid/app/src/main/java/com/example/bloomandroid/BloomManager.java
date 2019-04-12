package com.example.bloomandroid;

import java.util.List;

public class BloomManager {


    String hostname = "http://localhost:3000/";
    BloomApiBuilder bloomApiBuilder;

    public BloomManager() {
        bloomApiBuilder = new BloomApiBuilder(hostname);
    }

    public List<EventDTO> getEvents(){
        return bloomApiBuilder.getEvents();
    }
}
