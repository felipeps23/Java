package logica;

import java.util.Scanner;

public class EjerciciosIndividuales {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente
		Scanner teclado = new Scanner(System.in);
		
		//ejercicio1();
		//ejercicio2();
		//ejercicio3();
		//ejercicio4();
		//ejercicio5();
		//ejercicio6();
		//ejercicio7();
		//ejercicio8();
		//ejercicio9();
		//ejercicio10();
		ejercicio11();
		
	}
	
	public static void ejercicio1() {
		// Ejercicio 1
		// Pedir dos números y decir si son iguales o no
		Scanner teclado = new Scanner(System.in);
		
		int n1, n2;
		System.out.println("Ingrese el primer numero");
		n1 = teclado.nextInt();
		System.out.println("Ingrese el segundo numero");
		n2 = teclado.nextInt();
		System.out.println("=========================");
		teclado.close();
		
		if (n1 == n2) {
			System.out.println("Los numeros ingresados son iguales");
		} else {
			System.out.println("Los numeros ingresados no son iguales");
		}
	}
	
	public static void ejercicio2() {
		// Ejercicio 2
		// Pedir dos números y decir cuál es el mayor o si son iguales
		Scanner teclado = new Scanner(System.in);
		
		int n3, n4;
		System.out.println("Ingrese el primer numero");
		n3 = teclado.nextInt();
		System.out.println("Ingrese el segundo numero");
		n4 = teclado.nextInt();
		System.out.println("=========================");
		teclado.close();
		
		if (n3 > n4) {
			System.out.println("El primer numero: " + n3 + " es mayor que el segundo: " + n4);
		} else if(n3 < n4){
			System.out.println("El primer numero: " + n3 + " es menor que el segundo: " + n4);
		} else {
			System.out.println("Los dos numeros ingresados son iguales");
		}
		
	}
	
	public static void ejercicio3() {
		// Ejercicio 3
		// Pedir tres números y mostrarlos ordenados de mayor a menor
		Scanner teclado = new Scanner(System.in);
		
		int n5, n6, n7;
		System.out.println("Ingrese el primer numero");
		n5 = teclado.nextInt();
		System.out.println("Ingrese el segundo numero");
		n6 = teclado.nextInt();
		System.out.println("Ingrese el tercer numero");
		n7 = teclado.nextInt();
		System.out.println("=========================");
		teclado.close();
		
		if (n5 > n6 && n5 > n7 && n6 > n7) {
			System.out.println("El orden es, de mayor a menor: " + n5 + ", " + n6 + ", " + n7); 
		} else if (n5 > n6 && n5 > n7 && n7 > n6) {
			System.out.println("El orden es, de mayor a menor: " + n5 + ", " + n7 + ", " + n6);
		} else if (n6 > n5 && n6 > n7 && n5 > n7) {
			System.out.println("El orden es, de mayor a menor: " + n6 + ", " + n5 + ", " + n7 );
		} else if (n6 > n5 && n6 > n7 && n7 > n5) {
			System.out.println("El orden es, de mayor a menor: " + n6 + ", " + n7 + ", " + n5);
		} else if (n7 > n6 && n7 > n5 && n5 > n6) {
			System.out.println("El orden es, de mayor a menor: " + n7 + ", " + n5 + ", " + n6);
		} else {
			System.out.println("El orden es, de mayor a menor: " + n7 + ", " + n6 + ", " + n5);
		}
	}
	
	public static void ejercicio4() {
		// Ejercicio 4
		// Pedir una nota de 1 a 7 y mostrarla de la forma:
		// Insuficiente(<=3.9), Suficiente(>4y<5.9), Bien(>6)
		Scanner teclado = new Scanner(System.in);
		
		double n8;
		System.out.println("Ingrese la nota");
		n8 = teclado.nextDouble();
		System.out.println("=========================");
		teclado.close();
		
		if (n8 <= 3.9 && n8 < 0) {
			System.out.println("Insuficiente");
		} else if (n8 >= 4 && n8 < 5.9) {
			System.out.println("Suficiente");
		} else {
			System.out.println("Bien");
		}
	}
	
	public static void ejercicio5() {
		// Ejercicio 5
		// Pedir dos fechas y mostrar el número de días que hay de
		// diferencia. Suponiendo todos los meses de 30 días
		Scanner teclado = new Scanner(System.in);
		
		int dia1, mes1, año1;
		int dia2, mes2, año2;
		int totalDias;
		
		System.out.println ("Fecha numero 1:");
		System.out.println("=========================");
		
		System.out.print("Introduzca día: ");
		dia1 = teclado.nextInt();
		System.out.print("Introduzca mes: ");
		mes1 = teclado.nextInt();
		System.out.print("Introduzca año: ");
		año1 = teclado.nextInt();
		
		System.out.println ("Fecha numero 2:");
		System.out.println("=========================");
		
		System.out.print("Introduzca día: ");
		dia2 = teclado.nextInt();
		System.out.print("Introduzca mes: ");
		mes2 = teclado.nextInt();
		System.out.print("Introduzca año: ");
		año2 = teclado.nextInt();
		teclado.close();

		totalDias = dia2 - dia1 + 30 * (mes2 - mes1) + 365 * (año2 - año1);
		System.out.println ("Días de diferencia: " + totalDias);
	}
	
	public static void ejercicio6() {
		// Ejercicio 6
		// Leer un número y mostrar su cuadrado, repetir el proceso
		// hasta que se introduzca un número negativo
		Scanner teclado = new Scanner(System.in);
		
		int n9;
		int cuadrado;
		System.out.println("Introduce un numero: ");
		n9 = teclado.nextInt();
		
		while (n9 >= 0) {
			cuadrado = n9 * n9;
			System.out.println("El cuadrado de " + n9 + " es " + cuadrado);
			System.out.println("Introduce un numero: ");
			n9 = teclado.nextInt();
		}
		
	}
	
	public static void ejercicio7() {
		// Ejercicio 7
		// Pedir 5 sueldos. Mostrar su suma y cuantos hay mayores de
		// 2000€.
		Scanner teclado = new Scanner(System.in);
		
		int sueldos;
        int contSueldos=0;
        int sumaSueldos=0;
       
        for(int i=1; i<=5; i++)
        {
            System.out.println("Introduzca el sueldo numero: " + i);
            sueldos=teclado.nextInt();
            teclado.close();
            
            sumaSueldos=sumaSueldos+sueldos;
           
            if(sueldos>2000)
            {
            	contSueldos++;
            }
        }
       
        System.out.println("Suma de los sueldos: " + sumaSueldos);
        System.out.println("Mayores de 2000: " + contSueldos);
    }
	
	public static void ejercicio8() {
		// Ejercicio 8
		// Pide un número (que debe estar entre 0 y 10) y mostrar la
		// tabla de multiplicar de dicho número.
		Scanner teclado = new Scanner(System.in);
		
		int n10;
        do {            
            System.out.print("Ingresa un número (del 0  al 10): ");
            n10 = teclado.nextInt();
            teclado.close();
        } while ( 0 <= n10 && n10 >= 11);
        
        for (int i = 1; i <= 10; i++) {
            System.out.println(n10 + " X " + i + " = " + n10*i);
        }
	}
	
	public static void ejercicio9() {
		// Ejercicio 9
		/*
		 * Realiza detenidamente una traza al siguiente programa y muestra
		 * cual sería la salida por pantalla: 
		 *  VARIABLES
			suma, i, j: ENTERO
			COMIENZO
			PARA i <- 1 HASTA 4
			PARA j <- 3 HASTA 0 INC -1
			suma <- i*10+j
			escribir (suma)
			FIN PARA
			FIN PARA
			FIN
		*/

		int traza;
		for (int i = 1; i <= 4; i++){
			for (int j = 3; j >= 0; j--) {
				traza = i * 10 + j;
				System.out.println(traza);
			}
		}
	}
	
	public static void ejercicio10() {
		// Ejercicio 10
		// Pedir Usuario y Clave por teclado, comparar clave
		// guardada con anterioridad. Si la clave y el usuario son
		// correctas ingresar el menú que tenga la posibilidad de
		// modificar la clave mostrando un mensaje “Clave cambiada con
		// éxito”
		Scanner teclado = new Scanner(System.in);

		String user = "admin";
		String pass = "1234";
		
		System.out.println("Escribe el nombre de usuario: ");
		String usuario = teclado.nextLine();
		System.out.println("Escribe la contraseña");
		String clave = teclado.nextLine();
		
		if((usuario.equals(user)) && (clave.equals(pass))) {
			System.out.println("Bienvenido, quiere cambiar la clave? (s/n)");
			String cambio = teclado.nextLine();
			if (cambio.toLowerCase().equals('s')) {
				System.out.println("Escribe la clave nueva: ");
				pass = teclado.nextLine();
				System.out.println("Nueva clave guardada.");
			}else if (cambio.toLowerCase().equals("n")) {
				System.out.println("The End");
			}
		}
	}
	
	public static void ejercicio11() {
		// Ejercicio 11
		// ¿Cuántas veces se imprimirá el siguiente código “Hola Mundo”?
		for (int i = 0; i < 10; i++) {
			i = i++;
			System.out.println("Hola mundo!");
		}
		// Se imprimira 10 veces.
	}
}
