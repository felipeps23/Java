package ejercicio3;

public class Directivo extends Empleado {

	public Directivo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Directivo(String nombre, String apellido1, String apellido2, String direccion, String fono, String email,
			String departamento, Double sueldo) {
		super(nombre, apellido1, apellido2, direccion, fono, email, departamento, sueldo);
		// TODO Auto-generated constructor stub
	}
	
	public void calcularSueldoAnual() {
		double sueldoAnual;
		
		sueldoAnual = this.getSueldo() * 12;
		
		System.out.println("El sueldo anual del directivo " + this.getNombre() + " es: " + sueldoAnual + "€");
	}
}
