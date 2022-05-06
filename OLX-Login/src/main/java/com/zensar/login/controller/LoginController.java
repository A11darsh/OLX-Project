package com.zensar.login.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.zensar.login.entity.Token;
import com.zensar.login.entity.User;
import com.zensar.login.service.LoginService;

@RestController
@RequestMapping(produces= {MediaType.APPLICATION_XML_VALUE,MediaType.APPLICATION_JSON_VALUE},consumes= {MediaType.APPLICATION_XML_VALUE,MediaType.APPLICATION_JSON_VALUE})
public class LoginController {

	@Autowired
	private LoginService loginService;
	/*
	 * static List<User> user1 = new ArrayList<User>(); static { //user1.add(new
	 * User(1,"anand","kulkarni","anand","anand123","anand@gmail.com",12345)); }
	 */

	@PostMapping(value="/user/authenticate")
	public Token loginUser(@RequestBody User user) {
		return loginService.loginUser(user);
	}

	@DeleteMapping("/user/logout")
	public boolean logOut(@RequestHeader("auth-token") String token) {
		return loginService.logOut(token);
	}

	@PostMapping(value="/user")
	public User registerUser(@RequestBody User user){
		return loginService.registerUser(user);
	}

	@GetMapping(value="/user")
	public List<User> getUser(@RequestHeader("auth-token") String token ){
		return loginService.getUser(token);
	}

}











