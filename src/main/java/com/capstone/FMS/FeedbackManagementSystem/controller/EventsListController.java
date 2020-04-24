package com.capstone.FMS.FeedbackManagementSystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Flux;

import com.capstone.FMS.FeedbackManagementSystem.Model.EventList;
import com.capstone.FMS.FeedbackManagementSystem.service.EventsListService;

@RestController
@CrossOrigin("*")
public class EventsListController {

	@Autowired
	private EventsListService eventListService;
	
	@GetMapping("/getEventsList")
	public Flux<EventList> getEvents() {
		return eventListService.getAllEventList();
	}
}
