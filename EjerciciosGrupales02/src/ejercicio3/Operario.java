package ejercicio3;

public class Operario extends Empleado {

	private String grado;
	
	public Operario() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Operario(String nombre, String apellido1, String apellido2, String direccion, String fono, String email,
			String departamento, Double sueldo, String grado) {
		super(nombre, apellido1, apellido2, direccion, fono, email, departamento, sueldo);
		// TODO Auto-generated constructor stub
		this.grado = grado;
	}

	public String getGrado() {
		return this.grado;
	}

	public void setGrado(String grado) {
		this.grado = grado;
	}
	
	public void imprimirOperario() {
		System.out.println("El empleado tiene los siguientes atributos: " + this.getNombre() + " " + this.getApellido1() 
							+ " " + this.getApellido2() + " " + this.getDireccion() + " " + this.getFono() 
							+ " " + this.getEmail() + " " + this.getDepartamento() + " " + this.getSueldo()
							+ " " + this.getGrado());
	}
	
}
