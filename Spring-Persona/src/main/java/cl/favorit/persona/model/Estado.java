package cl.favorit.persona.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "estado")
public class Estado {

	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	private Long id;
	private String nombre;
	
	/**
	 * 
	 */
	public Estado() {
		super();
	}

	/**
	 * @param nombre
	 */
	public Estado(String nombre) {
		super();
		this.nombre = nombre;
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
	
}