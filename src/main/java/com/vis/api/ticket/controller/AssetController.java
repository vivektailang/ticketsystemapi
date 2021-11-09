package com.vis.api.ticket.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.vis.api.ticket.model.asset.AssetModel;
import com.vis.api.ticket.services.AssetService;

@RestController
@RequestMapping("/asset")
@CrossOrigin
public class AssetController {

	@Autowired
	private AssetService assetService;

	@CrossOrigin @RequestMapping(value="/details/{type}",method=RequestMethod.GET,produces={"application/json"},consumes={"application/json"})
	public ResponseEntity<?> getAsset(@PathVariable String type) {
		List<AssetModel> assets = this.assetService.getAsset(type);
		return ResponseEntity.ok().body(assets);
	}
}
