package com.amit.spring.security.web.resource;

import java.security.Principal;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpRequest;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.Data;

@RestController
public class SecurityTestController {

	@GetMapping("/unsecured")
	public ExampleClass getUnsecuredResponse() {
		return new ExampleClass("Summer of 69", "Hotel California");
	}
	
	@GetMapping("/secured")
	public ExampleClass getSecuredResponse() {
		return new ExampleClass("Summer of 69 Secured", "Hotel California secured");
		
	}
	
	/*@GetMapping("/admin")
	@PreAuthorize("hasRole('ADMIN')")
	public ExampleClass getAdminRes(HttpServletRequest httpRequest, Principal principal) {
		
		System.out.println(httpRequest);
		
		System.out.println(httpRequest);
		
		System.out.println(principal.getName());
		
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		
		authentication.getAuthorities().forEach(System.out::println);
		
		
		
		return new ExampleClass("ADMIN", "YYYY");
	}*/
	
	
	

	@GetMapping("/admin")
	@PreAuthorize("hasAuthority('ROLE_Write')")
	public ExampleClass getAdminResth(HttpServletRequest httpRequest, Principal principal) {
	System.out.println("Inside admin ----------read-------- ");
		
		
		return new ExampleClass("ADMIN", "YYYY");
	}
	
	
	@GetMapping("/user")
	@PreAuthorize("hasAuthority('ROLE_Read')")
	public ExampleClass getAdminResthth(HttpServletRequest httpRequest, Principal principal) {
	
		
		
		return new ExampleClass("User", "YYYY");
	}
	
	
	
	
	
}

@Data
class ExampleClass {
	private String field1;
	private String field2;
	public ExampleClass(String field1, String field2) {
		super();
		this.field1 = field1;
		this.field2 = field2;
	}
	
}