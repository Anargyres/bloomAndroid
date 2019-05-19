package com.example.bloomandroid.services;

import com.example.bloomandroid.dto.EventDTO;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface BloomService {

    @GET("/events")
    Call<List<EventDTO>> getEvents();
}
