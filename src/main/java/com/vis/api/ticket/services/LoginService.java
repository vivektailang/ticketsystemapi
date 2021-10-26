package com.vis.api.ticket.services;

import java.util.UUID;

import org.springframework.stereotype.Service;

@Service
public class LoginService {
	public String generateToken(String username, String password) {
		String token = null;
		token = UUID.randomUUID().toString();
		return token;
	}
	
	public Boolean checkTokenForSession(String token) {
		return true;
	}
}
