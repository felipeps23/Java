package composicion;

public class Persona {

	private String nombre;
	private int edad;
	private Direccion direccion;
	/**
	 * @param nombre
	 * @param edad
	 * @param direccion
	 */
	public Persona(String nombre, int edad, Direccion direccion) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.direccion = direccion;
	}
	
	// Con este constructor podemos crear la persona sin direccion y luego settearla
	public Persona(String string, int i) {
		// TODO Esbozo de constructor generado automáticamente
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public Direccion getDireccion() {
		return direccion;
	}
	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}
	
}
