package com.dailycodebuffer.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dailycodebuffer.user.entity.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
