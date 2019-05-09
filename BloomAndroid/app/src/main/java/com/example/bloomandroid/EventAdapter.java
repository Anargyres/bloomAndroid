package com.example.bloomandroid;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.List;

public class EventAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private List<EventDTO> mEventList;

    public EventAdapter(List<EventDTO> mEventList) {
        this.mEventList = mEventList;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemLayoutView = LayoutInflater.from(parent.getContext()).inflate(R.layout.event_cell, parent);
        ViewHolder viewHolder = new ViewHolder(itemLayoutView);
        return viewHolder;
    }

    @Override
    public int getItemCount() {
        return mEventList.size();
    }

    public EventDTO getItemAtPosition(int position) {
        return mEventList.get(position);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        EventDTO eventDTO = mEventList.get(position);
        ((ViewHolder) holder).eventTitle.setText(eventDTO.title);

        Glide.with(holder.itemView).load(eventDTO.image).into(((ViewHolder) holder).eventImage);
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        public TextView eventTitle;
        public ImageView eventImage;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            eventTitle = itemView.findViewById(R.id.eventTitle);
            eventImage = itemView.findViewById(R.id.eventImage);
        }
    }
}
