package com.vis.api.ticket.model.track;


import java.time.LocalDate;

public class TrackModel {
	private String id;
	private String desc;
	private String assigned;
	private String escalation;
	private LocalDate slaDate;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getAssigned() {
		return assigned;
	}

	public void setAssigned(String assigned) {
		this.assigned = assigned;
	}

	public String getEscalation() {
		return escalation;
	}

	public void setEscalation(String escalation) {
		this.escalation = escalation;
	}

	public LocalDate getSlaDate() {
		return slaDate;
	}

	public void setSlaDate(LocalDate slaDate) {
		this.slaDate = slaDate;
	}

	

}
