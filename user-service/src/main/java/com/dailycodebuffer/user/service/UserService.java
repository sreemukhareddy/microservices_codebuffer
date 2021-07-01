package com.dailycodebuffer.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.dailycodebuffer.user.entity.Department;
import com.dailycodebuffer.user.entity.User;
import com.dailycodebuffer.user.entity.UserDepartmentVO;
import com.dailycodebuffer.user.repository.UserRepository;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class UserService {

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private RestTemplate restTemplate;

	public User saveUser(User user) {
		log.info("save user of UserService Started ");
		return userRepository.save(user);
		
	}

	public UserDepartmentVO findUserAndDepartment(Long id) {
		log.info("get user of UserService Started ");
		User user = userRepository.findById(id).get();
		ResponseEntity<Department> departmentResponse = restTemplate.getForEntity("http://DEPARTMENT-SERVICE/departments/get/"+user.getDepartmentId(), Department.class); 
		UserDepartmentVO userDepartmentVO = new UserDepartmentVO(user, departmentResponse != null ? departmentResponse.getBody() : null);
		return userDepartmentVO;
	}

}
