package logica;

public class Main {

	public static void main(String[] args) {
		/*
		 *  EJERCICIO 2
		 *  Crear un proyecto llamado Hotel, dentro del proyecto vamos a crear un package 
			llamado logica y dentro del paquete se crearan 3 clases. La primera clase se
			llamara Cliente, la segunda se llamara Habitaciones y finalmente Main donde
			se encontrará nuestro metodo principal main. 
			La clase Cliente tendrá 4 atributos String nombre, int edad, String id, 
			float dineroDisponible.
			La clase Habitaciones tendrá 2 atributos int dias, float valorDias.
			En la clase Main se instanciará 2 obtejos donde se realizaran las
			impresiones de sus datos. 1 con parámetros Cliente, 1 sin parámetros 
			Habitaciones.
		 */
		
		Cliente clie = new Cliente("Felipe",21,"12345678W",1000);
		
		System.out.println("El nombre del cliente es: " + clie.getNombre() + ",con una edad de: " + 
															clie.getEdad() + " años, tiene la id: " + 
															clie.getId() + " y dispone de " + 
															clie.getDineroDisponible() + "€");
		
		Habitaciones hab = new Habitaciones();
		hab.setDias(27);
		hab.setValorDias(20f);

		System.out.println("El cliente se quedará en la habitación por " + hab.getDias() + " días, con un valor de " + hab.getValorDias() + "€");
		
		
		Cliente clie2 = new Cliente("Patricio", 50, "98765432P", 250.7f);
		clie2.imprimirCliente();
		
		Habitaciones hab2 = new Habitaciones(2,7.5f);
		System.out.println(hab2.calculoNoches(hab2.getDias(), hab2.getValorDias()));
		
		System.out.println("Se hospeda durante " + hab2.calculoDiasSobra(clie2.getDineroDisponible(), hab2.getValorDias()) + " días");
		System.out.println("El dinero que le sobra es: " + hab2.calculoDineroRestante(clie2.getDineroDisponible(), hab2.getValorDias()) + "€");

	}

}
