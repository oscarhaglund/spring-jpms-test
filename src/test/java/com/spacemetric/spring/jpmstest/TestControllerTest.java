/**
 * Copyright (C) Spacemetric AB, Sweden
 * http://www.spacemetric.com/
 */
package com.spacemetric.spring.jpmstest;

import static org.springframework.restdocs.mockmvc.MockMvcRestDocumentation.documentationConfiguration;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.MediaType;
import org.springframework.restdocs.RestDocumentationContextProvider;
import org.springframework.restdocs.RestDocumentationExtension;
import org.springframework.restdocs.mockmvc.RestDocumentationRequestBuilders;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.servlet.View;
import com.spacemetric.spring.jpmstest.controller.TestController;

/**
 * @author Oscar Haglund
 *
 */
@ContextConfiguration(classes = RESTConfiguration.class)
@WebAppConfiguration
@ExtendWith({RestDocumentationExtension.class, SpringExtension.class, MockitoExtension.class })
public class TestControllerTest {
	@InjectMocks
	public TestController controller;
	
	public MockMvc mockMvc;
	
	@Mock
	public View mockView;
	

	@BeforeEach
	public void setUp(WebApplicationContext wac, RestDocumentationContextProvider restDocumentation) throws Exception {
		controller = wac.getBean(TestController.class);

		mockMvc = MockMvcBuilders
				.standaloneSetup(controller)
				.setSingleView(mockView)
				.apply(documentationConfiguration(restDocumentation))
				.build();

		MockitoAnnotations.openMocks(this);
	}

	@Test
	public void getDatasets() throws Exception {
		mockMvc.perform(RestDocumentationRequestBuilders.get("/v1/test").contentType(MediaType.APPLICATION_JSON))
		.andExpect(status().isOk());
	}

}
