package ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// Leer 7 n?meros y mostrarlos en orden inverso al introducido.
		Scanner teclado = new Scanner(System.in);
		
		int numeros[] = new int[7];
		
		// Recogemos los 7 numeros por consola
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Introduce un n?mero: ");
            numeros[i] = teclado.nextInt();            
        }
        // Imprimir en orden inverso
        for (int i = numeros.length - 1; i >= 0 ; i--) {
            System.out.println(numeros[i]);
        }
	}

}
