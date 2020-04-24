package com.capstone.FMS.FeedbackManagementSystem.Model;

import java.util.Date;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table("event")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Event {
	@Id
	private int id;
	private String event_id;
	private String base_location;
	private String beneficiary_name;
	private String council_name;
	private String event_name;
	private String event_description;
	private Date event_date;
	private String employee_id;
	private String employee_name;
	private int volunteer_hours;
	private int travel_hours;
	private int lives_impacted;
	private String business_unit;
	private String event_status;
	private String iiep_category;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEvent_id() {
		return event_id;
	}

	public void setEvent_id(String event_id) {
		this.event_id = event_id;
	}

	public String getBase_location() {
		return base_location;
	}

	public void setBase_location(String base_location) {
		this.base_location = base_location;
	}

	public String getBeneficiary_name() {
		return beneficiary_name;
	}

	public void setBeneficiary_name(String beneficiary_name) {
		this.beneficiary_name = beneficiary_name;
	}

	public String getCouncil_name() {
		return council_name;
	}

	public void setCouncil_name(String council_name) {
		this.council_name = council_name;
	}

	public String getEvent_name() {
		return event_name;
	}

	public void setEvent_name(String event_name) {
		this.event_name = event_name;
	}

	public String getEvent_description() {
		return event_description;
	}

	public void setEvent_description(String event_description) {
		this.event_description = event_description;
	}

	public Date getEvent_date() {
		return event_date;
	}

	public void setEvent_date(Date event_date) {
		this.event_date = event_date;
	}

	public String getEmployee_id() {
		return employee_id;
	}

	public void setEmployee_id(String employee_id) {
		this.employee_id = employee_id;
	}

	public String getEmployee_name() {
		return employee_name;
	}

	public void setEmployee_name(String employee_name) {
		this.employee_name = employee_name;
	}

	public int getVolunteer_hours() {
		return volunteer_hours;
	}

	public void setVolunteer_hours(int volunteer_hours) {
		this.volunteer_hours = volunteer_hours;
	}

	public int getTravel_hours() {
		return travel_hours;
	}

	public void setTravel_hours(int travel_hours) {
		this.travel_hours = travel_hours;
	}

	public int getLives_impacted() {
		return lives_impacted;
	}

	public void setLives_impacted(int lives_impacted) {
		this.lives_impacted = lives_impacted;
	}

	public String getBusiness_unit() {
		return business_unit;
	}

	public void setBusiness_unit(String business_unit) {
		this.business_unit = business_unit;
	}

	public String getEvent_status() {
		return event_status;
	}

	public void setEvent_status(String event_status) {
		this.event_status = event_status;
	}

	public String getIiep_category() {
		return iiep_category;
	}

	public void setIiep_category(String iiep_category) {
		this.iiep_category = iiep_category;
	}
}
