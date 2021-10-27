package com.vis.api.ticket.model;

import java.util.List;

public class TicketModel {
	private String id;
	private String subject;
	private String desc;
	private String status;
	private String colorStatus;
	private List<IssueModel> issues;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

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

	public List<IssueModel> getIssues() {
		return issues;
	}

	public void setIssues(List<IssueModel> issues) {
		this.issues = issues;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getColorStatus() {
		return colorStatus;
	}

	public void setColorStatus(String colorStatus) {
		this.colorStatus = colorStatus;
	}

}
