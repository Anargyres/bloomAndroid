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

import com.example.bloomandroid.utils.BloomApiBuilder;
import com.example.bloomandroid.event.ui.adapter.EventAdapter;
import com.example.bloomandroid.event.presentation.presenter.EventPresenter;
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

                if(data.isEmpty()){
                    Log.d("prout", "kjzhf");
                }else {
                    eventAdapter.setEventList(data);
                    Log.d("cez", "zedfz");
                    Log.d("image",data.get(1).getTitle());
                }
            }

            @Override
            public void onError(Throwable t) {
                t.getMessage();
                Log.d("Faili", t.getMessage());
            }
        });
    }


}
