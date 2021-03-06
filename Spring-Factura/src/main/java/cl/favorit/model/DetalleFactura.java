package cl.favorit.model;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "detalleFactura")
public class DetalleFactura {

	private int cantidad;
	
	@ManyToOne
	@JoinColumn(name = "factura_id")
	private Factura factura;

	@ManyToOne
	@JoinColumn(name = "producto_id")
	private Producto producto;


	public DetalleFactura() {
		super();
	}

	public DetalleFactura(int cantidad, Factura factura, Producto producto) {
		super();
		this.cantidad = cantidad;
		this.factura = factura;
		this.producto = producto;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public Factura getFactura() {
		return factura;
	}

	public void setFactura(Factura factura) {
		this.factura = factura;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}
		
	public Long getIds(Factura fac, Producto prod){
		Long result = fac.getIdFactura() + prod.getIdProducto();
		return result;
	}
}
