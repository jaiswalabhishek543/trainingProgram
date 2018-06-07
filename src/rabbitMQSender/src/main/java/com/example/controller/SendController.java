package com.example.controller;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.RabbitMqSenderApplication;
import com.example.model.Employee;

@RestController
public class SendController {

	private RabbitTemplate rabbitTemplate;

	public SendController(RabbitTemplate rabbitTemplate) {
		this.rabbitTemplate = rabbitTemplate;
	}

	@PostMapping
	@RequestMapping("/")
	public String sendMsg(@RequestBody Employee employee) {
		rabbitTemplate.convertAndSend(RabbitMqSenderApplication.topicExchangeName, employee);
		return "send";
	}

}
