package com.amit.spring.security.web.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.amit.spring.security.web.entity.Privilege;
import com.amit.spring.security.web.entity.Role;
import com.amit.spring.security.web.entity.User;
import com.amit.spring.security.web.repository.UserRepository;

public class TrainingUserDetailsService implements UserDetailsService {

	private final UserRepository repository;

	public TrainingUserDetailsService(UserRepository repository) {
		this.repository = repository;
	}

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Optional<User> optionalUser = repository.findByUserName(username);
		optionalUser.orElseThrow(() -> new UsernameNotFoundException("Username is not available"));
		return optionalUser.map(user -> new org.springframework.security.core.userdetails.User(user.getUserName(),
				user.getPassword(), getAuthorities(user.getRoles()))).get();
	}

	
	 /* private Collection<? extends GrantedAuthority> getAuthorities(User user) {
	  return user.getRoles().stream().map(role-> new SimpleGrantedAuthority("ROLE_"
	  + role.getRole())) .collect(Collectors.toList()); }
	 
*/
	private Collection<? extends GrantedAuthority> getAuthorities(Collection<Role> roles) {

		return getGrantedAuthorities(getPrivileges(roles));
	}

	private List<String> getPrivileges(Collection<Role> roles) {

		List<String> privileges = new ArrayList<>();
		List<Privilege> collection = new ArrayList<>();
		for (Role role : roles) {
			collection.addAll(role.getPrivileges());
		}
		for (Privilege item : collection) {
			privileges.add(item.getName());
		}
		return privileges;
	}

	private List<GrantedAuthority> getGrantedAuthorities(List<String> privileges) {
		List<GrantedAuthority> authorities = new ArrayList<>();
		for (String privilege : privileges) {
			authorities.add(new SimpleGrantedAuthority("ROLE_"+privilege));
		}
		return authorities;
	}

}
