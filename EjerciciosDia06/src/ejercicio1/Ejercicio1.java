package ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {
	// Ejercicio 1
	// Crea una funci�n que reciba como par�metro una cadena de texto con una 
	// frase y dicha funci�n tendr� que devolver dicha cadena pero invirtiendo la 
	// primera y la �ltima palabra. 
	// Desde la funci�n principal tendr�s que pedir al usuario que introduzca una 
	// frase y le mostrar�s dicha frase con la primera y �ltima palabra 
	// intercambiada.
	
    public static void main(String[] args) {
    	Scanner teclado = new Scanner(System.in);
        String frase;
        
        System.out.println("Introduzca una frase (al menos de dos palabras)");
        frase = teclado.nextLine();
        System.out.println("Cadena invirtiendo primer y �ltima palabras: "+invierte(frase));
    }
    
    //Esta funci�n divide la frase en tres partes
    // y devuelve la frase poniendo las partes en el orden 3-2-1 
    public static String invierte(String cadena){
        String parte1, parte2, parte3;
        
        //Primero comprueba que haya al menos un espacio
        if (cadena.indexOf(" ") != - 1){
            parte1 = cadena.substring(0,cadena.indexOf(" "));
            parte2 = cadena.substring(cadena.indexOf(" "),cadena.lastIndexOf(" ")+1);
            parte3 = cadena.substring(cadena.lastIndexOf(" "),cadena.length());
            
            return parte3 + parte2 + parte1;
            
        } else {
            //Si no hay ning�n espacio quiere decir que se trataba de una sola palabra
            //as� que la devuelvo tal cual
        	System.out.println("Tu frase solo tiene una palabra");
            return cadena;
        }
        
        
    }
    
}
