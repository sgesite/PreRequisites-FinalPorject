package com.ssglobal.codes.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ssglobal.codes.model.Users;
import com.ssglobal.codes.repository.UserRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserServiceImpl {

	private final UserRepository userRepo;

	public Users getUserById(String userId) {
		
		try {
			Users user = userRepo.findById(userId).orElse(null);
			return user;
        } catch (Exception e) {
            e.printStackTrace();
        }
		return null;
	}

	public List<Users> getAllUsers() {
		try {
            List<Users> allUsers = userRepo.findAll();
            return allUsers;
        } catch (Exception e) {
            e.printStackTrace();
        }
		return null;
	}
	
	
	
}
