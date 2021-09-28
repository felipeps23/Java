package ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {
	// Ejercicio 2
	// Crea una función para verificar el NIF de españoles residentes mayores de 
	// edad, el algoritmo de cálculo del dígito de control es el siguiente:  
	 
	// http://www.interior.gob.es/web/servicios-al-ciudadano/dni/calculo-del-digito-
	// de-control-del-nif-nie 
	 
	// y mostrar la letra que le corresponde al usuario haciendo uso de la función 
	// anterior.
	
	
	static Scanner teclado = new Scanner(System.in);
	
	public static void main(String[] args) {
		dividirDNI();
	}
	
	public static void dividirDNI() {
		System.out.println("Introduzca su numero del DNI");
		int dni = teclado.nextInt();
		
		int digLetra = (dni % 23);
		
		// Asocio una letra a cada modulo de la division
		if(digLetra == 0) {
			System.out.println("Al DNI: " + dni + " le corresponde la letra T");
		} else if(digLetra == 1) {
			System.out.println("Al DNI: " + dni + " le corresponde la letra R");
		} else if(digLetra == 2) {
			System.out.println("Al DNI: " + dni + " le corresponde la letra W");
		} else if(digLetra == 3) {
			System.out.println("Al DNI: " + dni + " le corresponde la letra A");
		} else if(digLetra == 4) {
			System.out.println("Al DNI: " + dni + " le corresponde la letra G");
		} else if(digLetra == 5) {
			System.out.println("Al DNI: " + dni + " le corresponde la letra M");
		} else if(digLetra == 6) {
			System.out.println("Al DNI: " + dni + " le corresponde la letra Y");
		} else if(digLetra == 7) {
			System.out.println("Al DNI: " + dni + " le corresponde la letra F");
		} else if(digLetra == 8) {
			System.out.println("Al DNI: " + dni + " le corresponde la letra P");
		} else if(digLetra == 9) {
			System.out.println("Al DNI: " + dni + " le corresponde la letra D");
		} else if(digLetra == 10) {
			System.out.println("Al DNI: " + dni + " le corresponde la letra X");
		} else if(digLetra == 11) {
			System.out.println("Al DNI: " + dni + " le corresponde la letra B");
		} else if(digLetra == 12) {
			System.out.println("Al DNI: " + dni + " le corresponde la letra N");
		} else if(digLetra == 13) {
			System.out.println("Al DNI: " + dni + " le corresponde la letra J");
		} else if(digLetra == 14) {
			System.out.println("Al DNI: " + dni + " le corresponde la letra Z");
		} else if(digLetra == 15) {
			System.out.println("Al DNI: " + dni + " le corresponde la letra S");
		} else if(digLetra == 16) {
			System.out.println("Al DNI: " + dni + " le corresponde la letra Q");
		} else if(digLetra == 17) {
			System.out.println("Al DNI: " + dni + " le corresponde la letra V");
		} else if(digLetra == 18) {
			System.out.println("Al DNI: " + dni + " le corresponde la letra H");
		} else if(digLetra == 19) {
			System.out.println("Al DNI: " + dni + " le corresponde la letra L");
		} else if(digLetra == 20) {
			System.out.println("Al DNI: " + dni + " le corresponde la letra C");
		} else if(digLetra == 21) {
			System.out.println("Al DNI: " + dni + " le corresponde la letra K");
		} else {
			System.out.println("Al DNI: " + dni + " le corresponde la letra E");
		}
		
	}
	
}
