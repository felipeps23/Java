package excepciones6;

public class ClaseFinally {

	private static int x;
	
	public static void genException(int valor) {
		
		int [] numero = new int[10];
		
		System.out.println("Recibimos el numero " + valor);
		
		try {
			
			switch(valor) {
				case 0: x = 10 / valor; 
					break;
				case 1: numero[10] = 5; // Generamos un error de indexacion
					break;
				case 2: return; // Que devuelve?
				default :
			}
			
		} catch (ArithmeticException exc) {
			// TODO: handle exception
			System.out.println("No se puede dividir por cero...");
			return;
		} catch (ArrayIndexOutOfBoundsException exc) {
			// Capturamos el exc
			System.out.println("Elemento inexistente");
		}
		
		finally {
			// Este codigo de bloque se ejecuta si o si
			System.out.println("Salida del try-catch");
		}
	}
	
}
