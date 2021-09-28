package excepciones2;

public class ExcepDos {
	// Generar una excepcion
	
	static void genExcepcion() {
		int [] numero = new int[10];
		
		numero[10] = 12;
		
		System.out.println("Antes de que se genere la excepcion");
		
		numero[11] = 10;
		
		System.out.println("Esto no se mostrara");
	}
	
	

}
