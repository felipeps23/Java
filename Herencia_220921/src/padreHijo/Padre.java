package padreHijo;

public class Padre {
	
	private String nombre = "Pedro";
	private int edad = 50;
	private String dni = "12345678W";
	private String sexo = "Masculino"; 
	private double altura = 1.73;
	private String colorPiel = "Moreno";
	private String colorOjos = "Cafes";
	
	public Padre() {
		super();
	}

	public Padre(String nombre, int edad, String dni, String sexo, double altura, String colorPiel, String colorOjos) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.dni = dni;
		this.sexo = sexo;
		this.altura = altura;
		this.colorPiel = colorPiel;
		this.colorOjos = colorOjos;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return this.edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getDni() {
		return this.dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getSexo() {
		return this.sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public double getAltura() {
		return this.altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public String getColorPiel() {
		return this.colorPiel;
	}

	public void setColorPiel(String colorPiel) {
		this.colorPiel = colorPiel;
	}

	public String getColorOjos() {
		return this.colorOjos;
	}

	public void setColorOjos(String colorOjos) {
		this.colorOjos = colorOjos;
	}
	
	// Métodos propios
	public void disciplinar() {
		System.out.println("Este puede disciplinar");
		
	}
	
	public void conducir() {
		System.out.println("Conduce auto");
	}
	
	public void trabajar(String trabajo) {
		System.out.println("Trabaja como " + trabajo);
	}
	
	public void comer() {
		System.out.println("Comiendo...");
	}
}
