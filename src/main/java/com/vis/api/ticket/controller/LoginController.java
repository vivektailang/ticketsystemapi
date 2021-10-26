package com.vis.api.ticket.controller;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.vis.api.ticket.model.LoginModel;
import com.vis.api.ticket.model.TokenModel;
import com.vis.api.ticket.services.LoginService;

@RestController
@RequestMapping("/ticket")
@CrossOrigin
public class LoginController {
	
	@Autowired
	LoginService loginService;
	
	@RequestMapping(value = "/login", method =  RequestMethod.POST)
	public ResponseEntity<?> doLogin() {
		return ResponseEntity.ok().body("Login Success");
	}

	@CrossOrigin
	@RequestMapping(value = "/token", method = RequestMethod.POST, produces = { "application/json" }, consumes = {
			"application/json" })
	public ResponseEntity<?> generateToken(@RequestBody LoginModel credentials) {
		TokenModel token = new TokenModel();
		
		if(credentials.getUsername()!=null && credentials.getPassword()!=null) {
			token.setToken(this.loginService.generateToken(credentials.getUsername(), credentials.getPassword()));
		} else {
			token.setToken(null);
		}
		return ResponseEntity.ok().body(token);
	}
		
	
}
