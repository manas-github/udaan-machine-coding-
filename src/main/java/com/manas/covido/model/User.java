package com.manas.covido.model;

public abstract class User {

	private String name;
	private String id;
	private String phone;
	private String pincode;
	private HealthAssesment healthAssesment;
	private boolean covidTestResult;
	private boolean covidRecovered;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	public HealthAssesment getHealthAssesment() {
		return healthAssesment;
	}
	public void setHealthAssesment(HealthAssesment healthAssesment) {
		this.healthAssesment = healthAssesment;
	}
	public Boolean getCovidTestResult() {
		return covidTestResult;
	}
	public void setCovidTestResult(Boolean covidTestResult) {
		this.covidTestResult = covidTestResult;
	}
	public Boolean getCovidRecovered() {
		return covidRecovered;
	}
	public void setCovidRecovered(Boolean covidRecovered) {
		this.covidRecovered = covidRecovered;
	}
	public User(String name, String id, String phone, String pincode, HealthAssesment healthAssesment,
			Boolean covidTestResult, Boolean covidRecovered) {
		super();
		this.name = name;
		this.id = id;
		this.phone = phone;
		this.pincode = pincode;
		this.healthAssesment = healthAssesment;
		this.covidTestResult = covidTestResult;
		this.covidRecovered = covidRecovered;
	}
	public User() {
		super();
	}
	
	
	
}
