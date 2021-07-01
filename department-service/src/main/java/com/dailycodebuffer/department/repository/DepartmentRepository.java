package com.dailycodebuffer.department.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dailycodebuffer.department.entity.Department;

public interface DepartmentRepository extends JpaRepository<Department, Long>{

}
