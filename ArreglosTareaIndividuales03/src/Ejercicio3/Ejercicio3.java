package Ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// Leer 10 n�meros enteros. Debemos mostrarlos en el siguiente orden: el 
		// primero, el �ltimo, el segundo, el pen�ltimo, el tercero, etc.
		Scanner teclado = new Scanner(System.in);
		
		int numeros[] = new int[10];;
		
		// Recogemos los 10 numeros por consola
		for (int i = 0; i < 10; i++) {
			System.out.print("Introduzca numero: ");
			numeros[i] = teclado.nextInt();
		}
		System.out.println("El resultado es:");
		
		for (int i = 0; i <= 4; i++) {
			System.out.println (numeros[i]); // mostramos el i-�simo n�mero por el principio
			System.out.println(numeros[9 - i]); // y el i-�simo por el final
		}
	}

}
