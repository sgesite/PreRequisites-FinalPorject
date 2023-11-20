package com.ssglobal.codes.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.ssglobal.codes.model.Users;

public interface UserRepository extends MongoRepository<Users, String>{

//	Users findByEmailMobileNo(String email, String mobileNo);
//    List<Users> findAll();
}
