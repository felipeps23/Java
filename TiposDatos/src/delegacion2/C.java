package delegacion2;

public class C {
	//Objeto asociado a la delegacion
	
	private A a = new A();
	
	public void metodo1() {
		a.f();
	}
	
	public void metodo2() {
		a.g();
	}
	
	// Atributos normales
	X x = new X();
	
	public void y() {
		// Algo
	}
}
