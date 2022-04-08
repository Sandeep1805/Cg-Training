package com.springsecurity.Springsecurityassignments.Q3.copy;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@EnableWebSecurity
public class securityconfiguration3 extends WebSecurityConfigurerAdapter{

	@Autowired
	 DataSource data;
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.jdbcAuthentication()
		.dataSource(data)
		  .withDefaultSchema()
		  .withUser(
				  User.withUsername("Ram")
				       .password("Bheem")
				       .roles("ADMIN")
				  );
	}
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests()
		.antMatchers("/Jdbc").hasRole("ADMIN")
		.and().formLogin()
		.and()
		.rememberMe();
	}

	@Bean
	public PasswordEncoder passwordencode() {
		return NoOpPasswordEncoder.getInstance();
	}

}
