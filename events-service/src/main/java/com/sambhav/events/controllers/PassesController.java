package com.sambhav.events.controllers;

import com.sambhav.events.dal.models.Event;
import com.sambhav.events.service.EventsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
public class PassesController {
	
	@Autowired
	private EventsService eventsService;
	
	@PostMapping( "/confirm-pass-details")
	public String confirmBuyPass(@RequestParam("event-id") String eventid, Model model) {
		Optional<Event> event = eventsService.getEventDetails(eventid);
		model.addAttribute("event", event);
		System.out.println("%%%%%%%%%%%%%%%%%%%%" + eventid);
		return "confirm-pass-details";
	}
}
