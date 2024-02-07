package br.com.alura.curso.classes;

import br.com.alura.curso.exceptions.DivisaoPorZeroException;

public class DivideNumeros {

	public double divisor(double num, double num2) {
		double resultado = 0;
		try {
			if (num2 == 0) {
				throw new DivisaoPorZeroException("Falha: não é possível dividir por zero.");
			}
			resultado = num / num2;
		} catch (DivisaoPorZeroException e) {
			System.out.println(e.getMessage());
		}
		return resultado;

	}
}
