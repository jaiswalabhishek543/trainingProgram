package com.example.config;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/*
 * @abhishek
 */
@Configuration
public class Appconfig {

	/*@Bean
	RestTemplate restTemplate() {
		return new RestTemplate();
	}*/
	
	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
		return new RestTemplate();
	}
}
