package com.enigma.userproject.exception;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.REQUESTED_RANGE_NOT_SATISFIABLE, reason = "Age limit Check")
public class AgeLimitException extends RuntimeException {

	public AgeLimitException(String message) {
		// TODO Auto-generated constructor stub
		super(message);
		
	}

}
