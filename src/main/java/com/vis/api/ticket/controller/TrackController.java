package com.vis.api.ticket.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.vis.api.ticket.model.track.TrackModel;
import com.vis.api.ticket.services.TrackService;

@RestController
@RequestMapping("/track")
@CrossOrigin
public class TrackController {
	@Autowired
	private TrackService trackService;

	@CrossOrigin @RequestMapping(value="/details/{userid}",method=RequestMethod.GET,produces={"application/json"},consumes={"application/json"})
	public ResponseEntity<?> getAsset(@PathVariable String userid) {
		List<TrackModel> tracks = this.trackService.getTracks(userid);
		return ResponseEntity.ok().body(tracks);
	}
}
