package modelo;

import java.util.List;

import idao.Icliente;

public class Cliente {

 private int idcliente;
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
 * @param idcliente
 * @param nombre
 * @param telefono
 * @param email
 * @param rubro
 * @param direccion
 */
public Cliente(int idcliente, String nombre, int telefono, String email, String rubro, String direccion) {
	super();
	this.idcliente = idcliente;
	this.nombre = nombre;
	this.telefono = telefono;
	this.email = email;
	this.rubro = rubro;
	this.direccion = direccion;
}

public int getIdcliente() {
	return idcliente;
}

public void setIdcliente(int idcliente) {
	this.idcliente = idcliente;
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
 
	
	
	
}
