package com.example;

import org.springframework.amqp.core.TopicExchange;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class RabbitMqSenderApplication {

	public static final String topicExchangeName = "spring-boot-exchange";

	@Bean
	TopicExchange exchange() {
		return new TopicExchange(topicExchangeName);
	}

	public static void main(String[] args) {
		SpringApplication.run(RabbitMqSenderApplication.class, args);
	}
}
