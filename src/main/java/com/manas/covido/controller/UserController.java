package com.manas.covido.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.manas.covido.dto.SelfAssesmentRequest;
import com.manas.covido.dto.SelfAssesmentResponse;
import com.manas.covido.dto.UserRegisterationRequest;
import com.manas.covido.dto.UserRegisterationResponse;
import com.manas.covido.service.UserService;

@RestController
@RequestMapping("/api/v1/user")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@PostMapping("/registerUser")
	public ResponseEntity<UserRegisterationResponse> registerUser(@RequestBody UserRegisterationRequest request) {
		UserRegisterationResponse response = this.userService.registerUser(request);
		return new ResponseEntity<UserRegisterationResponse>(response, HttpStatus.OK);
	}
	
	@PostMapping("/registerAdmin")
	public ResponseEntity<UserRegisterationResponse> registerAdmin(@RequestBody UserRegisterationRequest request) {
		UserRegisterationResponse response = this.userService.registerAdmin(request);
		return new ResponseEntity<UserRegisterationResponse>(response, HttpStatus.OK);
	}
	
	@PostMapping("/selfAssessment")
	public ResponseEntity<SelfAssesmentResponse> selfAssessment(@RequestBody SelfAssesmentRequest request){
		SelfAssesmentResponse response = this.userService.selfAssessment(request);
		return new ResponseEntity<SelfAssesmentResponse>(response, HttpStatus.OK);
		
	}
	

}
