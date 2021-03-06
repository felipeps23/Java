package conexion;

import java.sql.*;

public class ConexionSingleton {

	private static Connection conn = null;
	private String driver;
	private String url;
	private String username;
	private String password;
	
	private ConexionSingleton() {
		
		// url = "jdbc:mysql://";
		url = "jdbc:oracle:thin:@locahost:1521:xe";
		driver = "oracle.jdbc.driver.OracleDriver";
		username = "user";
		password = "1234";
		
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, username, password);
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static Connection getConnection() {
		if (conn == null) {
			new ConexionSingleton();
		}
		
		return conn;
	}
}
