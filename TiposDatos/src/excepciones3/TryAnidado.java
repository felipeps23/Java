package excepciones3;

public class TryAnidado {

	public static void main(String[] args) {
		
		int [] naturales = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		int [] pares = {0, 2, 4, 6, 8, 10};
		
		// Try externo
		try {
			
			for (int i = 0; i < naturales.length; i++) {
				// Try anidado
				try {
					System.out.println(naturales[i] + " / " + pares[i] + " = " + naturales[i]/ pares[i]);
				} catch (ArithmeticException exc) {
					// TODO: handle exception
					System.out.println("No se puede dividir por cero!!!");
				}
				
			}
			
		} catch (ArrayIndexOutOfBoundsException exc) {
			// TODO: handle exception
			System.out.println("Ocurrio una excepcion");
			System.out.println("Error: Adios......");
		}
		
	}
	
}
