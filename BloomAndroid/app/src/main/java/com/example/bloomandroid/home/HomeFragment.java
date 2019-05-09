package com.example.bloomandroid.home;


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

import com.example.bloomandroid.BloomApiBuilder;
import com.example.bloomandroid.EventAdapter;
import com.example.bloomandroid.EventPresenter;
import com.example.bloomandroid.R;
import com.example.bloomandroid.event.domain.model.Event;

import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {


    public HomeFragment() {
        // Required empty public constructor
    }

    private EventAdapter eventAdapter;
    private RecyclerView recyclerView;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        loadData();

        return inflater.inflate(R.layout.fragment_home, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        EventPresenter eventPresenter = new EventPresenter();
        super.onViewCreated(view, savedInstanceState);
        recyclerView = view.findViewById(R.id.eventsRecyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        eventAdapter = new EventAdapter();
        recyclerView.setAdapter(eventAdapter);
        //rv.setAdapter(new EventAdapter(eventPresenter.getEvents()));


        /*rv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), EventDetailActivity.class);
                intent.putExtra("title", "Soirée 1");
                intent.putExtra("Desc", "blabla");
                startActivity(intent);
            }
        });*/
    }

    private void loadData() {
        BloomApiBuilder.getInstance().getEvents(new BloomApiBuilder.Listener<List<Event>>() {

            @Override
            public void onSuccess(List<Event> data) {
                Log.d("Data", String.valueOf(data));
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
