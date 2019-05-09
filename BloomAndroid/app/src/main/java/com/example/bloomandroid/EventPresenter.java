package com.example.bloomandroid;

import com.example.bloomandroid.event.domain.data.EventDTO;

import java.util.List;

public class EventPresenter implements IEventPresenter {

    BloomManager bloomManager;


    public EventPresenter() {
        bloomManager = new BloomManager();
    }



    /*public List<EventDTO> getEvents(){
        return bloomManager.getEvents();
    }*/



}
