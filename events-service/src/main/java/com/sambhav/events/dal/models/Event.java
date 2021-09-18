package com.sambhav.events.dal.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "eventstable")
public class Event {
	
	@Id
	private String eventid;
	private String eventcategory;
	private String eventname;
	private String eventdesc;
	private String eventdate;
	private String eventtime;
	private String eventvenue;
	private String eventorganiser;
	private String eventorganisercontact;
	private String eventfee;
	
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
	
	public String getEventname() {
		return eventname;
	}
	
	public void setEventname(String eventname) {
		this.eventname = eventname;
	}
	
	public String getEventdesc() {
		return eventdesc;
	}
	
	public void setEventdesc(String eventdescr) {
		this.eventdesc = eventdescr;
	}
	
	public String getEventdate() {
		return eventdate;
	}
	
	public void setEventdate(String eventdate) {
		this.eventdate = eventdate;
	}
	
	public String getEventvenue() {
		return eventvenue;
	}
	
	public void setEventvenue(String eventvenue) {
		this.eventvenue = eventvenue;
	}
	
	public String getEventorganiser() {
		return eventorganiser;
	}
	
	public void setEventorganiser(String eventorganiser) {
		this.eventorganiser = eventorganiser;
	}
	
	public String getEventorganisercontact() {
		return eventorganisercontact;
	}
	
	public void setEventorganisercontact(String eventorganisercontact) {
		this.eventorganisercontact = eventorganisercontact;
	}
	
	public String getEventtime() {
		return eventtime;
	}
	
	public void setEventtime(String eventtime) {
		this.eventtime = eventtime;
	}

	public String getEventfee() {
		return eventfee;
	}
	
	public void setEventfee(String eventfee) {
		this.eventfee = eventfee;
	}
	
	@Override
	public String toString() {
		return "Event{" +
			"eventid='" + eventid + '\'' +
			", eventcategory='" + eventcategory + '\'' +
			", eventname='" + eventname + '\'' +
			", eventdesc='" + eventdesc + '\'' +
			", eventdate='" + eventdate + '\'' +
			", eventtime='" + eventtime + '\'' +
			", eventvenue='" + eventvenue + '\'' +
			", eventorganiser='" + eventorganiser + '\'' +
			", eventorganisercontact='" + eventorganisercontact + '\'' +
			", eventfee='" + eventfee + '\'' +
			'}';
	}
}
