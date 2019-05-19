package com.example.bloomandroid.views;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.bloomandroid.utils.BloomApiBuilder;
import com.example.bloomandroid.dto.EventAdapter;
import com.example.bloomandroid.R;
import com.example.bloomandroid.models.Event;

import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {


    private EventAdapter eventAdapter;
    private RecyclerView recyclerView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        loadData();
        return inflater.inflate(R.layout.fragment_home, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        recyclerView = view.findViewById(R.id.eventsRecyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        eventAdapter = new EventAdapter();
        recyclerView.setAdapter(eventAdapter);
    }

    private void loadData() {
        BloomApiBuilder.getInstance().getEvents(new BloomApiBuilder.Listener<List<Event>>() {
            @Override
            public void onSuccess(List<Event> data) {
                eventAdapter.setEventList(data);
            }

            @Override
            public void onError(Throwable t) {
                t.getMessage();
                Log.d("Faili", t.getMessage());
            }
        });
    }


}
