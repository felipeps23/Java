package ejercicio2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente
		Scanner teclado = new Scanner(System.in);
		Login login = new Login();
		
		System.out.println("Introduzca su usuario: ");
		String usuario = teclado.nextLine();
		System.out.println("Introduzca su clave: ");
		String clave = teclado.nextLine();
		
		login.loguearse(usuario, clave);
	}

}
