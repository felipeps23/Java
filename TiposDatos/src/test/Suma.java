package test;

public class Suma {

	public static void main(String[] args) {
		
		int n1 = 2;
		int n2 = 3;
		suma (n1, n2);
	}
	
	public static int suma(int num1, int num2) {
		
		int resultado = num1 + num2;
		System.out.println("El resultado de " + num1 + " y " + num2 + " es: " + resultado);
		return resultado;
	}
	
	public static int mdivision(int num1, int num2) {
		if(num2 == 0) {
			throw new ArithmeticException("No puedes dividir por cero");
		}
		
		int resultado = num1 / num2;
		return resultado;
	}
	
}
