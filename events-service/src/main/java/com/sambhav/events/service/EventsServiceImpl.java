package com.sambhav.events.service;

import com.sambhav.events.dal.models.Event;
import com.sambhav.events.dal.repos.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EventsServiceImpl implements EventsService{
	
	@Autowired
	private EventRepository eventRepository;
	
	@Override
	public Optional<Event> getEventDetails(String eventid) {
		Optional<Event> event = eventRepository.findById(eventid);
		return event;
	}
}
