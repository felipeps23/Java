package interfax;

public class ClaseInterfaz {

	public static void main(String[] args) {
		
		interface Animal {
			public  void generaSonido();
			public void dormir();
		}
		
		class Gato implements Animal {
			public void generaSonido() {
				System.out.println("Miau");
			}
			
			public void dormir() {
				System.out.println("ZzZzZz");
			}
		}
		
		Gato myGato = new Gato();  // Create a Gato object
	    myGato.generaSonido();
	    myGato.dormir();
		
	}

}
