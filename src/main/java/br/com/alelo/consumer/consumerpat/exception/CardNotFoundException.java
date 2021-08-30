package br.com.alelo.consumer.consumerpat.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND)
public class CardNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 8368328548590496373L;
	
	public CardNotFoundException(String cardNumber) {
		super("Card not found with number: " + cardNumber);
	}
}