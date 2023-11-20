package com.ssglobal.codes.service;

import com.ssglobal.codes.model.Users;

public interface UserService {
	Users getByEmailMobileNo(String email, String mobileNo);
}
