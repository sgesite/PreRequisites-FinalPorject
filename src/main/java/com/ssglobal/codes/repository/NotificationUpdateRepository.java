package com.ssglobal.codes.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.ssglobal.codes.model.NotifStatusUpdate;

public interface NotificationUpdateRepository extends MongoRepository<NotifStatusUpdate, String> {
	Optional<NotifStatusUpdate> findById(String id);
}
