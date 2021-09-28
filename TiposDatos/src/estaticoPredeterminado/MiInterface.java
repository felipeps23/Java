package estaticoPredeterminado;

public interface MiInterface {

	default void defaultMetodo() {
		System.out.println("Predeterminado");
	}
	
	static void staticMetodo() {
		System.out.println("Estatico");
	}
	
}
