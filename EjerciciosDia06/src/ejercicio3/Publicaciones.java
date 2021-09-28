package ejercicio3;

public class Publicaciones {

    private String nombre;
    private int año;
    private boolean prestado;

	public Publicaciones(String nombre, int año, boolean prestado) {
		super();
		this.nombre = nombre;
		this.año = año;
		this.prestado = prestado;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getAño() {
		return año;
	}

	public void setAño(int año) {
		this.año = año;
	}

	public boolean getPrestado() {
		return prestado;
	}

	public void setPrestado(boolean prestado) {
		this.prestado = prestado;
	}
	
}