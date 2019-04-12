package com.example.bloomandroid;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;

public class BloomApiBuilder {


    List<EventDTO> mEvents;
    Retrofit retrofit;


    public BloomApiBuilder(String hostname) {
        retrofit = new Retrofit.Builder().baseUrl(hostname).build();
    }

    public List<EventDTO> getEvents(){
        BloomService bloomService  = retrofit.create(BloomService.class);
        Call<List<EventDTO>> callSync = bloomService.getEvents();
        try {
            Response<List<EventDTO>> response = callSync.execute();
            mEvents = response.body();
        }catch (Exception e){

        }

        return mEvents;
    }
}
