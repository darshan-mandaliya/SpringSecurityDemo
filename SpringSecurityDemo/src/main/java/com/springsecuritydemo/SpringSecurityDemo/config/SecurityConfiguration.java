package com.springsecuritydemo.SpringSecurityDemo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter{

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.inMemoryAuthentication().withUser("darsh").password("darsh12").roles("USER").and().withUser("test")
				.password("darsh123").roles("ADMIN");
	}
	
	@Bean
	public PasswordEncoder getPasswordEncoderBean() {
		return NoOpPasswordEncoder.getInstance();
	}
	
}
