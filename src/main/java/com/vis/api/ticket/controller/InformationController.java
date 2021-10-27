package com.vis.api.ticket.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.vis.api.ticket.model.InfoModel;
import com.vis.api.ticket.model.UserModel;
import com.vis.api.ticket.model.UserNotifications;

@RestController
@RequestMapping("/information")
@CrossOrigin
public class InformationController {
	
	@CrossOrigin
	@RequestMapping(value = "/home", method = RequestMethod.GET, produces = { "application/json" }, consumes = {
			"application/json" })
	public ResponseEntity<?> home() {
		InfoModel info = new InfoModel();
		info.setSubject("Welcome to VIS Ticket System - Notifications");
		info.setDesc("Power up your customer support with VIS Ticket Systems. Help desk software trusted by over 160,000 businesses."
				+ "\n	Total service request solved = 90."
				+ "\n	Upcoming Holiday - 4th Nov 2021 - Diwali");
		
		return ResponseEntity.ok().body(info);
	}
	
	@CrossOrigin
	@RequestMapping(value = "/user/{userid}", method = RequestMethod.GET, produces = { "application/json" }, consumes = {
			"application/json" })
	public ResponseEntity<?> userdetails(@PathVariable String userid) {
		UserModel user = new UserModel();
		
		List<UserNotifications> notifications = new ArrayList<>();
		
		UserNotifications note1 = new UserNotifications();
		note1.setId("1");
		note1.setSubject("Planned Holidays 2021");
		note1.setDesc("Please check holiday calender for the upcoming months in year 2021.");
		notifications.add(note1);
		
		UserNotifications note2 = new UserNotifications();
		note2.setId("1");
		note2.setSubject("Planned Vacations Nov 2021");
		note2.setDesc("Please get approve your leaves from your supervisor in Nov months for year 2021.");
		notifications.add(note2);
		
		user.setNotifications(notifications);
		
		return ResponseEntity.ok().body(user);
	}	
}
