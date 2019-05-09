package com.example.bloomandroid.event.presentation.presenter;

import com.example.bloomandroid.utils.BloomManager;
import com.example.bloomandroid.event.presentation.contract.IEventPresenter;

public class EventPresenter implements IEventPresenter {

    BloomManager bloomManager;


    public EventPresenter() {
        bloomManager = new BloomManager();
    }



    /*public List<EventDTO> getEvents(){
        return bloomManager.getEvents();
    }*/



}
