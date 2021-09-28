package Ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// Crear un programa que lea por teclado una tabla de 10 números enteros 
		// y la desplace una posición hacia 
		// abajo: el primero pasa a ser el segundo, el segundo pasa a ser el tercero 
		// y así sucesivamente. El último pasa a ser el primero
		Scanner teclado = new Scanner(System.in);
		
		int[] valores = new int [10];
		
		// Recogemos los 10 valores por consola
		for(int i = 0; i < 10; i++) {
			System.out.println("Ingrese un numero: ");
			valores[i] = teclado.nextInt();						
		}
		
		// Pedimos el numero de desplazamientos
		System.out.println("Numero de desplazamientos: ");
		int n = teclado.nextInt();			
		int[] copia = valores.clone();
				
		for(int i = 0; i < 10; i++){
			valores[i] = copia[(i + n) % 10];
		}
				
		for(int i = 0; i < 10; i++) {
			System.out.println("Valores [" + i + "] = " + valores[i]);		
		}
	}

}
