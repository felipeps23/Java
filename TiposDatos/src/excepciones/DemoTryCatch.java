package excepciones;

public class DemoTryCatch {
	/*
	try {
		// Bloque de codigo para monitorear errores
		
	} catch {
		// Manejar tipo de excepcion
		
	}
	*/
	
	public static void main(String[] args) {
		
		int numeros[] = new int[5];
		
		try {
			System.out.println("Valido que esto se cumpla");
			numeros[2] = 10; // Si pongo un [6] entrara al catch
			
		} catch (ArrayIndexOutOfBoundsException exc) {
			System.out.println("Indice fuera del limite");
		}
		
		System.out.println("Despues de la excepcion");
	}
	
}
