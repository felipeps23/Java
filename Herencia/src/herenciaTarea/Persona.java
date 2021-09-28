package herenciaTarea;

public class Persona {

	private String nombre;
	private int edad;
	private double sueldo;
	
	public Persona() {
		
	}
	
	public Persona(String nombre, int edad, double sueldo) {
		this.nombre = nombre;
		this.edad = edad;
		this.sueldo = sueldo;
	}

	public String getNombre() {
		return this.nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public int getEdad() {
		return this.edad;
	}


	public void setEdad(int edad) {
		this.edad = edad;
	}

	public double getSueldo() {
		return this.sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}	
	
}
