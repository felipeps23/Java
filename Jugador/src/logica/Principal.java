package logica;

public class Principal {

	public static void main(String[] args) {
		/*
		 *  EJERCICIO 1
		 *  Crear un proyecto llamado Jugador, dentro del proyecto 
			vamos a crear un package llamado lógica y dentro del paquete
			se crearan dos clases, una de ellas se llamara Gamer y la otra Principal
			La clase Gamer tendrá tres atributos String nombre, int nivel(3 niveles),
			char sexo('M','F','D')
			En Principal se instanciará 3 objetos, 2 objetos sin parámetros y 1 con 
			parámetros (los atributos deben tener datos en su interior)
			Finalmente mediante el System.out.println() mostrará por consola los datos
			de los jugadores.
		 */
		// Creación o instancia de una clase (Crear un objeto)
		
		// Creación de objeto con método constructor sin parámetros
		Gamer gam = new Gamer();
		Gamer gam2 = new Gamer();
		// Creacion de objeto con método constructor con parámetros
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
