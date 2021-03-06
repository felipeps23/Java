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

public class ClienteDao implements Icliente{
	// Aqui creamos el CRUD: Create, Read, Update, Delete
		
	
	@Override
	public boolean agregar(Cliente cliente) {
		
		boolean agregar = false;
		
		Statement stm = null; // Ejecutar codigo sql
		Connection con = null; // Conexion a la BD
		
		String sql = "INSERT INTO Cliente (nombre, telefono, email, rubro, direccion) VALUES (?, ?, ?, ?, ?)";
		
		try {
			con = ConexionSingleton.getConnection();
			stm = con.createStatement();
			stm.execute(sql);
			agregar = true;
			stm.close();
			
		} catch (SQLException e) {
			System.out.println("Error: Clase ClienteDao, metodo agregar");
			e.printStackTrace();
		}
		
		return agregar;
	}

	@Override
	public Cliente buscar(int clienteid) {

		Connection con = null;
		Statement stm = null;
		ResultSet rs = null;
		
		String sql = "SELECT * FROM Cliente WHERE id = '" + clienteid + "' ";
		
		Cliente cli = new Cliente();
		
		try {
			con = ConexionSingleton.getConnection();
			stm = con.createStatement();
			rs = stm.executeQuery(sql);
			
			while(rs.next()) {
				cli.setIdCliente(rs.getInt(1));
				cli.setNombre(rs.getString(2));
				cli.setTelefono(rs.getInt(3));
				cli.setEmail(rs.getString(4));
				cli.setRubro(rs.getString(5));
				cli.setDireccion(rs.getString(6));
			}
			
			stm.close();
			rs.close();
			
		} catch (SQLException e) {
			System.out.println("Error: Clase ClienteDao, metodo buscar");
			e.printStackTrace();
		}
		
		
		return cli;
	}

	@Override
	public List<Cliente> listar() {
		
		Connection con = null;
		Statement stm = null;
		ResultSet rs = null;
		
		String sql = "SELECT * FROM Cliente ORDER BY idCliente";
		
		List<Cliente> listCli = new ArrayList<Cliente>();
		
		try {
			con = ConexionSingleton.getConnection();
			stm = con.createStatement();
			rs = stm.executeQuery(sql);
			
			// Realizar con for-each para mejorar
			// Mejorar con sql nuevo para sacar cada cliente
			while(rs.next()) {
				Cliente cli = new Cliente();
				cli.setIdCliente(rs.getInt(1));
				cli.setNombre(rs.getString(2));
				cli.setTelefono(rs.getInt(3));
				cli.setEmail(rs.getString(4));
				cli.setRubro(rs.getString(5));
				cli.setDireccion(rs.getString(6));
				listCli.add(cli);
			}
			
			stm.close();
			rs.close();
			
		} catch (SQLException e) {
			System.out.println("Error: Clase ClienteDao, metodo buscar");
			e.printStackTrace();
		}
		
		
		return listCli;
	}

	@Override
	public boolean actualizar(Cliente cliente) {
		
		boolean actualizar = false;
		Statement stm = null;
		Connection con = null;
		
		String sql = "UPDATE Cliente SET nombre = '" + cliente.getNombre() + "', telefono = '" + cliente.getTelefono() + "', "
				+ "email = '" + cliente.getEmail() + "', rubro = '" + cliente.getRubro() + "', direccion = '" + cliente.getDireccion() + "', WHERE id = '" + cliente.getIdCliente() + "' ";
		
		try {
			con = ConexionSingleton.getConnection();
			stm = con.createStatement();
			stm.execute(sql);
			stm.close();
			
		} catch (SQLException e) {
			System.out.println("Error: Clase ClienteDao, metodo actualizar");
			e.printStackTrace();
		}
		
		return actualizar;
	}

	@Override
	public boolean eliminar(int idCliente) {
		
		boolean eliminar = false;
		Statement stm = null;
		Connection con = null;
		
		String sql = "DELETE FROM Cliente WHERE id = " + idCliente;
		
		try {
			con = ConexionSingleton.getConnection();
			stm = con.createStatement();
			stm.execute(sql);
			eliminar = true;
			stm.close();
			
		} catch (SQLException e) {
			System.out.println("Error: Clase ClienteDao, metodo eliminar");
			e.printStackTrace();
		}
		
		return eliminar;
	}

	
	
}
