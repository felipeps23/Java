package excepciones5;

public class ReThrow {

	public static void main(String[] args) {
		// TODO Esbozo de m�todo generado autom�ticamente

		try {
			// Re lanzar la excepcion
			Throw.genException();
		
		} catch (ArrayIndexOutOfBoundsException exc) {
			// TODO: handle exception
			System.out.println("Error - Programa finalizado");
		}
		
	}

}
