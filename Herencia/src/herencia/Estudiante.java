package herencia;

public class Estudiante extends Persona{

	private int notas;

	public Estudiante(String nombre, int edad, int notas) {
		super(nombre, edad);
		this.notas = notas;
	}

	public int getNotas() {
		return this.notas;
	}

	public void setNotas(int notas) {
		this.notas = notas;
	}
		
	public void imprimir() {
		System.out.println("Nombre: " + super.getNombre());
		System.out.println("Edad: " + super.getEdad());
		System.out.println("Notas: " + this.notas);
	}
	
}
