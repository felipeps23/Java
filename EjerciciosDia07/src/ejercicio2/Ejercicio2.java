package ejercicio2;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio2 {
	// Ejercicio 2 
	
	// Crear un programa que lea por teclado una tabla de 10 n�meros enteros y la desplace una 
	// posici�n hacia abajo (el �ltimo pasa a ser el primero).
	
	static void desplazar(int[] tabla){
        int ultimo;
        
        // Recogemos el ultimo elemento del array y lo guardamos
        ultimo=tabla[tabla.length - 1];
        
        // Desplazamos todos los elementos de derecha a izquierda
        // La primera posicion quedara vacia
        for(int i = tabla.length-1; i > 0; i--){
        	tabla[i] = tabla[i - 1];
        }
        // Guardamos en la primera posicon el ultimo elemento que hemos recogido anteriormente
        tabla[0] = ultimo;
    }
    
    public static void main(String[] args) {
    	Scanner teclado = new Scanner(System.in);
        int[] tabla=new int[10];
        int i;
        
        // Pedimos los valores para nuestra tabla
        for (i = 0; i < tabla.length; i++) {
        	System.out.println(i + ". Introduzca numero");
        	tabla[i] = teclado.nextInt();
        }
        System.out.println("Array inicial: "+Arrays.toString(tabla));
        // Ejecutamos el metodo para desplazar el elemento
        desplazar(tabla);
        // Mostramos por pantalla el array desplazado
        System.out.println("Array desplazado: "+Arrays.toString(tabla)); 
    }
	
}
