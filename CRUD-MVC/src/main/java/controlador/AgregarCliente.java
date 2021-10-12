package controlador;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.ClienteDao;
import modelo.Cliente;

/*
 * 
 * Servlet implementacion de clase ClienteController
 * 
 */

@WebServlet("/AgregarCliente")
public class AgregarCliente extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;	
	
	public AgregarCliente() {
		super();
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.getRequestDispatcher("AgregarCliente.jsp").forward(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String nombre = request.getParameter("nombre");
		int telefono = Integer.parseInt(request.getParameter("telefono"));
		String email = request.getParameter("email");
		String rubro = request.getParameter("rubro");
		String direccion = request.getParameter("direccion");
		
		Cliente cli = new Cliente(nombre, telefono, email, rubro, direccion);
		ClienteDao clientedao = new ClienteDao();
		
		boolean agregar = false;
		agregar = clientedao.agregar(cli);
		
		String mensaje = "";
		
		if (agregar) {
			mensaje = "El cliente se agrego correctamente";
		} else {
			mensaje = "Ocurrio un error al procesar la solicitud";
		}
		
		request.setAttribute("ccmensaje", mensaje);
		request.getRequestDispatcher("AgregarCliente.jsp").forward(request, response);
		
	}
	
}
