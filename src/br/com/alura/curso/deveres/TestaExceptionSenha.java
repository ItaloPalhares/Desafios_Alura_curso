package br.com.alura.curso.deveres;

import java.util.Scanner;

import br.com.alura.curso.classes.ChecaSenha;

public class TestaExceptionSenha {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("senha: ");
		String senha = input.next();
		System.out.println(new ChecaSenha().checarSenhaString(senha));
	}

}
