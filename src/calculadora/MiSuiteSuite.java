package calculadora;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;


//FULL suite for order all the tests.
@RunWith(value = Suite.class)
@Suite.SuiteClasses({
	CalculadoraTest.class,
	CalculadoraParametroTest.class
})
public class MiSuiteSuite {

}
