package com.vis.api.ticket.utilities;

import java.util.UUID;

import org.springframework.stereotype.Component;

@Component
public class CommonTrackUtilities {
	
	public String createTrackId() {
		String trackId = UUID.randomUUID().toString();
		return trackId;
	}
	
	public String createTrackId(String ticketId, String issueId) {
		String trackId = ticketId + Constant.SEPARATOR + Constant.ISSUE_FORMAT + Constant.SEPARATOR + issueId;
		return trackId;
	}
}
