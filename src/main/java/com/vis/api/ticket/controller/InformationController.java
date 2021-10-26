package com.vis.api.ticket.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.vis.api.ticket.model.InfoModel;

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
}
