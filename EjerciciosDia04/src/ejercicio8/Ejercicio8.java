package ejercicio8;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		// Ejercicio 8 
		// Pedir 2 fechas por teclado y decir cuál es mayor 
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("PRIMERA FECHA");
		System.out.println("Ingrese día:");
		int dia = teclado.nextInt();
		System.out.println("Ingrese mes:");
		int mes = teclado.nextInt();
		System.out.println("Ingrese año:");
		int anio = teclado.nextInt();
		
		System.out.println("SEGUNDA FECHA");
		System.out.println("Ingrese día:");
		int dia2 = teclado.nextInt();
		System.out.println("Ingrese mes:");
		int mes2 = teclado.nextInt();
		System.out.println("Ingrese año:");
		int anio2 = teclado.nextInt();
		
		
		System.out.println("Primera fecha introducida: " + dia + "/" + mes + "/" + anio);
		System.out.println("Segunda fecha introducida: " + dia2 + "/" + mes2 + "/" + anio2);
		
		if (numeroDias(dia, mes, anio) > numeroDias(dia2, mes2, anio2)) {
			System.out.println("La primera fecha es anterior a la segunda");
		} else if(numeroDias(dia, mes, anio) < numeroDias(dia2, mes2, anio2)) {
			System.out.println("La segunda fecha es anterior a la primera");
		} else {
			System.out.println("Las fechas son iguales");
		}
		
	}
	
	public static int numeroDias(int dia, int mes, int anio) {
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
		return cont;
	}

}

