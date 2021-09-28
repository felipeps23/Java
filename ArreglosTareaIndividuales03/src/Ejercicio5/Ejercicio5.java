package Ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// Queremos desarrollar una aplicación que nos ayude a gestionar las notas 
		// de un centro educativo. Cada grupo 
		// (o clase) está compuesto por 5 alumnos. Se pide leer las notas del primer, 
		// segundo y tercer trimestre de un 
		// grupo. Debemos mostrar al final: la nota media del grupo en cada 
		// trimestre, y la media del alumno que se encuentra en la posición N (N 
		// se lee por teclado).
		Scanner teclado = new Scanner(System.in);
		
		int primer[] = new int [5];
		int segundo[] = new int [5]; 
		int tercer[] = new int [5]; // notas del primer, segundo y tercer trimestre
		int num,i;
		int suma_primer, suma_segundo, suma_tercer;
		double media_alumno;
		
		// leemos las notas del primer trimestre
		System.out.println("Notas de primer trimestre");
		System.out.println("=======================================");
		
		for (i = 0; i < 5; i++) {
			System.out.print("Alumnos "+i+": ");
			primer[i]=teclado.nextInt();
		}
		// leemos las notas del segundo trimestre
		System.out.println("Notas del segundo trimestre:");
		System.out.println("=======================================");
		
		for (i = 0; i < 5; i++) {
			System.out.print("Alumno "+i+": ");
			segundo[i]=teclado.nextInt();
		}
		// leemos las notas del tercer trimestre
		System.out.println("Notas del tercer trimestre:");
		System.out.println("=======================================");
		
		for (i = 0; i < 5; i++){
			System.out.print("Alumnos "+i+": ");
			tercer[i]=teclado.nextInt();
		}
		// calculamos las medias
		suma_primer = 0;
		suma_segundo = 0;
		suma_tercer = 0;
		
		for (i =0; i < 5; i++)
		{
		suma_primer += primer[i];
		suma_segundo += segundo[i];
		suma_tercer += tercer[i];
		}
		
		// mostramos datos
		System.out.println("Media primer trimestre: "+ suma_primer/5);
		System.out.println("Media segundo trimestre: "+ suma_segundo/5);
		System.out.println("Media tercer trimestre: "+ suma_tercer/5);
		System.out.println();
		
		// leemos la posición del alumnos que nos interesa
		System.out.print ("Introduzca posición del alumno (de 0 a 4): ");
		num=teclado.nextInt();
		
		// la media del alumno es la suma de sus notas entre 3
		media_alumno = (double) (primer[num]+segundo[num]+tercer[num])/3;
		
		System.out.println("La media del alumno es: " + media_alumno);
	}
	
}
