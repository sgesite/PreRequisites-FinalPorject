package com.ssglobal.codes.service.impl;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.ssglobal.codes.model.NotifStatusUpdate;
import com.ssglobal.codes.repository.NotificationUpdateRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class NotificationUpdateServiceImpl {

	private final NotificationUpdateRepository notifUpdateRepo;
	
	public NotifStatusUpdate updateStatus(NotifStatusUpdate notif) {
		
		try {
			NotifStatusUpdate notifUpdate = notifUpdateRepo.save(notif);
			return notifUpdate;
        } catch (Exception e) {
            e.printStackTrace();
        }
		return null;
	}

	public Optional<NotifStatusUpdate> getNotifyByUserId(String userId) {
		 
		try {
			Optional<NotifStatusUpdate> notifByUserId = notifUpdateRepo.findById(userId);
			return notifByUserId;
        } catch (Exception e) {
            e.printStackTrace();
        }
		return null;
	}
}
