/*package com.example.controller;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.exception.AuditLogException;
import com.example.model.Audit;
import com.example.service.AuditServiceInterface;

@Component
public class Consumer {

	@Autowired
	private AuditServiceInterface auditServ;
	
	
	@RabbitListener(queues="${jsa.rabbitmq.queue}")
    public void recievedMessage(Audit auditObj) throws AuditLogException {

		final Audit audit = auditServ.addAudit(auditObj);
		   System.out.println("Recieved Message:--------- " + audit);
	}
 
	
	
	
}
*/