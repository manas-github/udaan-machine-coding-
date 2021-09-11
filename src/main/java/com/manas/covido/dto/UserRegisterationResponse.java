package com.manas.covido.dto;

public class UserRegisterationResponse {

	private String userId;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public UserRegisterationResponse(String userId) {
		super();
		this.userId = userId;
	}

	public UserRegisterationResponse() {
		super();
	}
	
	
}
