package ejercicio3;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// Ejercicio 3
		// Ingresar tu fecha de nacimiento y mostrar como resultado cuantos d?as has vivido
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Ingrese su d?a de nacimiento:");
		int dia = teclado.nextInt();
		System.out.println("Ingrese su mes de nacimiento:");
		int mes = teclado.nextInt();
		System.out.println("Ingrese su a?o de nacimiento:");
		int anio = teclado.nextInt();
		
		numeroDias(dia, mes, anio);
		
	}
	
	public static void numeroDias(int dia, int mes, int anio) {
		GregorianCalendar fecha = new GregorianCalendar(anio, mes - 1, dia);
		int cont = 0;
		GregorianCalendar fechaActual = new GregorianCalendar();
		while (true) {
			if ((fecha.get(Calendar.DAY_OF_MONTH) == fechaActual
					.get(Calendar.DAY_OF_MONTH))
					&& (fecha.get(Calendar.MONTH) == fechaActual
							.get(Calendar.MONTH))
					&& (fecha.get(Calendar.YEAR) == fechaActual
							.get(Calendar.YEAR))) {
				break;
			}
			fecha.add(Calendar.DAY_OF_MONTH, 1);
			cont++;
		}
		System.out.println("Usted lleva un total de " + cont + " d?as vividos!");
	}

}
