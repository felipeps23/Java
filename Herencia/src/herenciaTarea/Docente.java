package herenciaTarea;

public class Docente extends Persona {
	private String id;
	private int cursosImpartidos;
	private char sexo;
	
	
	public Docente(String nombre, int edad, double sueldo, String id, int cursosImpartidos, char sexo) {
		super(nombre, edad, sueldo);
		this.id = id;
		this.cursosImpartidos = cursosImpartidos;
		this.sexo = sexo;
	}


	public String getId() {
		return this.id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public int getCursosImpartidos() {
		return this.cursosImpartidos;
	}


	public void setCursosImpartidos(int cursosImpartidos) {
		this.cursosImpartidos = cursosImpartidos;
	}


	public char getSexo() {
		return this.sexo;
	}


	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	
	public void imprimir() {
		System.out.println("Nombre: " + super.getNombre());
		System.out.println("Edad: " + super.getEdad());
		System.out.println("Sueldo anual: " + super.getSueldo() + "€");
		System.out.println("Id: " +this.id);
		System.out.println("Cursos Impartidos: " +this.cursosImpartidos);
		System.out.println("Sexo: " +this.sexo);
	}
	
	public double calcularSueldoMensual(double sueldo) {
		double sueldoMensual;
		sueldoMensual = sueldo / 12;
		
		return sueldoMensual;
	}
	
	public int calcularCursosRestantes(int cursosImpartidos) {
		int cursosRestantes;
		cursosRestantes = 10 - cursosImpartidos;
		
		return cursosRestantes;
	}
	
}
