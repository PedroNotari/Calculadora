package calculadora.ui;

import java.util.InputMismatchException;
import java.util.Scanner;

import calculadora.model.Operacao;
import calculadora.service.CalculadoraService;

public class Principal {

	public static void main(String[] args) {

		CalculadoraService servico = new CalculadoraService();
		Scanner scanner = new Scanner(System.in);

		int opcao = -1;

		while (opcao != 0) {

			System.out.println("1 - Soma");
			System.out.println("2 - Subtração");
			System.out.println("3 - Multiplicação");
			System.out.println("4 - Dividir");
			System.out.println("0 - Encerrar calculadora");
			opcao = lerInt(scanner, "Escolha a operação: ");

			if (opcao == 0) {
				System.out.println("Calculadora encerrada.");
				break;
			}

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
				continue;
			}

			double a = lerDouble(scanner, "Digite o primeiro número: ");
			double b = lerDouble(scanner, "Digite o segundo número: ");

			try {
				double resultado = servico.calcular(operacao, a, b);
				System.out.println("Resultado: " + resultado);
			} catch (ArithmeticException e) {
				System.out.println("Erro: " + e.getMessage());
			}

		}

		scanner.close();

	}

	private static double lerDouble(Scanner scanner, String mensagem) {
		while (true) {
			System.out.print(mensagem);
			try {
				return scanner.nextDouble();
			} catch (InputMismatchException e) {
				System.out.println("Entrada Inválida. Digite um número.");
				scanner.nextLine();
			}
		}
	}

	private static int lerInt(Scanner scanner, String mensagem) {
		while (true) {
			System.out.print(mensagem);
			try {
				return scanner.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("Entrada Inválida. Digite um número.");
				scanner.nextLine();
			}
		}
	}
}
