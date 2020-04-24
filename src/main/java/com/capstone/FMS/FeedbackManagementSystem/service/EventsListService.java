package com.capstone.FMS.FeedbackManagementSystem.service;

import com.capstone.FMS.FeedbackManagementSystem.Model.EventList;

import reactor.core.publisher.Flux;


public interface EventsListService {
	public Flux<EventList> getAllEventList();
}
