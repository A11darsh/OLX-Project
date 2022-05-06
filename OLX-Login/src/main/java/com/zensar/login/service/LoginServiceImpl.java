package com.zensar.login.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zensar.login.entity.Token;
import com.zensar.login.entity.User;
import com.zensar.login.repository.LoginRepository;


@Service
public class LoginServiceImpl implements LoginService {
	
	Token token= new Token();
	@Autowired
	LoginRepository loginRepository;

	//static List<User> loginData = new ArrayList<User>();
	@Override
	public Token loginUser(User user) {
		if(user.getUserName().equals("anand")&&user.getPassword().equals("anand123")) {
			Random random=new Random();
	
			int nextInt = random.nextInt(100);
			token.setId("auth-token");
			token.setTokenName("am222"+nextInt+"");
		
			return token;
		}
		return null;
	}

	@Override
	public boolean logOut(String token1) {
		if (token1.equals(token.getTokenName())) {
			token.setId(null);
			token.setTokenName(null);
			return true;
		} else {
			return false;
		}
	}

	@Override
	public User registerUser(User user) {
		loginRepository.save(user);
		//loginData.add(user);;
		//return loginData;
	return user;
	}
	
	@Override
	public List<User> getUser(String token1) {
		if(token1.equals(token.getTokenName())) {
			return loginRepository.findAll();
		}else  
		return null;
	}

}
