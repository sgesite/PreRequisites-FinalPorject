package com.ssglobal.codes.model;

import java.time.LocalDate;

import org.springframework.data.annotation.Id;

public class NotificationUpdate {

	@Id
    private String id;
    private String status;
    private LocalDate timestamp;
}
