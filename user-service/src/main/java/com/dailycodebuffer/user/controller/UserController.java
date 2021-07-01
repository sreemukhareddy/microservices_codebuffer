package com.dailycodebuffer.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dailycodebuffer.user.entity.User;
import com.dailycodebuffer.user.entity.UserDepartmentVO;
import com.dailycodebuffer.user.service.UserService;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/users")
@Slf4j
public class UserController {

	@Autowired
	private UserService userService;
	
	@PostMapping("/save")
	public User saveUser(@RequestBody User user) {
		log.info("save User of UserController Started ");
		return userService.saveUser(user);
	}
	
	@GetMapping("/get/{id}")
	public UserDepartmentVO getUser(@PathVariable Long id) {
		log.info("get User of UserController Started ");
		return userService.findUserAndDepartment(id);
	}
	
}
