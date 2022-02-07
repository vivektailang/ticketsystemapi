package com.vis.api.ticket.model;

import java.util.List;

public class InfoModel {
	private String subject;
	private String desc;
	private List<InfoDetails> details;

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public List<InfoDetails> getDetails() {
		return details;
	}

	public void setDetails(List<InfoDetails> details) {
		this.details = details;
	}

}
