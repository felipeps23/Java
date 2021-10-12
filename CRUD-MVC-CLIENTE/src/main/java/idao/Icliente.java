package idao;

import java.util.List;

import modelo.Cliente;

public interface Icliente {

	public boolean agregar(Cliente cliente);
	public Cliente buscar(int id);
	public List<Cliente> listar();
	public boolean actualizar(Cliente cliente);
	public boolean eliminar (int id);
	
	
	
	
	
	
}
