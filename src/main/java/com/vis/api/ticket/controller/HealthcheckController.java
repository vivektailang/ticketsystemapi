package com.vis.api.ticket.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
@CrossOrigin
public class HealthcheckController {
	@CrossOrigin @RequestMapping(value="/healthcheck",method=RequestMethod.GET,produces={"application/json"})
	public ResponseEntity<?> healtchcheck() {
		
		return ResponseEntity.ok().body("Success");
	}
}
