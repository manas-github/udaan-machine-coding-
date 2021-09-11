package com.manas.covido.dto;

public class SelfAssesmentResponse {

	private int riskPercentage;

	public int getRiskPercentage() {
		return riskPercentage;
	}

	public void setRiskPercentage(int riskPercentage) {
		this.riskPercentage = riskPercentage;
	}

	@Override
	public String toString() {
		return "SelfAssesmentResponse [riskPercentage=" + riskPercentage + "]";
	}
	
}
