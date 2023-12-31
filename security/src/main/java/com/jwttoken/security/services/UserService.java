package com.jwttoken.security.services;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.jwttoken.security.models.User;

@Service
public class UserService {

	List<User> userList = new ArrayList<User>();

	public UserService() {
		userList.add(new User(UUID.randomUUID().toString(), "manish", 70.0, "manishdevlikar@gmail.com"));
		userList.add(new User(UUID.randomUUID().toString(), "sunny", 80.0, "manishdevlikar@gmail.com"));
		userList.add(new User(UUID.randomUUID().toString(), "raj", 75.0, "manishdevlikar@gmail.com"));
		userList.add(new User(UUID.randomUUID().toString(), "kushank", 85.0, "manishdevlikar@gmail.com"));
	}

	public List<User> getUsers() {
		return userList;
	}
}
