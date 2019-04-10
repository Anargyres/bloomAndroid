package com.esgi.damien.bloom;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface BloomService {

    @GET("/")
    Call<List<EventDTO>> getEvents();
}
