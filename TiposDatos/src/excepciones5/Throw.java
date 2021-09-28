package excepciones5;

public class Throw {

	public static void genException() {
		// Naturales son mas largos que los pares
		
		int [] naturales = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; // Tambien se puede poner double para que salgan decimales
		
		int [] pares = {0, 2, 4, 6, 8, 10};
		
		for (int i = 0; i < naturales.length; i++) {
			
			try {
				System.out.println(naturales[i] + " / " + pares[i] + " = " + naturales[i]/pares[i]);
			} catch (ArithmeticException exc) {
				// Capturamos la excepcion
				System.out.println("Lo siento, no se puede dividir por cero...");
			} catch (ArrayIndexOutOfBoundsException exc) {
				// Capturamos la excepcion
				System.out.println("No existe el elemento...");
				
				// Lanzamos manualmente  
				throw exc;
				
			}
				
		}
		
	}
	
}
