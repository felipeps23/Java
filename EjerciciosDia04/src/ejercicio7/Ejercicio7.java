package ejercicio7;

import java.util.HashMap;
import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		// Ejercicio 7
		// Utilizando HashMap para ingresar al menos 5 pa�ses con sus respectivas capitales luego 
		// mostrar por pantalla. Y me de la opci�n se buscar valor seg�n Clave desplegada por 
		// pantalla 
		Scanner teclado = new Scanner(System.in);
		HashMap<String, String> paisCapital = new HashMap<String, String>();
		
		// Agregar Clave y Valor
		int cont = 0;
		do {
			
			String pais, capital;
			System.out.println("Ingrese un pais");
			pais = teclado.nextLine();
			System.out.println("Ingrese su capital");
			capital = teclado.nextLine();
			System.out.println("===========================");
			paisCapital.put(pais, capital);
			cont ++;
		} while(cont < 5);
		
		String deseo;
		System.out.println("La capital de qu� pais desea ver?");
		deseo = teclado.nextLine();
		System.out.println(paisCapital.get(deseo));
				
	}

}
