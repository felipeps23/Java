package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.rmi.ServerException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/RecuperaUser")
public class RecuperaUser extends HttpServlet {

	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	public RecuperaUser() {
		super();
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServerException, IOException{
		
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServerException, IOException{
		
		PrintWriter out = response.getWriter();
		out.println("<hmtl>");
		out.println("<head></head>");
		out.println("<body>");
		
		String usu = request.getParameter("usuario");
		String pass = request.getParameter("clave");
		
		out.println("Bienvenido");
		out.println(usu + " tu clave es: " + pass);
		out.println("</body>");
		out.println("</hmtl>");
	}
	
}
