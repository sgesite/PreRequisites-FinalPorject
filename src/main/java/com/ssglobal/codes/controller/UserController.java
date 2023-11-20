package com.ssglobal.codes.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ssglobal.codes.model.Users;
import com.ssglobal.codes.service.impl.UserServiceImpl;

import lombok.RequiredArgsConstructor;


@RestController
@RequestMapping("/api/users")
@RequiredArgsConstructor
public class UserController {
	
	private final UserServiceImpl userServiceImpl;
	
	@GetMapping("/{id}")
	public Users getUserById(@PathVariable String id) {
		return  userServiceImpl.getUserById(id);
	}
	
	@GetMapping("all")
	public List<Users> getAllUsers() {
		return userServiceImpl.getAllUsers();
	}
}
