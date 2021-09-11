package com.manas.covido.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.manas.covido.dto.ZoneInfoRequest;
import com.manas.covido.dto.ZoneInfoResponse;
import com.manas.covido.dto.ZoneType;
import com.manas.covido.memory.DB;
import com.manas.covido.model.User;

@Service
public class DataService {

	public ZoneInfoResponse getZoneInfo(ZoneInfoRequest request) {
		List<User> users = DB.users.stream().filter(user->user.getPincode()!=null && user.getPincode().equals(request.getPinCode())).collect(Collectors.toList());
		int count = (int) users.stream().filter(user->user.getCovidTestResult()==true && user.getCovidRecovered()!=true).count();
		ZoneInfoResponse response = new ZoneInfoResponse();
		response.setNumCases(count);
		if(count>5) {
			response.setZoneType(ZoneType.RED);
		} else if(count<=0) {
			response.setZoneType(ZoneType.GREEN);
		} else {
			response.setZoneType(ZoneType.ORANGE);
		}
		return response;
		
	}

}
