package com.sambhav.events.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/events")
public class EventsController {
	
	@RequestMapping
	public String viewAllEvents() {
		return "events";
	}
	
	@RequestMapping("/eventdetail/{eventid}")
	public String getEventDetails(@RequestParam("eventid") String eventid) {
		// TODO : Create 'eventdetails' view.
		return "eventdetails";
	}
}
