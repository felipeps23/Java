package ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// Ejercicio1
		// Utilice la recursividad para sumar todos los números entre 7 y 15
		int result = suma(15);
		System.out.println(result);
		
    }
	
	public static int suma(int x) {
		if (x >= 7) {
			return x + suma(x - 1);
		} else {
			return 0;
		}
	}

}
