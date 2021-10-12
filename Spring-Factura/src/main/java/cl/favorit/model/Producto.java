package cl.favorit.model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "producto")
public class Producto {

	@Id 
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idProducto;
	private String nombre;
	private int valor;
	
	@ManyToOne
	@JoinColumn(name = "categoria_id")
	private Categoria categoria;

	@ManyToMany(mappedBy = "Productos", fetch = FetchType.EAGER)
	private Set<Factura> facturas;
	
	
	public Producto() {
		super();
	}

	public Producto(String nombre, int valor, Categoria categoria, Set<Factura> facturas) {
		super();
		this.nombre = nombre;
		this.valor = valor;
		this.categoria = categoria;
		this.facturas = facturas;
	}

	public Long getIdProducto() {
		return idProducto;
	}

	public void setIdProducto(Long idProducto) {
		this.idProducto = idProducto;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public Set<Factura> getFacturas() {
		return facturas;
	}
	
	public void setFacturas(Set<Factura> facturas) {
		this.facturas = facturas;
	}
}
