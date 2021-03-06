package ejercicio5;

public class Ejercicio5 {

	public static void main(String[] args) {
		// Ejercicio 5
		// Implementar una interface con tres m?todos
		// Interface
		interface Vehiculo {
			public void avanzar(); // interface method (does not have a body)
		    public void retroceder(); // interface method (does not have a body)
		    public void estacionar(); // interface method (does not have a body)

		}
		
		class Coche implements Vehiculo {
			  public void avanzar() {
			    // The body of avanzar() is provided here
			    System.out.println("El coche esta avanzando");
			  }
			  
			  public void retroceder() {
			    // The body of retroceder() is provided here
				  System.out.println("El coche esta retrocediendo");
			  }
			  
			  public void estacionar() {
			    // The body of estacionar() is provided here
				  System.out.println("El coche esta estacionado");
			  }
		}
		
		Coche myCar = new Coche();  // Create a Coche object
	    myCar.avanzar();
	    myCar.retroceder();
	    myCar.estacionar();

	}
}