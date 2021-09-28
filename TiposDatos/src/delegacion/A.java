package delegacion;

// Delegacion
/*
public class A {

	private B b = new B();
	
	public void metodoA(){
		b.metodoB();
	}
	
}
*/

// Delegacion hibrido
public class A {
	
	private B b = new B();
	
	String comida = "Frutas";
	
	public void metodoA(String comida) {
		
		b.metodoB();
		b.comer(comida);
	}
}
