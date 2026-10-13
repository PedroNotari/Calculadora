package calculadora.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

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

}
