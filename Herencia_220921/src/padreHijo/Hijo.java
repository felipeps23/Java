package padreHijo;

public class Hijo extends Padre{

	private double promedio = 50;
	
	public Hijo(double promedio) {
		super();
		this.promedio = promedio;
	}

	public Hijo(String nombre, int edad, String dni, String sexo, double altura, String colorPiel, String colorOjos, double promedio) {
		super(nombre, edad, dni, sexo, altura, colorPiel, colorOjos);
		this.promedio = promedio;
	}

	public double getPromedio() {
		return promedio;
	}

	public void setPromedio(double promedio) {
		this.promedio = promedio;
	}

	// Métodos propios
	public void estudiar() {
		System.out.println("Esta estudiando");
	}
	
	public void ayudar() {
		System.out.println("Esta ayudando");
	}
	
}
