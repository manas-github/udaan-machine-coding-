package com.manas.covido.dto;

import java.util.List;

import com.manas.covido.model.Symptoms;

public class SelfAssesmentRequest {

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
	@Override
	public String toString() {
		return "SelfAssesmentRequest [userId=" + userId + ", symptoms=" + symptoms + ", travelHistory=" + travelHistory
				+ ", contactWithCovidPatient=" + contactWithCovidPatient + "]";
	}
	public SelfAssesmentRequest() {
		super();
	}
	
	
}


//{"userId":"1","symptoms":["fever","cold","cough"],"travelHistory":true,"contactWithCovidPatient":true}
//Sample response - {"riskPercentage": 95}
