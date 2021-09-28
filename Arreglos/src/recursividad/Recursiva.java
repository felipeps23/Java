package recursividad;

public class Recursiva {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente
		int resultado = suma(6);
		System.out.println(resultado);
		
	}
	
	public static int suma(int x) {
		if (x > 0) {
			return x + suma(x - 1);
		} else
			return 0;
	}

}
