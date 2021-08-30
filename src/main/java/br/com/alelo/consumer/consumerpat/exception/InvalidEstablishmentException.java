package br.com.alelo.consumer.consumerpat.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.CONFLICT)
public class InvalidEstablishmentException extends RuntimeException {

	private static final long serialVersionUID = -7113869827868170946L;
	
	public InvalidEstablishmentException() {
		super("Invalid Establishment for current card buy!");
	}

}