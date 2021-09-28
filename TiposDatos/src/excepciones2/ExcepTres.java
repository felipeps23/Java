package excepciones2;

public class ExcepTres {

	public static void main(String[] args) {
		
		int [] numero = new int[10];
		
		try {
			
			ExcepDos.genExcepcion();
			
		} catch (ArrayIndexOutOfBoundsException e) {
			
			System.out.println("Indice esta fuera de los limites");
		}
		
		System.out.println("Despues de la excepcion");
	}
	
}
