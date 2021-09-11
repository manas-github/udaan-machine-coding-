package com.manas.covido.model;

import java.util.List;

public class HealthAssesment {

	private String userId;
	private List<Symptoms> symptoms;
	private boolean travelHistory;
	private boolean contactWithCovidPatient;
	
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public List<Symptoms> getSymptoms() {
		return symptoms;
	}
	public void setSymptoms(List<Symptoms> symptoms) {
		this.symptoms = symptoms;
	}
	public boolean isTravelHistory() {
		return travelHistory;
	}
	public void setTravelHistory(boolean travelHistory) {
		this.travelHistory = travelHistory;
	}
	public boolean isContactWithCovidPatient() {
		return contactWithCovidPatient;
	}
	public void setContactWithCovidPatient(boolean contactWithCovidPatient) {
		this.contactWithCovidPatient = contactWithCovidPatient;
	}
	public HealthAssesment(String userId, List<Symptoms> symptoms, boolean travelHistory,
			boolean contactWithCovidPatient) {
		super();
		this.userId = userId;
		this.symptoms = symptoms;
		this.travelHistory = travelHistory;
		this.contactWithCovidPatient = contactWithCovidPatient;
	}
	public HealthAssesment() {
		super();
	}
	
	
}
