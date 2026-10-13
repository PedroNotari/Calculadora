package calculadora.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class CalculadoraServiceTest {

	private CalculadoraService servico = new CalculadoraService();
	
	@Test
	void deveSomarDoisNumeros() {
		assertEquals(5.0, servico.somar(2, 3));
	}

	@Test
	void deveSubtrairDoisNumeros() {
		assertEquals(1.0, servico.subtrair(4,  3));
	}

	@Test
	void deveMultiplicarDoisNumeros() {
		assertEquals(6.0, servico.multiplicar(2, 3));
	}

	@Test
	void deveDividirDoisNumeros() {
		assertEquals(2.5, servico.dividir(5, 2));
	}

	@Test
	void deveLancarExcecaoNaDivisaoPorZero() {
		assertThrows(ArithmeticException.class, () -> servico.dividir(10, 0));
	}
}