package com.enigma.userproject.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND, reason = "User Not Found")
public class UserNotFountException extends RuntimeException {

	public UserNotFountException(String message) {
		// TODO Auto-generated constructor stub
		super(message);
		
	}

}
