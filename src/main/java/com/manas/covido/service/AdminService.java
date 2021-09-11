package com.manas.covido.service;

import org.springframework.stereotype.Service;

import com.manas.covido.memory.DB;

@Service
public class AdminService {

	public boolean updateRecoveryResult(String userId, boolean result) {
		DB.getUserById(userId).setCovidRecovered(result);
		return true;
		
	}

	public boolean updateCovidResult(String userId, boolean result) {
		DB.getUserById(userId).setCovidTestResult(result);
		return true;
	}

}
