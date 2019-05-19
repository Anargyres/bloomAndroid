package com.example.bloomandroid.dto.mapper;

import com.example.bloomandroid.dto.EventDTO;
import com.example.bloomandroid.models.Event;

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
