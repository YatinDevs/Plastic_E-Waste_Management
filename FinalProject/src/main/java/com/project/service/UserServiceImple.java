package com.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.entity.User;
import com.project.repository.UserDao;

@Service
public class UserServiceImple implements UserService {
	
	@Autowired
	private UserDao userDao;

	@Override
	public User insertUser(User user) {
		return userDao.save(user);	
	}

	@Override
	public List<User> getUserByEmailAndPassword(String email,String password) {
		return userDao.findByEmailAndPassword(email,password);
	}
	
	
	
}
