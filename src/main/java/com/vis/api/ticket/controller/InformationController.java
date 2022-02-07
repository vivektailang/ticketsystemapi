package com.vis.api.ticket.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.vis.api.ticket.model.InfoDetails;
import com.vis.api.ticket.model.InfoModel;
import com.vis.api.ticket.model.UserModel;
import com.vis.api.ticket.model.UserNotifications;
import com.vis.api.ticket.services.InformationService;

@RestController
@RequestMapping("/information")
@CrossOrigin
public class InformationController {
	
	@Autowired
	InformationService informationService;
	
	@CrossOrigin
	@RequestMapping(value = "/home", method = RequestMethod.GET, produces = { "application/json" }, consumes = {
			"application/json" })
	public ResponseEntity<?> home() {
		InfoModel info = this.informationService.home();
		return ResponseEntity.ok().body(info);
	}
	
	@CrossOrigin
	@RequestMapping(value = "/user/{userid}", method = RequestMethod.GET, produces = { "application/json" }, consumes = {
			"application/json" })
	public ResponseEntity<?> userdetails(@PathVariable String userid) {
		UserModel user = this.informationService.userdetails(userid);
		return ResponseEntity.ok().body(user);
	}	
}
