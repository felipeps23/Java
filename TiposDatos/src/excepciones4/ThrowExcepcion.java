package excepciones4;

public class ThrowExcepcion {
	
	public static void main(String[] args) {
		// Excepcion que salte de forma manual con la instruccion Throw	
			
		try {
			System.out.println("Antes de iniciar manualmente la excepcion: ");
			throw new ArithmeticException(); // Iniciar la excepcion manualmente
		} catch (ArithmeticException exc) {
			// Capturando Excepcion
			System.out.println("Capturamos la Excepcion");
		}
		
		System.out.println("Despues de try/catch");
	}
}
