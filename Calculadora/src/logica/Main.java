package logica;

import java.util.Scanner;

public class Main {

	static Scanner teclado = new Scanner(System.in);
	static int opcion;
	static float resultFinal, numeroOpFloat;
	static Operaciones oper = new Operaciones();
	
	public static void main(String[] args) {
		pintarMenu();
	}
	
	public static void pintarMenu() {
		do {
			System.out.println("***********CALCULADORA*************");
			System.out.println("---QUE-OPERACION-DESEA-REALIZAR?---");
			System.out.println("1. Suma");
			System.out.println("2. Resta");
			System.out.println("3. Multiplicacion");
			System.out.println("4. Division");
			System.out.println("5. Finalizar calculadora");
			System.out.println("===================================");
			
			opcion = Integer.parseInt(teclado.nextLine());
			opcionMenu(opcion);
			
		} while (opcion != 5 | opcion > 0 || opcion > 5);
	}
	
	public static void opcionMenu(int opcion) {
		switch(opcion) {
		case 1:
			sumar();
			preguntarNuevaOperacion();
			break;
		case 2:
			restar();
			preguntarNuevaOperacion();
			break;
		case 3:
			multiplicar();
			preguntarNuevaOperacion();
			break;
		case 4:
			dividir();
			preguntarNuevaOperacion();
			break;
		}
	}
		
	public static void preguntarNuevaOperacion() {
		System.out.println("¿Desea hacer otra operación?(s/n):");
		String opcion = teclado.nextLine();
		if(opcion.equals("s")) {
			pintarMenu();
		}else {
			pintarResultado();
			System.exit(0);
		}
	}
	
	public static void pintarResultado() {
		System.out.println("*************************************");
		System.out.println("El resultado final es " + resultFinal);
		System.out.println("*************************************");
	}
	
	public static void sumar() {
		System.out.println("Escribe un numero para sumar:");
		try {
			numeroOpFloat = Float.parseFloat(teclado.nextLine());
		} catch (Exception e) {
			System.out.println("Error:" + e + "No es un numero");
		}
		resultFinal = oper.sumar(resultFinal, numeroOpFloat);
	}
	
	public static void restar() {
		System.out.println("Escribe un número para restar:");
		
		try {
			numeroOpFloat = Float.parseFloat(teclado.nextLine());
		} catch (Exception e) {
			System.out.println("Error:" + e + "No es un numero");
		}		
		resultFinal = oper.restar(resultFinal, numeroOpFloat);
	}
	
	public static void multiplicar() {
		System.out.println("Escribe un número para multiplicar:");

		try {
			numeroOpFloat = Float.parseFloat(teclado.nextLine());
		} catch (Exception e) {
			System.out.println("Error:" + e + "No es un numero");
		}
		resultFinal = oper.multiplicar(resultFinal, numeroOpFloat);
	}
	
	public static void dividir() {
		System.out.println("Escribe un número para dividir:");
		
		try {
			numeroOpFloat = Float.parseFloat(teclado.nextLine());
		} catch (Exception e) {
			System.out.println("Error:" + e + "No es un numero");
		}
		resultFinal = oper.dividir(resultFinal, numeroOpFloat);
	}
}
