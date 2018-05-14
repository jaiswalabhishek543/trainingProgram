package com.example;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;
import java.util.logging.Logger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@Retention(RetentionPolicy.RUNTIME)  
@Target(ElementType.METHOD)  
@interface MyAnnotation{  
String value();  
}


class Hello{  
@MyAnnotation(value="Spring Jpa App")  
public void sayHello(){System.out.println("Hello");}  
}


@SpringBootApplication
public class SpringAppJpaApplication {

	private static final Logger loggr=Logger.getLogger(SpringAppJpaApplication.class.getName());
	public static void main(String[] args) throws NoSuchMethodException, SecurityException {
		SpringApplication.run(SpringAppJpaApplication.class, args);
		
		 
		
		
		Hello h=new Hello();  
		Method m=h.getClass().getMethod("sayHello");  
		  
		MyAnnotation manno=m.getAnnotation(MyAnnotation.class);  
		loggr.info("Project name is : "+manno.value()); 
		
		
	}
}
