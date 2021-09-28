package ejercicio2;

public class Funcionario {
	
	private String rut;
	private String nombre;
	private String apellido;
	private String domicilio;
	private String fechanac;
	private Double sueldoB;
	
	public Funcionario() {
		
	}
	
	public Funcionario(String rut, String nombre, String apellido, String domicilio, String fechanac, Double sueldoB) {
		super();
		this.rut = rut;
		this.nombre = nombre;
		this.apellido = apellido;
		this.domicilio = domicilio;
		this.fechanac = fechanac;
		this.sueldoB = sueldoB;
	}

	public String getRut() {
		return this.rut;
	}

	public void setRut(String rut) {
		this.rut = rut;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return this.apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getDomicilio() {
		return this.domicilio;
	}

	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}

	public String getFechanac() {
		return this.fechanac;
	}

	public void setFechanac(String fechanac) {
		this.fechanac = fechanac;
	}

	public Double getSueldoB() {
		return this.sueldoB;
	}

	public void setSueldoB(Double sueldoB) {
		this.sueldoB = sueldoB;
	}
	
	public void getAtributos() {
		System.out.println(this.rut + ", " + this.apellido + " " + this.nombre + ", " + this.fechanac + ", " + this.sueldoB);
	}
	
}
