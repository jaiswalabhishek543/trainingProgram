/*package com.amit.spring.security.web.config;

import java.util.Collection;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import com.amit.spring.security.web.entity.Privilege;
import com.amit.spring.security.web.entity.Role;
import com.amit.spring.security.web.repository.PrivilegeRepository;
import com.amit.spring.security.web.repository.RoleRepository;
import com.amit.spring.security.web.repository.UserRepository;

@Component
public class InitialDataLoader implements
ApplicationListener<ContextRefreshedEvent> {
	
	
	
	 boolean alreadySetup = false;
	 
	    @Autowired
	    private UserRepository userRepository;
	  
	    @Autowired
	    private RoleRepository roleRepository;
	  
	    @Autowired
	    private PrivilegeRepository privilegeRepository;

	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		// TODO Auto-generated method stub
		
	}
	
	
	
	 @Transactional
	 public Privilege createPrivilegeIfNotFound(String name) {
	  
	        Privilege privilege = privilegeRepository.findByName(name).get();
	        if (privilege == null) {
	            privilege = new Privilege(name);
	            privilegeRepository.save(privilege);
	        }
	        return privilege;
	    }
	 
	    @Transactional
	    public Role createRoleIfNotFound(
	      String name, Collection<Privilege> privileges) {
	  
	        Role role = roleRepository.findByName(name).get();
	        if (role == null) {
	            role = new Role(name);
	            role.setPrivileges(privileges);
	            roleRepository.save(role);
	        }
	        return role;
	    }

}
*/