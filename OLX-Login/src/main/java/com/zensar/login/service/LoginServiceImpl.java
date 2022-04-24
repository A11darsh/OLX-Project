package com.zensar.login.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.zensar.login.entity.User;


@Service
public class LoginServiceImpl implements LoginService {

	
	
	static List<User> user1 = new ArrayList<User>();
	@Override
	public String loginUser(User user) {
		String auth = "am222";
		return auth;
	}

	@Override
	public boolean logOut(String token) {
		if (token.equalsIgnoreCase("am222")) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public List<User> registerUser(User user) {
		user1.add(user);
		return user1;
	}

	@Override
	public List<User> getUser(String token) {
		if(token.equalsIgnoreCase("am222")) {
			return user1;
		}else;
		return null;
	}

}
