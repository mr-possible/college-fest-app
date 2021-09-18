package com.sambhav.events.controllers;

import com.sambhav.events.dal.models.Event;
import com.sambhav.events.service.EventsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/events")
public class EventsController {
	
	@Autowired
	private EventsService eventsService;
	
	@GetMapping
	public String viewAllEvents(Model model) {
		List<Event> allEvents = eventsService.getAllEventDetails();
		model.addAttribute("events", allEvents);
		return "events";
	}
	
	@GetMapping("/eventdetail/{eventid}")
	public String getEventDetails(@PathVariable String eventid, Model model) {
		Optional<Event> event = eventsService.getEventDetails(eventid);
		model.addAttribute("event", event);
		return "eventdetails";
	}
}
