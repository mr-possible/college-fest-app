package com.sambhav.events.controllers;

import com.sambhav.events.service.EventsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/events")
public class EventsController {
	
	@Autowired
	private EventsService eventsService;
	
	@RequestMapping
	public String viewAllEvents() {
		return "events";
	}
	
	@GetMapping("/eventdetail/{eventid}")
	public String getEventDetails(@PathVariable String eventid) {
		System.out.println("$$$$ " + eventsService.getEventDetails(eventid).toString() + " $$$$");
		return "eventdetails";
	}
}
