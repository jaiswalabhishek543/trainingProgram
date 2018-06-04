package com.amit.spring.security.web;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.amit.spring.security.web.entity.Privilege;
import com.amit.spring.security.web.entity.Role;
import com.amit.spring.security.web.entity.User;
import com.amit.spring.security.web.repository.UserRepository;

@SpringBootApplication
public class TrainingSpringSecurityDemoApplication implements CommandLineRunner{

	@Autowired
	UserRepository repository;
	
	
	public static void main(String[] args) {
		SpringApplication.run(TrainingSpringSecurityDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		repository.deleteAll();
		
		Privilege privilege1=new Privilege("Read");
		Privilege privilege2=new Privilege("Write");
		List<Privilege> listPrivilege=new ArrayList<>();
		listPrivilege.add(privilege1);
		listPrivilege.add(privilege2);
		
		List<Privilege> listPrivilege2=new ArrayList<>();
		listPrivilege2.add(privilege1);
		
		Role role = new Role("ADMIN",listPrivilege);
		
		Set<Role> roles = new HashSet<>();
		roles.add(role);
		//roles.add(new Role("USER"));
		User user = new User("Sanjay", "koala", roles) ;
		repository.saveAndFlush(user);
		
		List<Privilege> listPrivilege3=new ArrayList<>();
		Privilege privilege3=new Privilege("Write");
		listPrivilege3.add(privilege3);
		Role role2 = new Role("User",listPrivilege3);
		Set<Role> darsRole = new HashSet<>();
		darsRole.add(role2);
		//darsRole.add(new Role("USER"));
		User user2 = new User("Darshit", "koala", darsRole) ;
		//repository.saveAndFlush(user2);
		
	}
	
	
	
}
