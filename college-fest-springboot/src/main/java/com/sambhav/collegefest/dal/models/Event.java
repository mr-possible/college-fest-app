package com.sambhav.collegefest.dal.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "eventstable")
public class Event {
	
	@Id
	private String eventid;
	private String eventcategory;
	
	public String getEventid() {
		return eventid;
	}
	
	public void setEventid(String eventid) {
		this.eventid = eventid;
	}
	
	public String getEventcategory() {
		return eventcategory;
	}
	
	public void setEventcategory(String eventcategory) {
		this.eventcategory = eventcategory;
	}
	
	@Override
	public String toString() {
		return "Event{" +
			"eventid='" + eventid + '\'' +
			", eventcategory='" + eventcategory + '\'' +
			'}';
	}
}
