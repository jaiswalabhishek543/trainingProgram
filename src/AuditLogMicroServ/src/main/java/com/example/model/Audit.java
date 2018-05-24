package com.example.model;

import java.sql.Timestamp;
import java.util.Date;
import java.util.UUID;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Document(collection="audit")
@Data
public class Audit {
	
	@Id
	String userId;
	UUID eventId=UUID.randomUUID();
	String eventName;
	String eventType;
	Date eventDate=new Date();//new Timestamp(new Date().getTime());
	@Override
	public String toString() {
		return "Audit [userId=" + userId + ", eventId=" + eventId + ", eventName=" + eventName + ", eventType="
				+ eventType + ", eventDate=" + eventDate + "]";
	}
	
	
	
	
	
	/*BaseEntity oldValue;
	BaseEntity newValue;*/   
	
}
