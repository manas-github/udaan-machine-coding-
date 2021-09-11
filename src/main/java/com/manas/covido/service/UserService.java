package com.manas.covido.service;

import org.springframework.stereotype.Service;

import com.manas.covido.dto.SelfAssesmentRequest;
import com.manas.covido.dto.SelfAssesmentResponse;
import com.manas.covido.dto.UserRegisterationRequest;
import com.manas.covido.dto.UserRegisterationResponse;
import com.manas.covido.memory.DB;
import com.manas.covido.model.AdminUser;
import com.manas.covido.model.HealthAssesment;
import com.manas.covido.model.PublicUser;
import com.manas.covido.model.User;

@Service
public class UserService {

	private static int counter = 1;

	public UserRegisterationResponse registerUser(UserRegisterationRequest request) {
		if(request.getName()==null || request.getPhoneNumber()==null || request.getPinCode()==null) {
			throw new RuntimeException("Invalid requset");
		}
		User user = new PublicUser();
		user.setId(String.valueOf(counter++));
		user.setName(request.getName());
		user.setPhone(request.getPhoneNumber());
		user.setPincode(request.getPinCode());

		DB.users.add(user);

		UserRegisterationResponse response = new UserRegisterationResponse(user.getId());
		return response;
	}

	public SelfAssesmentResponse selfAssessment(SelfAssesmentRequest request) {
		User user = DB.getUserById(request.getUserId());
		HealthAssesment hs = new HealthAssesment();
		hs.setContactWithCovidPatient(request.isContactWithCovidPatient());
		hs.setSymptoms(request.getSymptoms());
		hs.setTravelHistory(request.isTravelHistory());
		hs.setUserId(user.getId());
		
		user.setHealthAssesment(hs);

		int risk = calculateRisk(user);
		SelfAssesmentResponse response = new SelfAssesmentResponse();
		response.setRiskPercentage(risk);
		return response;
	}

	private int calculateRisk(User user) {
		boolean travel = user.getHealthAssesment().isTravelHistory();
		int symptomCount = user.getHealthAssesment().getSymptoms().size();
		boolean isContacted = user.getHealthAssesment().isContactWithCovidPatient();
		if (!travel && !isContacted && symptomCount == 0) {
			return 5;
		}
		if ((travel || isContacted) && symptomCount == 1) {
			return 50;
		}
		if ((travel || isContacted) && symptomCount == 2) {
			return 75;
		}

		if ((travel || isContacted) && symptomCount >= 3) {
			return 95;
		}
		throw new RuntimeException("Protocol not defined");
	}

	public UserRegisterationResponse registerAdmin(UserRegisterationRequest request) {
		if(request.getName()==null || request.getPhoneNumber()==null || request.getPinCode()==null) {
			throw new RuntimeException("Invalid requset");
		}
		AdminUser user = new AdminUser();
		user.setId(String.valueOf(counter++));
		user.setName(request.getName());
		user.setPhone(request.getPhoneNumber());
		user.setPhone(request.getPhoneNumber());
		user.setAdminId(String.valueOf(counter++));

		DB.users.add(user);
		DB.admins.add(user);
		UserRegisterationResponse response = new UserRegisterationResponse(user.getId());
		return response;
	}

}
