package com.example.bloomandroid.utils;

import android.util.Log;

import com.example.bloomandroid.dto.EventDTO;
import com.example.bloomandroid.dto.mapper.EventMapper;
import com.example.bloomandroid.models.Event;
import com.example.bloomandroid.services.BloomService;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class BloomApiBuilder {


    BloomService bloomService;
    private static BloomApiBuilder instance;

    public static BloomApiBuilder getInstance() {
        if (instance == null) {
            instance = new BloomApiBuilder();
        }
        return instance;
    }

    public BloomApiBuilder() {
        Retrofit retrofit = new Retrofit.Builder().baseUrl( "http://192.168.1.71:3000").addConverterFactory(GsonConverterFactory.create()).build();
        bloomService = retrofit.create(BloomService.class);
    }

    public void getEvents(final Listener<List<Event>> listener) {
        Log.d("Test", "dedans");
        bloomService.getEvents().enqueue(new Callback<List<EventDTO>>() {

            @Override
            public void onResponse(Call<List<EventDTO>> call, Response<List<EventDTO>> response) {
                List<EventDTO> eventDTOList = response.body();
                List<Event> eventList = EventMapper.map(eventDTOList);
                Log.d("Test", "success");

                listener.onSuccess(eventList);
            }

            @Override
            public void onFailure(Call<List<EventDTO>> call, Throwable t) {
                listener.onError(t);
                Log.d("Test", "error");
            }
        });



    }

    public interface Listener<T> {
        void onSuccess(T data);

        void onError(Throwable t);
    }


}
