package com.capstone.FMS.FeedbackManagementSystem.service;

import com.capstone.FMS.FeedbackManagementSystem.Model.Event;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface EventService {
	
	public Flux<Event> getAllEventList();

	public Flux<Event> searchEventsById(String eventId);

	public Flux<Event> searchEventsByVH(int volunteerHours);
	
	public Mono<Event>  findEventById(int id);
	
	public Mono<String> SendMail(String email);

	public void generateExcel();
}
