package com.techproed.apitodeploy.auth;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.google.common.collect.Lists;
import com.techproed.apitodeploy.ApplicationUserRoles;

public class FakeApplicationUserDaoService implements ApplicationUserDAO {

	private PasswordEncoder passwordEncoder; 
	@Autowired
	public FakeApplicationUserDaoService(PasswordEncoder passwordEncoder) {
		this.passwordEncoder = passwordEncoder;
	}

	@Override
	public Optional<ApplicationUser> selectApplicationUserByUsername(String username) {
		return getApplicationUsers().
				stream().
				filter(t->username.equals(t.getUsername())).findFirst();
	}
	
	private List<ApplicationUser> getApplicationUsers(){
		
	List<ApplicationUser> applicationUsers =	Lists.newArrayList(
				new ApplicationUser(ApplicationUserRoles.STUDENT.getGrantedAuthorities(),
									passwordEncoder.encode("password12"),
									"student",
									true,
									true,
									true,
									true),
				new ApplicationUser(ApplicationUserRoles.TEACHER.getGrantedAuthorities(),
						passwordEncoder.encode("password1234"),
						"teacher",
						true,
						true,
						true,
						true)
				);
		
	return applicationUsers;
	}

}
