package com.example;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.example.model.Customer;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface MyAnnotation {
	String value();
}

class Hello {
	@MyAnnotation(value = "Spring Jpa App")
	public void sayHello() {
		System.out.println("Hello");
	}
}

@SpringBootApplication
public class SpringAppJpaApplication implements ApplicationRunner {
	
	@Autowired
	private RestTemplate restTemplate;

	private static final Logger loggr = Logger.getLogger(SpringAppJpaApplication.class.getName());

	private void createCustomer() {
		final String uri = "http://localhost:8080/addcust";
		Customer cos = restTemplate.postForObject(uri, null, Customer.class);
		loggr.info(cos.toString());

	}

	private void getAllCustomer() {
		final String uri = "http://localhost:8080/viewcust";
		
		ResponseEntity<Customer[]> responseEntity = restTemplate.getForEntity(uri, Customer[].class);

		for (Customer cust11 : responseEntity.getBody()) {
			loggr.info(cust11.toString());
		}

	}

	private void deleteCustomer1() {
		final String uri = "http://localhost:8080/deletecust/25";
		restTemplate.delete(uri);		

	}
	
	private void update()
	{
		final String uri="http://localhost:8080/updatecust/18";
		restTemplate.put(uri, Customer.class);
		
		
	}
	
	public static void main(String[] args) throws NoSuchMethodException, SecurityException {
		SpringApplication.run(SpringAppJpaApplication.class, args);
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {

		
		// SpringAppJpaApplication.createCustomer();
		//getAllCustomer();
		//deleteCustomer1();
		update();
		Hello h = new Hello();
		Method m = h.getClass().getMethod("sayHello");

		MyAnnotation manno = m.getAnnotation(MyAnnotation.class);
		loggr.info("Project name is : " + manno.value());
		
	}
}
