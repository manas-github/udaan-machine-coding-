package com.manas.covido.model;

public class AdminUser extends User {
	 String adminId;

	public String getAdminId() {
		return adminId;
	}

	public void setAdminId(String adminId) {
		this.adminId = adminId;
	}

	public AdminUser(String adminId) {
		super();
		this.adminId = adminId;
	}
	
	public AdminUser() {
		
	}

	
	

}
