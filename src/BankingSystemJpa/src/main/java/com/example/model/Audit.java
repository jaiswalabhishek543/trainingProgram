package com.example.model;

import java.util.Date;
import java.util.UUID;

import lombok.Data;

/**
 * @author abhishek
 *
 */

@Data
public class Audit {


	UUID eventId = UUID.randomUUID();
	String eventName;
	String eventType;
	Date eventDate = new Date();
	BaseEntity oldValue;
	BaseEntity newValue;


}
