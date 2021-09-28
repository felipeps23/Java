package logica;

public class Principal2 {

	public static void main(String[] args) {
		// Creación o instancia de una clase (Crear un objeto)
		
		// Creación de objeto con método constructor sin parámetros
		Persona per = new Persona();
		// Creacion de objeto con método constructor con parámetros
		Persona per2 = new Persona("Felipe",21);
		// Ubicación en memoria del objeto
		System.out.println(per);
		System.out.println(per2);
		
		// Objeto 1
		per.setNombre("Pepe");
		per.setEdad(27);
		System.out.println(per.getNombre());
		System.out.println(per.getEdad());
		
		// Objeto 2
		System.out.println(per2.getNombre());
		System.out.println(per2.getEdad());		
	}

}
