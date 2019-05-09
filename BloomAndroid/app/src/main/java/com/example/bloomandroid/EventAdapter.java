package com.example.bloomandroid;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.bloomandroid.event.domain.model.Event;

import java.util.List;

public class EventAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private List<Event> mEventList;

    public void setEventList(List<Event> eventList) {
        this.mEventList = eventList;
        notifyDataSetChanged();
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemLayoutView = LayoutInflater.from(parent.getContext()).inflate(R.layout.event_cell, parent);
        return new ViewHolder(itemLayoutView);
    }

    @Override
    public int getItemCount() {
        return mEventList != null ? mEventList.size() : 0;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        Event event = mEventList.get(position);
        ((ViewHolder) holder).eventTitle.setText(event.getTitle());

        Glide.with(holder.itemView).load(event.getImageURl()).into(((ViewHolder) holder).eventImage);
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
