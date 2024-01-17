package com.mdbytes.club.dto.mapper;

import com.mdbytes.club.dto.EventDto;
import com.mdbytes.club.model.Event;

public class EventMapper {

    public static Event mapToEvent(EventDto eventDto) {
        return Event.builder()
                .eventId(eventDto.getEventId())
                .name(eventDto.getName())
                .startTime(eventDto.getStartTime())
                .endTime(eventDto.getEndTime())
                .type(eventDto.getType())
                .photoUrl(eventDto.getPhotoUrl())
                .club(eventDto.getClub())
                .createdOn(eventDto.getCreatedOn())
                .updatedOn(eventDto.getUpdatedOn())
                .build();


    }

    public static EventDto mapToEventDto(Event event) {
        return EventDto.builder()
                .eventId(event.getEventId())
                .name(event.getName())
                .startTime(event.getStartTime())
                .endTime(event.getEndTime())
                .type(event.getType())
                .photoUrl(event.getPhotoUrl())
                .club(event.getClub())
                .createdOn(event.getCreatedOn())
                .updatedOn(event.getUpdatedOn())
                .build();

    }
}
