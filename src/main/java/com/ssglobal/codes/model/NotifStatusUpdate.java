package com.ssglobal.codes.model;

import java.time.LocalDate;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection = "notif_status_update")
public class NotifStatusUpdate {

	@Id
	private String id;
    private String unitId;
    private String userId;
    private String component;
    private String status;
    private LocalDate timestamp;
}
