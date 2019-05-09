package com.example.bloomandroid;

import com.example.bloomandroid.event.domain.data.EventDTO;

import java.util.List;

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
