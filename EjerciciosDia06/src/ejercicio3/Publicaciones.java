package ejercicio3;

public class Publicaciones {

    private String nombre;
    private int a�o;
    private boolean prestado;

	public Publicaciones(String nombre, int a�o, boolean prestado) {
		super();
		this.nombre = nombre;
		this.a�o = a�o;
		this.prestado = prestado;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getA�o() {
		return a�o;
	}

	public void setA�o(int a�o) {
		this.a�o = a�o;
	}

	public boolean getPrestado() {
		return prestado;
	}

	public void setPrestado(boolean prestado) {
		this.prestado = prestado;
	}
	
}