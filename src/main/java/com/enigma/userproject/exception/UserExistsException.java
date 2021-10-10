package com.enigma.userproject.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.BAD_REQUEST, reason = "User Exists")
public class UserExistsException extends RuntimeException {

	public UserExistsException(String message) {
		// TODO Auto-generated constructor stub
		super(message);
		
	}

}
