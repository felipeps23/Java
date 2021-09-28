package ejercicio3;

public class Oficial extends Operario {

	private String nivel;
	
	public Oficial() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Oficial(String nombre, String apellido1, String apellido2, String direccion, String fono, String email,
			String departamento, Double sueldo, String grado, String nivel) {
		super(nombre, apellido1, apellido2, direccion, fono, email, departamento, sueldo, grado);
		// TODO Auto-generated constructor stub
		this.nivel = nivel;
	}

	public String getNivel() {
		return this.nivel;
	}

	public void setNivel(String nivel) {
		this.nivel = nivel;
	}
}
