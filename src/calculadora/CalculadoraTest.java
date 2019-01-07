package calculadora;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculadoraTest {

	@Test
	public void testSuma() {
		int result = Calculadora.suma(2, 3);
		int expected = 5;//2+3=5
		
		assertEquals(expected, result);
		
	}
	
	@Test
	public void testResta() {
		int result = Calculadora.resta(3, 2);
		int expected = 1;
		assertEquals(expected, result);
	}

}
