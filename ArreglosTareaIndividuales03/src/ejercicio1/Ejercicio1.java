package ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// Leer 7 n�meros y mostrarlos en el mismo orden introducido.
		Scanner teclado = new Scanner(System.in);
		
		int numeros[] = new int[7];
		
		// Recogemos los 7 numeros por consola
		for (int i = 0; i < 7; i++) {
			System.out.print("Introduzca un n�mero: ");
			numeros[i] = teclado.nextInt();
		}
		System.out.println("Los n�meros son:");
		for (int i = 0; i < 7; i++) {
			System.out.println(numeros[i]);			
		}
		
	}

}
