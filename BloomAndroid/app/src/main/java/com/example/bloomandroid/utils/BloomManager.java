package com.example.bloomandroid.utils;

import com.example.bloomandroid.utils.BloomApiBuilder;

public class BloomManager {


    public static final String hostname = "http://localhost:3000";
    BloomApiBuilder bloomApiBuilder;

    public BloomManager() {
        bloomApiBuilder = new BloomApiBuilder();
    }

   /* public List<EventDTO> getEvents() {
        return bloomApiBuilder.getEvents(BloomApiBuilder.Listener < List < Event >> );
    }*/
}
