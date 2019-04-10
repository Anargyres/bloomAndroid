package com.esgi.damien.bloom;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class EventsAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private ArrayList<EventDTO> mEventList;
    private TextView eventTitle;

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
       viewType = LayoutInflater.from(parent.getContext()).inflate(R.layout.event_cell,parent);
        return null;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        eventTitle.findViewById(R.id.eventTitle);


    }

    @Override
    public int getItemCount() {
        return mEventList.size();
    }
}
