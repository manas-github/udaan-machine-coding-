package com.manas.covido.dto;

public class ZoneInfoResponse {

	private int numCases;
	private ZoneType zoneType;
	public int getNumCases() {
		return numCases;
	}
	public void setNumCases(int numCases) {
		this.numCases = numCases;
	}
	public ZoneType getZoneType() {
		return zoneType;
	}
	public void setZoneType(ZoneType zoneType) {
		this.zoneType = zoneType;
	}
	
}
