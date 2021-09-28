package logica;

public class Cliente {
	
	private String nombre;
	private int edad;
	private String id;
	private float dineroDisponible;
	
	public Cliente(String nombre, int edad, String id, float dineroDisponible) {
		
		this.nombre = nombre;
		this.edad = edad;
		this.id = id;
		this.dineroDisponible = dineroDisponible;
	}
	
	// Accesadores o get
	public String getNombre() {
		return this.nombre;
	}
	
	public int getEdad() {
		return this.edad;
	}
	
	public String getId() {
		return this.id;
	}
	
	public float getDineroDisponible() {
		return this.dineroDisponible;
	}

	// Método utilitario
	public void imprimirCliente() {
		System.out.println("Nombre del cliente: " + this.nombre);
		System.out.println("Edad del cliente: " + this.edad);
		System.out.println("DNI del cliente: " + this.id);
		System.out.println("Dinero disponible: " + this.dineroDisponible);
	}
	
}
