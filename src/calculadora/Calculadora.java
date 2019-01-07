package calculadora;

public class Calculadora {

	
	private int result;
	
	public Calculadora() {
		result = 0;
	}
	
	
	public int add(int a, int b) {
		result = a + b; 
		return result;
	}
	
	public int sub(int a, int b) {
		result = a - b; 
		return result;
	}

	public int add(int v) {
		result += v; 
		return result;
	}
	
	public int sub(int v) {
		result -= v;
		return result;
	}
	
	public void clear() {
		result = 0;
	}
}
