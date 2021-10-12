package ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
        int[][] num = new int[4][4];
        boolean simetrico;
        
        System.out.println("Ingrese los números.");
        for (int i = 0; i < num.length; i++) {//Dimensión Uno.
            for (int j = 0; j < num.length; j++) {//Dimensión Dos.
                  System.out.print("["+i+"]"+"["+j+"]"+"=");
                  num[i][j]=teclado.nextInt();              
            }            
        }
        System.out.println("Imprimiendo Tabla.");
        for (int i = 0; i < num.length; i++) {
            System.out.println();
            for (int j = 0; j < num.length; j++) {
                  System.out.print(num[i][j] + " ");              
            }            
        }
        System.out.println("\nComprobando Simetria.");
        simetrico = true;
        int control = num.length -1;
        int i=0;
        while (i < control && simetrico == true) {            
            int j=0;
            while (j < control && simetrico == true) {                
                if(num[i][j] != num[j][i]){
                    simetrico = false;
                }
                j++;
            }
          i++;
        }
        if(simetrico){
            System.out.println("La tabla resulta Simétrica.");
        }
        else{
            System.out.println("La tabla no es Simétrica.");
        }
    }
	
}
