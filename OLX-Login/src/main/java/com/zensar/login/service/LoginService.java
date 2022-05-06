package com.zensar.login.service;

import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;

import com.zensar.login.entity.Token;
import com.zensar.login.entity.User;

public interface LoginService {

	public Token loginUser(User user);
	public boolean logOut(String token);
	public User registerUser( User user);
	public List<User> getUser(String token );
}
