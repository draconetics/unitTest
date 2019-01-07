package calculadora;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculadoraTest {
	
	static Calculadora calc;
	
	@BeforeClass
	public static void beforeClass() {
		System.out.println("beforeClass()");
		calc = new Calculadora();
	}
	
	@Before
	public void before() {
		System.out.println("before();");
		calc.clear(); 
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
	
//	//proof unit advanced
//	@Test( expected = ArithmeticException.class )
//	public void testDiv() {
//		calc.div(5,0);
//	}
//	
//	@Test(timeout = 100)//miliseconds.
//	public void testAlgoritmoOptimo() {
//		calc.enhancedOperation();
//	}
	
	@AfterClass
	public static void afterClass() {
		System.out.println("afterClass()");
	}
}
