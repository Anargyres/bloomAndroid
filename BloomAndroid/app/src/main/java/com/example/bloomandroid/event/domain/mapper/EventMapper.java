package com.example.bloomandroid.event.domain.mapper;

import com.example.bloomandroid.event.domain.data.EventDTO;
import com.example.bloomandroid.event.domain.model.Event;

import java.util.ArrayList;
import java.util.List;

public class EventMapper {

    public static List<Event> map(List<EventDTO> eventDTOlist) {
        List<Event> eventList = new ArrayList<>();
        for (EventDTO eventDTO : eventDTOlist) {
            eventList.add(map(eventDTO));
        }
        return eventList;
    }

    private static Event map(EventDTO eventDTO) {
        Event event = new Event();
        event.setTitle(eventDTO.getTitle());
        event.setDescription(eventDTO.getDescripttion());
        event.setImageURl(eventDTO.getImage());
        return event;
    }
}
