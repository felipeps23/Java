package excepciones5;

public class ReThrow {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente

		try {
			// Re lanzar la excepcion
			Throw.genException();
		
		} catch (ArrayIndexOutOfBoundsException exc) {
			// TODO: handle exception
			System.out.println("Error - Programa finalizado");
		}
		
	}

}
