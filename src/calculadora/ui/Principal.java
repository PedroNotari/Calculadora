package calculadora.ui;

import java.util.Scanner;

import calculadora.model.Operacao;
import calculadora.service.CalculadoraService;

public class Principal {

	public static void main(String[] args) {

		CalculadoraService servico = new CalculadoraService();
		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite o primeiro número: ");
		double a = scanner.nextDouble();

		System.out.print("Digite o segundo número: ");
		double b = scanner.nextDouble();

		double resultado = servico.calcular(Operacao.SOMA, a, b);
		System.out.println("Resultado: " + resultado);

		scanner.close();
	}

}
