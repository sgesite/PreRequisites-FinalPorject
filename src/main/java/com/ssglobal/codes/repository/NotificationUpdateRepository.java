package com.ssglobal.codes.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.ssglobal.codes.model.NotificationUpdate;

public interface NotificationUpdateRepository extends MongoRepository<NotificationUpdate, String> {
	Optional<NotificationUpdate> findById(String id);
}
