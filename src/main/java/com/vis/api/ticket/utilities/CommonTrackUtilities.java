package com.vis.api.ticket.utilities;

import java.util.UUID;

import org.springframework.stereotype.Component;

@Component
public class CommonTrackUtilities {
	public String createTrackId() {
		String trackId = UUID.randomUUID().toString();
		return trackId;
	}
}
