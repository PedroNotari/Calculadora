package calculadora.service;

import calculadora.model.Operacao;

public class CalculadoraService {

	public double somar(double a, double b) {
		return a + b;
	}
	
	public double subtrair(double a, double b) {
		return a - b;
	}

	public double multiplicar(double a, double b) {
		return a * b;
	}

	public double dividir(double a, double b) {
		if (b == 0) {
			throw new ArithmeticException("Divisão por zero não é permitida");	
		}
		return a / b;
	}
	
	public double calcular(Operacao operacao, double a, double b) {
		switch(operacao) {
			case SOMA:
				return somar(a, b);
			case SUBTRACAO:
				return subtrair(a, b);
			case MULTIPLICACAO:
				return multiplicar(a, b);
			case DIVISAO:
				return dividir(a, b);
			default:
				throw new IllegalArgumentException("Operação Inválida");
		}
	}

}
