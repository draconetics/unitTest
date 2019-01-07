package calculadora;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

/*
 *	Constructor with parameters on unit test. 
 */

@RunWith(value = Parameterized.class)
public class CalculadoraParametroTest {

	
	//iterable contains parameters for the constructor
	@Parameters
	public static Iterable<Object[]> getData() {
//		List<Object[]> obj = new ArrayList<>();
//		obj.add(new Object[] {2,1,4});
//		obj.add(new Object[] {2,3,5});
//		obj.add(new Object[] {3,3,6});
//		return obj;
		
		return Arrays.asList(new Object [][] {
			{3,1,4}, {2,3,5},{3,3,6}
		});
	}
	
	private int a, b, exp;
	
	public CalculadoraParametroTest(int a, int b, int exp) {
		// TODO Auto-generated constructor stub
		this.a = a;
		this.b = b;
		this.exp = exp;
	}
	
	@Test
	public void testAdd() {
		Calculadora calc = new Calculadora();
		int result = calc.add(a,b);
		assertEquals(exp, result);
	}

}
