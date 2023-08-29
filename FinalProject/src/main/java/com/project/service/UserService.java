package com.project.service;

import java.util.List;

import com.project.entity.User;


public interface UserService {
	public User insertUser(User user);
	public List<User> getUserByEmailAndPassword(String email,String password);
	
	
	//public User updatePassword(User user);
}
