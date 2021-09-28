package padreHijo;

public class Principal {

	public static void main(String[] args) {
		
		Hijo HijoUno = new Hijo(40);
		Hijo HijoDos = new Hijo(50);
		
		HijoUno.comer();
		HijoUno.conducir();
		HijoUno.trabajar("Constructor");
		HijoDos.trabajar("DJ");
		
		System.out.println(HijoUno.getAltura());
		
	}

}
