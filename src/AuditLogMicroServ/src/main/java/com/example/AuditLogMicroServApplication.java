package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/*
 * @author abhishek
 * 
 */
@SpringBootApplication
@EnableEurekaClient
public class AuditLogMicroServApplication {

	public static void main(String[] args) {
		SpringApplication.run(AuditLogMicroServApplication.class, args);
	}
}
