package cl.favorit.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table( name = "factura")
public class Factura {

	@Id 
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idFactura;
	private String cliente;
	private String fecha;
	
	
	public Factura() {
		super();
	}

	public Factura(String cliente, String fecha) {
		super();
		this.cliente = cliente;
		this.fecha = fecha;
	}


	public Long getIdFactura() {
		return idFactura;
	}

	public void setIdFactura(Long idFactura) {
		this.idFactura = idFactura;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}	
}
