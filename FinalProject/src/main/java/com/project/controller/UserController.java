package com.project.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.project.entity.User;
import com.project.service.UserService;


@RestController
public class UserController {
	
	@Autowired
	private UserService userService;
	
	
	@PostMapping("/getlogin")
	public List<User> getUserByEmailAndPassword(@RequestBody User user){
		return userService.getUserByEmailAndPassword(user.getEmail(),user.getPassword());
	}
	
	
	@PostMapping("/insertuser")
	public User insertUser(@RequestBody User user) {
		return userService.insertUser(user);
	}
	
	
	
}
