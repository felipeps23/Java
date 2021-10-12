package ejercicio1;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio1 {
	// Ejercicio 1
	
	// Dise�ar una aplicaci�n que declare una tabla de 10 elementos enteros. Leer mediante el teclado 
	// 6 n�meros. Despu�s se debe pedir un n�mero y una posici�n, insertarlo en la posici�n indicada, 
	// desplazando los que est�n detr�s.
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		// Creo un arraylist elementos
		ArrayList tabla = new ArrayList(10);
		
		int numero, posicion;
		
		// Leer 6 numeros
		for (int i = 0; i < 6; i ++) {
			System.out.println((i + 1) + ". Introduce un numero:");
			tabla.add(teclado.nextInt());
		}

		// Pedir un numero
		System.out.println("Introduce el numero que quiere a�adir:");
		numero = teclado.nextInt();
		
		// Elegir la posicion donde ese numero va a ir
		System.out.println("En que posicion quiere introducirlo?");
		posicion = teclado.nextInt();
		
		// Colocar el numero en la posicion indicada
		tabla.add(posicion, numero);
		
		for(int i = 0; i < tabla.size(); i++) {
            System.out.println(tabla.get(i));
        }
		
	}

}
