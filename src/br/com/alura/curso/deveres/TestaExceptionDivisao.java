package br.com.alura.curso.deveres;

import java.util.Scanner;

import br.com.alura.curso.classes.DivideNumeros;

public class TestaExceptionDivisao {

	public static void main(String[] args) {
		double num1 = 0;
		double num2 = 0;
		Scanner input = new Scanner(System.in);
		System.out.print("Digite o primeiro numero: ");
		num1 = input.nextDouble();
		System.out.print("Digite o segundo numero: ");
		num2 = input.nextDouble();
		
		System.out.println(new DivideNumeros().divisor(num1, num2));

	}

}
