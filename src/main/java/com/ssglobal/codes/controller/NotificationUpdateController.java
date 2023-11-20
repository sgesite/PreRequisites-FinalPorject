package com.ssglobal.codes.controller;

import java.util.Optional;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ssglobal.codes.model.NotifStatusUpdate;
import com.ssglobal.codes.service.impl.NotificationUpdateServiceImpl;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/notification")
@RequiredArgsConstructor
public class NotificationUpdateController {

	private final NotificationUpdateServiceImpl notifServiceImpl;
	
	@PostMapping("/register")
	public NotifStatusUpdate updateStatus(@RequestBody NotifStatusUpdate notif) {
		return notifServiceImpl.updateStatus(notif);
	}
	
	@GetMapping("/get/{id}")
	public Optional<NotifStatusUpdate> getNotifyByUserId(@PathVariable String id) {
		System.out.println("Received userId: " + id);
		return notifServiceImpl.getNotifyByUserId(id);
	}
}
