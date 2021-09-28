package tipoDatos;

import java.util.*;

public class Valores {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente
		Scanner teclado = new Scanner(System.in);

		int entero = 5;
		String cadena = "Hola";
		double real = 2.4;
		float flotante = 3.45f;
		long largo = 999999999;
		char caracter = 'A';
		byte bits8 = -128;
		boolean boleano =  true;
		
		
		// Condicional if-else
		if (boleano==true) {
			System.out.println("Es un número verdadero");
		}else {
			System.out.println("No es un número verdadero");
		}
		
		// Condicional if anidado
		if (largo >= bits8 ) {
			largo = 45;
			System.out.println(largo);
		
			if (flotante > real || boleano != true) {
				System.out.println("Es verdad que 34 es mayor que 2.4");
			}
			
		}
		
		// Sintaxis Switch
		
		int dia;
		System.out.println("Ingrese dia de la semana 1-7");
		dia = teclado.nextInt();
		switch (dia) {
		
		case 1: System.out.println("Lunes");
			break;
		
		case 2: System.out.println("Martes");
			break;
		
		case 3: System.out.println("Miercoles");
			break;
		
		case 4: System.out.println("Jueves");
			break;
		
		case 5: System.out.println("Viernes");
			break;
		
		case 6: System.out.println("Sabado");
			break;
		
		case 7: System.out.println("Domingo");
			break;
		
		default: System.out.println("No es una opcion valida");
			
		}
		
		//Sintaxis for
		for (int i = 10 ; i >= 0; i--) {
			System.out.println(i);
		}
		
		for (int i = 0 ; i <= 10; i++) {
			System.out.println(i);
		}
		
		//Sintaxis While
		boolean condicion = true;
		
		while (condicion) {
			System.out.println("Esto lo veras solo ahora");
			condicion = false;
		}
		
		// Do-while
		int numero = 12345;
		int contador = 0;
		
		do {
			numero /= 10; // numero / 10 = numero;
			contador++;
		} 
		while (numero > 0);
		System.out.println(contador);
	}

}
