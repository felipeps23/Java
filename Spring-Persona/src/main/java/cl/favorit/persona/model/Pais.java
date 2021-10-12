package cl.favorit.persona.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table (name = "pais")
public class Pais {

	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	private Long id;
	private String nombre;
	
	@ManyToOne
	@JoinColumn (name = "idEstado")
	private Estado estado;

	/**
	 * 
	 */
	public Pais() {
		super();
	}

	/**
	 * @param nombre
	 * @param estado
	 */
	public Pais(String nombre, Estado estado) {
		super();
		this.nombre = nombre;
		this.estado = estado;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}
	
}
