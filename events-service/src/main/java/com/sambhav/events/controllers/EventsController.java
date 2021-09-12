package com.sambhav.events.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api/events")
public class EventsController {
	
	@RequestMapping("/viewallevents")
	public String viewAllEvents() {
		return "index";
	}
	
}
