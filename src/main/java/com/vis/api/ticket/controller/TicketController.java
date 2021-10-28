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

import com.vis.api.ticket.model.IssueModel;
import com.vis.api.ticket.model.TicketModel;
import com.vis.api.ticket.services.TicketService;

@RestController
@RequestMapping("/ticket")
@CrossOrigin
public class TicketController {
	
	@Autowired
	TicketService ticketService;
	
	
	@CrossOrigin
	@RequestMapping(value = "/details/{userid}", method = RequestMethod.GET, produces = { "application/json" })
	public ResponseEntity<?> home(@PathVariable String userid) {
		List<TicketModel> ticketList = this.ticketService.getTicket(userid);
		return ResponseEntity.ok().body(ticketList);
	}
}
