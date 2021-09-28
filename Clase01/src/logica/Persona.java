package logica;

public class Persona {

	// Atributos-propiedades
	// Declaramos variables de la clase
	private String nombre;
	private int edad;
	
	// Método Constructor sin parámetros
	public Persona() {
		
	}
	
	// Método Constructor con parámetros IMPORTANTE en el orden en el que se han declarado
	public Persona(String nombre, int edad) {
		
		this.nombre=nombre; // Palabra clave, son reservadas y no se pueden usar para nombres de clases ni variables
		this.edad=edad;
	}
	
	// Métodos o funciones accesadores(get) o mutadores(set)
	// Accesadores o get
	public String getNombre() {
		return this.nombre;
	}
	
	public int getEdad() {
		return this.edad;
	}
	
	// Mutadores o set
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
}