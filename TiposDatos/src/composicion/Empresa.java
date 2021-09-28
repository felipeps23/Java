package composicion;

public class Empresa {

	private String codigo;
	private Direccion direccion;
	/**
	 * @param codigo
	 * @param direccion
	 */
	public Empresa(String codigo, Direccion direccion) {
		super();
		this.codigo = codigo;
		this.direccion = direccion;
	}
	
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public Direccion getDireccion() {
		return direccion;
	}
	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}

}
