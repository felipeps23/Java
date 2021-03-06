package ejercicio4;

public class Persona {
	// Ejercicio 4 
	// Crear una clase Object y comentarla
	// Declaramos las variables del objeto Persona
	private String nombre;
	private int edad;
	private String apellido1;
	private String apellido2;
	private float sueldoAnual;
	
	// Creamos el constructor vacio
	public Persona() {
		super();
	}

	// Creamos el constructor con sus atributos
	public Persona(String nombre, int edad, String apellido1, String apellido2, float sueldoAnual) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.apellido1 = apellido1;
		this.apellido2 = apellido2;
		this.sueldoAnual = sueldoAnual;
	}

	// GETTERS Y SETTERS
	// Obtenemos el nombre del objeto
	public String getNombre() {
		return nombre;
	}

	// Establecemos el nombre del objeto
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	// Obtenemos la edad del objeto
	public int getEdad() {
		return edad;
	}

	// Establecemos la edad del objeto
	public void setEdad(int edad) {
		this.edad = edad;
	}
	// Obtenemos el primer apellido del objeto
	public String getApellido1() {
		return apellido1;
	}
	// Establecemos el primer apellido del objeto
	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}

	// Obtenemos el segundo apellido del objeto
	public String getApellido2() {
		return apellido2;
	}

	// Establecemos el segundo apellido del objeto
	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}

	// Obtenemos el sueldo anual del objeto
	public float getSueldoAnual() {
		return sueldoAnual;
	}

	// Establecemos el sueldo anual del objeto
	public void setSueldoAnual(float sueldoAnual) {
		this.sueldoAnual = sueldoAnual;
	}
	
	// Con este metodo calculamos el sueldo anual del objeto a partir de su sueldo anual
	public float calcularSueldoMensual() {
		float sueldoMensual;
		
		sueldoMensual = getSueldoAnual() / 12; // Dividimos el sueldo anual entre 12 meses que tiene cada a?o
		
		return sueldoMensual;
	}
	
	// Imprimimos por pantalla todos los datos del objeto
	public void imprimirPersona() {
		
		System.out.println("La persona se llama: " + getNombre() + " " + getApellido1() + " " + getApellido2());
		System.out.println("La persona tiene: " + getEdad() + " a?os");
		System.out.println("La persona cobra: " + getSueldoAnual() + "?");
		System.out.println("La persona cobra: " + calcularSueldoMensual() + "? mensualmente");
	}
	
	public static void main(String[] args) {
		// Declaramos los valores de nuestro objeto
		Persona per = new Persona("Felipe", 21, "Pacheco", "Soldado", 16000.5f);
		// Calculamos mediante el metodo propuesto anteriormente el sueldo mensual
		per.calcularSueldoMensual();
		// Mostramos por pantalla nuestro objeto persona con todos sus valores
		per.imprimirPersona();
		
		
	}
	
}
