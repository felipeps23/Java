package modelo;

public class Cliente{

	private int idCliente;
	private String nombre;
	private int telefono;
	private String email;
	private String rubro;
	private String direccion;
	
	/**
	 * 
	 */
	public Cliente() {
		super();
	}
	
	/**
	 * @param id
	 * @param nombre
	 * @param telefono
	 * @param email
	 * @param edad
	 * @param rubro
	 * @param direccion
	 */
	public Cliente(int idCliente, String nombre, int telefono, String email, String rubro, String direccion) {
		super();
		this.idCliente = idCliente;
		this.nombre = nombre;
		this.telefono = telefono;
		this.email = email;
		this.rubro = rubro;
		this.direccion = direccion;
	}
	
	public Cliente(String nombre, int telefono, String email, String rubro, String direccion) {
		super();
		this.nombre = nombre;
		this.telefono = telefono;
		this.email = email;
		this.rubro = rubro;
		this.direccion = direccion;
	}


	public int getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getRubro() {
		return rubro;
	}

	public void setRubro(String rubro) {
		this.rubro = rubro;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	@Override
	public String toString() {
		return "Cliente [idCliente=" + idCliente + ", nombre=" + nombre + ", telefono=" + telefono + ", email=" + email
				+ ", rubro=" + rubro + ", direccion=" + direccion + "]";
	}

		
}
