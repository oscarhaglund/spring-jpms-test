/**
 * Copyright (C) Spacemetric AB, Sweden
 * http://www.spacemetric.com/
 */
package com.spacemetric.spring.jpmstest.auth;

import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.stereotype.Component;

@Component
public class FooAuthenticationProvider implements AuthenticationProvider {

	/*
	 * (non-Javadoc)
	 * @see org.springframework.security.authentication.AuthenticationProvider#authenticate(org.springframework.security.core.Authentication)
	 */
	@Override
	public Authentication authenticate(Authentication auth) throws AuthenticationException {
		//Bla bla
		return auth;
	}

	/*
	 * (non-Javadoc)
	 * @see org.springframework.security.authentication.AuthenticationProvider#supports(java.lang.Class)
	 */
	@Override
	public boolean supports(Class<?> arg0) {
		return true;
	}

}
