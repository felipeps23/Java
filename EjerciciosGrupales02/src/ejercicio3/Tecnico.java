package ejercicio3;

public class Tecnico extends Operario{

	private String especialidad;
	
	public Tecnico() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Tecnico(String nombre, String apellido1, String apellido2, String direccion, String fono, String email,
			String departamento, Double sueldo, String grado, String especialidad) {
		super(nombre, apellido1, apellido2, direccion, fono, email, departamento, sueldo, grado);
		// TODO Auto-generated constructor stub
		this.especialidad = especialidad;
	}

	public String getEspecialidad() {
		return this.especialidad;
	}

	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}
}
