package com.sambhav.events.service;

import com.sambhav.events.dal.models.Event;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public interface EventsService {
	
	Optional<Event> getEventDetails(String eventid);
}
