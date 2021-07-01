package com.dailycodebuffer.department.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dailycodebuffer.department.entity.Department;
import com.dailycodebuffer.department.repository.DepartmentRepository;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class DepartmentService {

	@Autowired
	private DepartmentRepository departmentRepository;

	public Department saveDepartment(Department department) {
		log.info("save department of DepartmentService Started ");
		return departmentRepository.save(department);
		
	}

	public Department findByDepartmentId(Long id) {
		log.info("get department of DepartmentService Started ");
		return departmentRepository.findById(id).get();
	}

}
