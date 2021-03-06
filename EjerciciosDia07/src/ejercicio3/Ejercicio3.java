package ejercicio3;

public class Ejercicio3 {
	// Ejercicio 3
	// Crear una tabla bidimensional de tama?o 3x3 y rellenarla de la siguiente forma: la posici?n        
	// T[n,m] debe contener n+m. Despu?s se debe mostrar su contenido.
	
	public static void main(String[] args) {
		// Declaramos la tabla bidimensional
        int[][] tabla = new int[3][3];
        
        // Asignamos los valores para la tabla
        for (int i = 0; i < tabla.length; i++) {//Dimensi?n Uno.
            for (int j = 0; j < tabla.length; j++) {//Dimensi?n Dos.
            	tabla[i][j] = i + j;              
            }            
        }
        
        System.out.println("Tabla bidimensional.");
        
        // Imprimimos por pantalla la tabla bidimensional
        for (int i = 0; i < tabla.length; i++) {
            System.out.println();
            for (int j = 0; j < tabla.length; j++) {
                  System.out.print(tabla[i][j] + " ");              
            }            
        }
    }
	
}
