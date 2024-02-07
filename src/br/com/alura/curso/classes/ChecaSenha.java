package br.com.alura.curso.classes;

import br.com.alura.curso.exceptions.SenhaInvalidaException;

public class ChecaSenha {
	
public ChecaSenha() {
	
}

	public boolean checarSenhaString(String senha) {
		boolean resultado = false;
		try {
			if(senha.length()< 8) {
				throw new SenhaInvalidaException("Utilizar um senha com o minimo de 8 caracteres.");
			} else resultado = true;
		} catch(SenhaInvalidaException e) {
			System.out.println(e.getMessage());
		} return resultado;
	}

}
