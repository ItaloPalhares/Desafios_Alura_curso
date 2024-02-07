package br.com.alura.curso.exceptions;

public class DivisaoPorZeroException extends RuntimeException {
	private String msg;
	
	public DivisaoPorZeroException(String msg) {
		this.msg = msg;
	}

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return this.msg;
	}
}
