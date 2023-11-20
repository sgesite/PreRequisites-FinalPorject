package com.ssglobal.codes.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssglobal.codes.repository.UserRepository;

@Service
public class UserServiceImpl {
	@Autowired
	private UserRepository userRepo;
	
	
}
