package com.capstone.FMS.FeedbackManagementSystem.controller;

import java.io.File;
import java.io.IOException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ZeroCopyHttpOutputMessage;
import org.springframework.http.server.reactive.ServerHttpResponse;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.capstone.FMS.FeedbackManagementSystem.Model.Event;
import com.capstone.FMS.FeedbackManagementSystem.service.EventService;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@CrossOrigin("*")
public class EventsController {

	@Autowired
	private EventService eventService;

	@GetMapping("/getEvents")
	public Flux<Event> getEvents() {
		return eventService.getAllEventList();
	}

	@GetMapping("/getEvents/{eventId}")
	public Flux<Event> getEventsById(@PathVariable String eventId) {
		return eventService.searchEventsById(eventId);
	}
	
	@GetMapping("/getEventsById/{id}")
	public Mono<Event> getEventsById(@PathVariable int id) {
		return eventService.findEventById(id);
	}

	@GetMapping("/getEventsByVh/{vh}")
	public Flux<Event> getEventsByVolunteerHours(@PathVariable int vh) {
		return eventService.searchEventsByVH(vh);
	}

	@GetMapping("/sendEmail")
	public Mono<String> sendEmail(@RequestParam String email) {
		return eventService.SendMail(email);
	}
	
	@GetMapping("/downloadExcel")
	public Mono<Void> downloadExcel(ServerHttpResponse response) throws IOException {
		eventService.generateExcel();
		
		ZeroCopyHttpOutputMessage zeroCopyResponse = (ZeroCopyHttpOutputMessage) response;
        response.getHeaders().set(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=Report.xlsx");
        response.getHeaders().setContentType(MediaType.APPLICATION_OCTET_STREAM);

        File file = new File("Report.xlsx");
        return zeroCopyResponse.writeWith(file, 0, file.length());
	}
}
