package com.securitydemo.demosecurity;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter{

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
         auth.inMemoryAuthentication()
              .withUser("peter")
              .password("peter")
              .roles("ADMIN")
              .and()
              .withUser("spider")
              .password("spider")
              .roles("USER");
              
}
	@Bean
	public PasswordEncoder getPasswordEncoder() {
     return NoOpPasswordEncoder.getInstance();
	
	}
//	@Override
//	protected void configure(HttpSecurity http) throws Exception {
//	http.authorizeHttpRequests()
//			.antMatchers("/admin").hasRole("ADMIN")
//			.antMatchers("/user").hasRole("USER")
//			.antMatchers("/").permitAll()
//			.and().formLogin();
//	
//	}
}
