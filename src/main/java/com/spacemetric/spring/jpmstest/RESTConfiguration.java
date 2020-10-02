/**
 * Copyright (C) Spacemetric AB, Sweden
 * http://www.spacemetric.com/
 */
package com.spacemetric.spring.jpmstest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import com.spacemetric.spring.jpmstest.auth.FooAuthenticationProvider;

@Configuration
@EnableWebMvc
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
@ComponentScan(basePackages = "com.spacemetric.spring.jpmstest")
public class RESTConfiguration extends WebSecurityConfigurerAdapter {

	@Autowired
	private FooAuthenticationProvider fooAuthenticationProvider;

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		// do stuff
	}

	@Autowired
	public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
		// do stuff
	}
}