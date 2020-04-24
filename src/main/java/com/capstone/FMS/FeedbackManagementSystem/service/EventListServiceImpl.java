package com.capstone.FMS.FeedbackManagementSystem.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import reactor.core.publisher.Flux;

import com.capstone.FMS.FeedbackManagementSystem.Model.EventList;
import com.capstone.FMS.FeedbackManagementSystem.Repository.EventListRepository;

@Service
public class EventListServiceImpl implements EventsListService {

	@Autowired
	public EventListRepository eventListRepo;
	
	@Override
	public Flux<EventList> getAllEventList() {
		Flux<EventList> events = eventListRepo.findAll();
		return events;
	}

}
