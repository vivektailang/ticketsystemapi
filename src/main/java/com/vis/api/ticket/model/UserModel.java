package com.vis.api.ticket.model;

import java.util.List;

public class UserModel {
	private String userId;
	private String userRole;
	private String userPosition;
	private List<UserNotifications> notifications;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserRole() {
		return userRole;
	}

	public void setUserRole(String userRole) {
		this.userRole = userRole;
	}

	public String getUserPosition() {
		return userPosition;
	}

	public void setUserPosition(String userPosition) {
		this.userPosition = userPosition;
	}

	public List<UserNotifications> getNotifications() {
		return notifications;
	}

	public void setNotifications(List<UserNotifications> notifications) {
		this.notifications = notifications;
	}

}
