package com.vis.api.ticket.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.vis.api.ticket.model.InfoDetails;
import com.vis.api.ticket.model.InfoModel;
import com.vis.api.ticket.model.UserModel;
import com.vis.api.ticket.model.UserNotifications;

@Service
public class InformationService {
	public InfoModel home() {
		InfoModel info = new InfoModel();
		info.setSubject("Welcome to VIS Ticket System - Notifications");
		info.setDesc(
				"Power up your customer support with VIS Ticket Systems. Help desk software trusted by multiple business industries. Only for Organizational Level announcements.");
		List<InfoDetails> details = new ArrayList<>();
		InfoDetails infodetails = new InfoDetails();
		infodetails.setId("Circular - 2021-OCT-10-PXY123");
		infodetails.setDesc("Organization level changes announcement - Live meeting with CEO at 20:20 IST.");
		details.add(infodetails);

		InfoDetails infodetails1 = new InfoDetails();
		infodetails1.setId("Circular - 2021-OCT-10-HOLIDAY5654");
		infodetails1.setDesc("Total service request solved = 90.");
		details.add(infodetails1);

		InfoDetails infodetails2 = new InfoDetails();
		infodetails2.setId("Meesage - 2021-OCT-10-LEAVE786");
		infodetails2.setDesc("Upcoming Holiday - 4th Nov 2021 - Diwali");
		details.add(infodetails2);

		info.setDetails(details);

		return info;
	}
	
	public UserModel userdetails(String userid) {

		UserModel user = new UserModel();
		
		user.setUserId(userid);
		user.setUserPosition("Team Lead");
		user.setUserRole("Support");
		
		List<UserNotifications> notifications = new ArrayList<>();
		
		UserNotifications note1 = new UserNotifications();
		note1.setId(userid);
		note1.setSubject("Planned Holidays 2021");
		note1.setDesc("Please check holiday calender for the upcoming months in year 2021.");
		notifications.add(note1);
		
		UserNotifications note2 = new UserNotifications();
		note2.setId(userid);
		note2.setSubject("Planned Vacations Nov 2021");
		note2.setDesc("Please get approve your leaves from your supervisor in Nov months for year 2021.");
		notifications.add(note2);
		
		user.setNotifications(notifications);
		
		return user;
	}
}
