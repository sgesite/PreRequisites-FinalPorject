package com.ssglobal.codes.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection = "users")
public class Users {
	@Id
	private String id;
	private String userName;
	private String email;
	private String mobileNo;
}
