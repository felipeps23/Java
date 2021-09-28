package logica;

public class Principal {

	public static void main(String[] args) {
		/*
		 *  EJERCICIO 1
		 *  Crear un proyecto llamado Jugador, dentro del proyecto 
			vamos a crear un package llamado l�gica y dentro del paquete
			se crearan dos clases, una de ellas se llamara Gamer y la otra Principal
			La clase Gamer tendr� tres atributos String nombre, int nivel(3 niveles),
			char sexo('M','F','D')
			En Principal se instanciar� 3 objetos, 2 objetos sin par�metros y 1 con 
			par�metros (los atributos deben tener datos en su interior)
			Finalmente mediante el System.out.println() mostrar� por consola los datos
			de los jugadores.
		 */
		// Creaci�n o instancia de una clase (Crear un objeto)
		
		// Creaci�n de objeto con m�todo constructor sin par�metros
		Gamer gam = new Gamer();
		Gamer gam2 = new Gamer();
		// Creacion de objeto con m�todo constructor con par�metros
		Gamer gam3 = new Gamer("Pepe",2,'D');
		
		// Objeto 1
		gam.setNombre("Sara");
		gam.setNivel(3);
		gam.setSexo('F');
		System.out.println(gam.getNombre());
		System.out.println(gam.getNivel());
		System.out.println(gam.getSexo());
		System.out.println("El nombre es " + gam.getNombre() + " con un nivel de " + gam.getNivel() + " y su sexo es " + gam.getSexo());
		
		// Objeto 2
		gam2.setNombre("Felipe");
		gam2.setNivel(1);
		gam2.setSexo('M');
		System.out.println(gam2.getNombre());
		System.out.println(gam2.getNivel());
		System.out.println(gam2.getSexo());
		System.out.println("El nombre es " + gam2.getNombre() + " con un nivel de " + gam2.getNivel() + " y su sexo es " + gam2.getSexo());
		
		// Objeto 3
		System.out.println(gam3.getNombre());
		System.out.println(gam3.getNivel());	
		System.out.println(gam3.getSexo());
		System.out.println("El nombre es " + gam3.getNombre() + " con un nivel de " + gam3.getNivel() + " y su sexo es " + gam3.getSexo());

	}

}
