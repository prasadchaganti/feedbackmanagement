package com.capstone.FMS.FeedbackManagementSystem.Model;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Table("events_list")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class EventList {
	@Id
	private int id;
	private String event_id;
	private String month;
	private String base_location;
	private String beneficiary_name;
	private String council_name;
	private String event_name;
	private Date event_date;
	private String venue_address;
	private int total_volunteers;
	private int total_volunteer_hours;
	private int travel_hours;
	private String business_unit;
	private String event_status;
}
