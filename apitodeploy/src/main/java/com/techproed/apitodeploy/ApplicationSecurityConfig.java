package com.techproed.apitodeploy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
@EnableWebSecurity
public class ApplicationSecurityConfig extends WebSecurityConfigurerAdapter{

	private final PasswordConfig passwordEncoder;
	private final 
	
	@Autowired
	public ApplicationSecurityConfig(PasswordConfig passwordEncoder) {
		this.passwordEncoder = passwordEncoder;
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		
		//antMatchers("/", "index", "/css/*", "/js/*").permitAll(). bu kod ile HTML sifresi istemeden Home page public gorunecek
		//antMatchers("/api/**").hasRole(ApplicationUserRoles.STUDENT.name()). ==> burada sadece STUDENT can read
		http.
			csrf().disable(). //bunlar sayesinde POST, PUT, DELETE kullanilabiliyor artik
			authorizeRequests().
			antMatchers("/", "index", "/css/*", "/js/*").permitAll().
//			antMatchers("/api/**").hasRole(ApplicationUserRoles.STUDENT.name()). //Role-Based authentication
//			antMatchers(HttpMethod.POST, "/management/api/**").hasAuthority(ApplicationUserPermissions.TEACHER_WRITE.name()).
//			antMatchers(HttpMethod.PUT, "/management/api/**").hasAuthority(ApplicationUserPermissions.TEACHER_WRITE.name()).
//			antMatchers(HttpMethod.DELETE, "/management/api/**").hasAuthority(ApplicationUserPermissions.TEACHER_WRITE.name()).
//			antMatchers(HttpMethod.PATCH, "/management/api/**").hasAuthority(ApplicationUserPermissions.TEACHER_WRITE.name()).
//			antMatchers(HttpMethod.GET, "/management/api/**").hasAuthority(ApplicationUserPermissions.TEACHER_WRITE.name()).
			anyRequest().
			authenticated().
			and().
			//httpBasic(); //For basic AUTH, use httpBasic()
			formLogin(). // For form-based authentication
				loginPage("/login").permitAll(). //I am changing the login page URL
				defaultSuccessUrl("/successPage", true).
			and().
				rememberMe().
			and().
				logout().logoutUrl("/mylogout").
				clearAuthentication(true).
				invalidateHttpSession(true).
				deleteCookies("JSESSIONID").
				logoutSuccessUrl("/login"); //tekrar bizi login page itecek
	}
	
	//How to set username and password and encode
	@Override
	@Bean
	protected UserDetailsService userDetailsService() {
		
	UserDetails	suleyman = User.
								builder().
								username("salptekin").
								password(passwordEncoder.passwordEncoder().encode("password12")).
								//roles(ApplicationUserRoles.STUDENT.name()).
								authorities(ApplicationUserRoles.STUDENT.getGrantedAuthorities()).//PERMISSION BASED auth
								build();
	
	UserDetails	teacher= User.
							builder().
							username("teacher").
							password(passwordEncoder.passwordEncoder().encode("password1234")).
							//roles(ApplicationUserRoles.TEACHER.name()).
							authorities(ApplicationUserRoles.TEACHER.getGrantedAuthorities()).//PERMISSION BASED auth
							build();
	
	return new InMemoryUserDetailsManager(suleyman, teacher);
	
	
	}
	
	@Bean
	public DaoAuthenticationProvider daoAuthenticationProvider () {
		DaoAuthenticationProvider provider = new DaoAuthenticationProvider();
	
		provider.setPasswordEncoder(passwordEncoder);
		
		provider.setUserDetailsService(applicationUserService);
	
		return provider;
		
	}

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.authenticationProvider(daoAuthenticationProvider());
	}
	
	
	
	
	
	
	
	

}
