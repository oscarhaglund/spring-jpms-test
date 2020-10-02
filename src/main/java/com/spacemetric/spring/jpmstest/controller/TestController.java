/**
 * Copyright (C) Spacemetric AB, Sweden
 * http://www.spacemetric.com/
 */
package com.spacemetric.spring.jpmstest.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Oscar Haglund
 *
 */
@RestController
@RequestMapping(TestController.CONTROLLER_URL_PATH)
public class TestController {

		public static final String CONTROLLER_URL_PATH = "/v1/test";

		@RequestMapping(method = RequestMethod.GET)
		public String getDatasetByID() {

			return "test";
		}

}
