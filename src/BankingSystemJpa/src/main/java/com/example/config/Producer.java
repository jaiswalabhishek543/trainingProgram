/*package com.example.config;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.example.model.Audit;

@Component
public class Producer {

	@Autowired
	private AmqpTemplate amqpTemplate;

	@Value("${jsa.rabbitmq.exchange}")
	private String exchange;

	@Value("${jsa.rabbitmq.routingkey}")
	private String routingKey;

	public void produceMsg(Audit auditObj) {
		amqpTemplate.convertAndSend(exchange, routingKey, auditObj);
		System.out.println("Send object---------- = " + auditObj);

	}
}*/