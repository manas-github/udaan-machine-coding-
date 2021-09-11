package com.manas.covido.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.manas.covido.service.AdminService;

@RestController
@RequestMapping("/api/v1/admin")
public class AdminController {
	
	@Autowired
	private AdminService adminService;

	@PostMapping("/updateCovidResult")
	public ResponseEntity<Boolean> updateCovidResult(String userId,boolean result){
		boolean response = this.adminService.updateCovidResult(userId,result);
		return new ResponseEntity<Boolean>(response, HttpStatus.OK);
	}
	
	@PostMapping("/updateRecoveryResult")
	public ResponseEntity<Boolean> updateRecoveryResult(String userId,boolean result){
		boolean response = this.adminService.updateRecoveryResult(userId,result);
		return new ResponseEntity<Boolean>(response, HttpStatus.OK);
	}
}
