package calculadora;

public class calculadora {
	private int num1;
	private int num2;

	calculadora(int a , int b){
		num1=a;
		num2=b;
	}
	
	public int suma() {
		return num1 + num2;
	}
	public int resta() {
		return num1 - num2;
	}
	public int multiplicacion() {
		return num1 * num2;
	}
	
	public int division() {
		return num1 /num2;
	
	}	

	
}
