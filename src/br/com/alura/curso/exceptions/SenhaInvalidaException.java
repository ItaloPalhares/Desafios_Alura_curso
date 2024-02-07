package br.com.alura.curso.exceptions;

public class SenhaInvalidaException extends RuntimeException {
	
	private String message;
	
	public SenhaInvalidaException(String message) {
		this.message = message;
	}
	
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return this.message;
	}
	
	
		
	}

