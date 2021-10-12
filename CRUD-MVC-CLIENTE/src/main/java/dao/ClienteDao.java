package dao;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import conexion.ConexionSingleton;
import idao.Icliente;
import modelo.Cliente;

public class ClienteDao implements Icliente {
//Aca Creamos el CRUD: CREATE-READ-UPDATE-DELETE
		
	
	@Override
	public boolean agregar(Cliente cliente) {
		
		boolean agregar = false;
		
		java.sql.Statement stm = null; // Ejecutar código sql
		Connection con = null; // Conexion a la BD
	
		String sql = "INSERT INTO Cliente (nombre,  telefono, email, rubro, direccion) VALUES (?,?,?,?,?)";
		
		try {
			con = ConexionSingleton.getConnection();
			stm = con.createStatement();
			stm.execute(sql);
			agregar = true;
			stm.close();
			
		} catch (SQLException e) {
			System.out.println("Error: Clase ClienteDao, método agregar");
			e.printStackTrace();
		}
				
		return agregar;
		
		
	}

	@Override
	public Cliente buscar(int clienteid) {
		// TODO Auto-generated method stub
		Connection con = null;
		Statement stm = null;
		ResultSet rs = null;
		
		String sql = "select * from Cliente WHERE idcliente = '"+ clienteid +"' ";
		
		Cliente cli = new Cliente();
		
		try {
			
			con = ConexionSingleton.getConnection();
			stm = con.createStatement();
			rs = stm.executeQuery(sql);
			
			while(rs.next()) {
				cli.setIdcliente(rs.getInt(1));
				cli.setNombre(rs.getString(2));
				cli.setTelefono(rs.getInt(3));
				cli.setEmail(rs.getString(4));
				cli.setRubro(rs.getString(5));
				cli.setDireccion(rs.getString(6));	
		    }
			stm.close();
			rs.close();
			
			
		} catch (SQLException e) {
			System.out.println("Error: clase ClienteDao, método buscar x id");
			e.printStackTrace();
		}
		
		return cli;
	}

	@Override
	public List<Cliente> listar() {
		
		Connection con = null;
		Statement stm = null;
		ResultSet rs = null;
		
		String sql = "select * from Cliente ORDER BY IDCLIENTE";
		
		List<Cliente> listaCliente = new ArrayList<Cliente>();
		
		try {
			
			con = ConexionSingleton.getConnection();
			stm = con.createStatement();
			rs = stm.executeQuery(sql);
			
			//Realizar con for-each para mejorar
			//mejorar con sql nuevo para sacar cada cliente
			while(rs.next()) {
				Cliente cli = new Cliente();
				cli.setIdcliente(rs.getInt(1));
				cli.setNombre(rs.getString(2));
				cli.setTelefono(rs.getInt(3));
				cli.setEmail(rs.getString(4));
				cli.setRubro(rs.getString(5));
				cli.setDireccion(rs.getString(6));	
				listaCliente.add(cli);
			}
			stm.close();
			rs.close();
			
			
		} catch (SQLException e) {
			System.out.println("Error: clase ClienteDao, método buscar x id");
			e.printStackTrace();
		}
		
		return listaCliente ;
		
	}

	@Override
	public boolean actualizar(Cliente cliente) {
		
		Connection con = null;
		Statement stm = null;
		boolean actualizar = false;
		
		
		String sql = "UPDATE Cliente SET  nombre = '"+ cliente.getNombre() +"', telefono = '"+ cliente.getTelefono() +
				"',email = '"+ cliente.getEmail() +"', rubro = '"+ cliente.getRubro() +"',direccion = '"+ cliente.getDireccion() +
			"', WHERE id = '"+ cliente.getIdcliente() +"' ";
		
		
		
		try {
			con = ConexionSingleton.getConnection();
			stm = con.createStatement();
			stm.execute(sql);
			actualizar = true;
			stm.close();
			
		} catch (SQLException e) {
			System.out.println("Error: Clase ClienteDao, método actualizar");
			e.printStackTrace();
		}
				
		
		return actualizar;
	}

	
	
	
	
	
	@Override
	public boolean eliminar(int id) {

		Connection con = null;
		Statement stm = null;
		boolean eliminar = false;
		
		String sql = "DELETE FROM Cliente WHERE id = "+ id;
		
		try {
			con = ConexionSingleton.getConnection();
			stm = con.createStatement();
			stm.execute(sql);
			eliminar = true;
			stm.close();
			
		} catch (SQLException e) {
			System.out.println("Error: Clase ClienteDao, método eliminar");
			e.printStackTrace();
		}
		
		
		return eliminar;
	}

	

}
