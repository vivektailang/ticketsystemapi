package com.vis.api.ticket.services;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vis.api.ticket.model.track.TrackModel;
import com.vis.api.ticket.utilities.CommonTrackUtilities;

@Service
public class TrackService {
	
	@Autowired
	CommonTrackUtilities commonTrackUtilities;
	
	public List<TrackModel> getTracks(String userid) {
		List<TrackModel> tracks = new ArrayList<TrackModel>();
		
		String ticketId = "IN-MP-002";
		String issueId = "001";
		TrackModel track = new TrackModel();
		track.setId("TRC-VIS-US-"+this.commonTrackUtilities.createTrackId(ticketId, issueId));
		track.setDesc("Ticket id "+ticketId+" is in progress.");
		track.setAssigned("Kamlesh Singh");
		track.setEscalation("Aryan Pal");
		
        LocalDate localDate = LocalDate.of(2021, 11, 28);
		track.setSlaDate(localDate);
		
		ticketId = "IN-MP-001";
		issueId = "001";
		TrackModel track2 = new TrackModel();
		track2.setId("TRC-VIS-US-"+this.commonTrackUtilities.createTrackId(ticketId, issueId));
		track2.setDesc("Ticket id "+ticketId+" is Pending from client.");
		track2.setAssigned("Amit Tiwari");
		track2.setEscalation("Aryan Pal");
		
        LocalDate localDate2 = LocalDate.of(2021, 10, 30);
		track2.setSlaDate(localDate2);
		
		ticketId = "IN-MP-003";
		issueId = "001";
		TrackModel track3 = new TrackModel();
		track3.setId("TRC-VIS-US-"+this.commonTrackUtilities.createTrackId(ticketId, issueId));
		track3.setDesc("Ticket id "+ticketId+" is Pending from client.");
		track3.setAssigned("Samresh Das");
		track3.setEscalation("Aryan Pal");
		
        LocalDate localDate3 = LocalDate.of(2021, 12, 30);
		track3.setSlaDate(localDate3);
		
		tracks.add(track);
		tracks.add(track2);
		tracks.add(track3);
		return tracks;
	}
}
