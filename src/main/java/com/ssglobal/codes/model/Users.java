package com.ssglobal.codes.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "users")
public class Users {
	@Id
	private String id;
	private String email;
	private String mobileNo;
	private String status;
}
