package com.manas.covido.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.manas.covido.dto.ZoneInfoRequest;
import com.manas.covido.dto.ZoneInfoResponse;
import com.manas.covido.service.DataService;

@RestController
@RequestMapping("/api/v1/data")
public class DataController {

	@Autowired
	private DataService dataService;
	
	@PostMapping("/getZoneInfo")
	public ResponseEntity<ZoneInfoResponse> getZoneInfo(ZoneInfoRequest request){
		ZoneInfoResponse response = this.dataService.getZoneInfo(request);
		return new ResponseEntity<ZoneInfoResponse>(response,HttpStatus.OK);
	}
}

