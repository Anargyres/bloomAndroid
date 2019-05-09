package com.example.bloomandroid.event.domain.service;

import com.example.bloomandroid.event.domain.data.EventDTO;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface BloomService {

    @GET("/events")
    Call<List<EventDTO>> getEvents();
}
