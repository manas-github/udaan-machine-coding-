package com.manas.covido.memory;

import java.util.ArrayList;
import java.util.List;

import com.manas.covido.model.AdminUser;
import com.manas.covido.model.User;

public final class DB {

	public static List<User> users = new ArrayList<>();
	public static List<AdminUser> admins = new ArrayList<>();
	
	public static User getUserById(String userId) {
		return users.stream().filter(u->u.getId().equals(userId)).findAny().orElse(null);
	}
	
	public static AdminUser getAdminUserById(String adminId) {
		return admins.stream().filter(u->u.getAdminId().equals(adminId)).findAny().orElse(null);
	}
}
