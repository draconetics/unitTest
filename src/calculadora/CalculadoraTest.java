package calculadora;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CalculadoraTest {

	private Calculadora calc;
	
	@Before
	public void before() {
		System.out.println("before();");
		calc = new Calculadora();
	}
	
	@After
	public void after() {
		System.out.println("after();");
	}
	
	@Test
	public void testSum() {
		System.out.println("sum();");
		calc = new Calculadora();
		int result = calc.add(3,2);
		int expected = 5;
		
		assertEquals(expected, result);
	}
	
	@Test
	public void testAnsSum() {
		System.out.println("ansSum();");
		
		calc = new Calculadora();
		int result = calc.add(3,2);
		int expected = 5;
		
		assertEquals(expected, result);
	}
}
