/**
 * Copyright (C) Spacemetric AB, Sweden
 * http://www.spacemetric.com/
 */
package com.spacemetric.spring.jpmstest;

import java.util.concurrent.Executors;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.AsyncConfigurer;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ConcurrentTaskExecutor;
import org.springframework.web.servlet.config.annotation.AsyncSupportConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@EnableWebMvc
@Configuration
@EnableAsync
public class RESTMvcConfiguration implements AsyncConfigurer, WebMvcConfigurer {


	@Override
	public void configureAsyncSupport(AsyncSupportConfigurer configurer) {
		configurer.setTaskExecutor(getTaskExecutor());
	}

	@Bean
	protected ConcurrentTaskExecutor getTaskExecutor() {
		return new ConcurrentTaskExecutor(Executors.newFixedThreadPool(5));
	}

}