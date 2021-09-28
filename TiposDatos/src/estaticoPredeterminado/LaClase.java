package estaticoPredeterminado;

public class LaClase implements MiInterface{

	public static void main(String[] args) {
		
		MiInterface.staticMetodo();
		staticMetodo(); // LaClase.staticMetodo();
		// MiInterface.defaultMetodo() no se puede, ya que el metodo no es estatico 
		
	}
	
	static void staticMetodo() {
		System.out.println("Otro metodo estatico");
	}
	
}
