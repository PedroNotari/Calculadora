package calculadora.ui;

import java.util.Scanner;

import calculadora.model.Operacao;
import calculadora.service.CalculadoraService;

public class Principal {

	public static void main(String[] args) {

		CalculadoraService servico = new CalculadoraService();
		Scanner scanner = new Scanner(System.in);

		System.out.println("1 - Soma");
		System.out.println("2 - Subtração");
		System.out.println("3 - Multiplicação");
		System.out.println("4 - Dividir");
		System.out.print("Escolha a operação: ");
		int opcao = scanner.nextInt();

		Operacao operacao;
		switch (opcao) {
		case 1:
			operacao = Operacao.SOMA;
			break;

		case 2:
			operacao = Operacao.SUBTRACAO;
			break;

		case 3:
			operacao = Operacao.MULTIPLICACAO;
			break;
		case 4:
			operacao = Operacao.DIVISAO;
			break;
		default:
			System.out.println("Opção Inválida");
			return;
		}

		System.out.print("Digite o primeiro número: ");
		double a = scanner.nextDouble();

		System.out.print("Digite o segundo número: ");
		double b = scanner.nextDouble();

	try {
		double resultado = servico.calcular(operacao, a, b);
		System.out.println("Resultado: " + resultado);
	} catch (ArithmeticException e) {
		System.out.println("Erro: " + e.getMessage());
	}
		scanner.close();
	}

}
