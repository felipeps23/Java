package ejercicio4;

public class Main {
	// Ejercicio 4
	/*
		Escribe un programa para una biblioteca que contenga libros y revistas. 
		
		�  Las caracter�sticas comunes que se almacenan tanto para las revistas como 
		para  los  libros  son  el c�digo,  el  t�tulo,  y  el  a�o  de publicaci�n. Estas  tres 
		caracter�sticas se pasan por par�metro en el momento de crear los objetos. 
		�  Los libros tienen adem�s un atributo prestado. Los libros, cuando se crean, 
		no est�n prestados. 
		�  Las revistas tienen un n�mero. En el momento de crear. En el momento de 
		crear las revistas se pasa el n�mero por par�metro. 
		�  Tanto las revistas como los libros deben tener (aparte de los constructores) 
		un  m�todo toString() que  devuelve  el  valor  de  todos  los  atributos  en  una 
		cadena de caracteres. Tambi�n tienen un m�todo que devuelve el a�o de 
		publicaci�n, y otro el c�digo. 
		�  Para prevenir posibles cambios en el programa se tiene que implementar una 
		interfaz Prestable con los m�todos prestar(), devolver() y prestado. La 
		clase Libro implementa esta interfaz 
	 */
	
	
	// metodo para contar los libros prestados
	public static int cuentaPrestados(Object[] lista) {
        int contador = 0;
        // metodo para comprobar si es prestable
        for (Object obj : lista) {
            if (obj instanceof Prestable && ((Prestable) obj).prestado()) {
                contador++;
            }
        }
        return contador;
    }

    // metodo para sacar las publicaciones anteriores al a�o que se quiera
	public static int publicacionesAnterioresA(Publicacion[] lista, int anio) {
        int contador = 0;
        for (Publicacion p : lista) {
            if (p.getAnio() < anio) {
                contador++;
            }
        }
        return contador;
    } 
	
	public static void main(String[] args) {
	        
		// Todos los libros y revistas declarados
		Publicacion[] biblioteca = { 
	    		new Libro("A24", "El Quijote", 1956),
	            new Revista("C81", "La mejor revista", 2008, 1582), 
	            new Libro("D93", "Los pilares de la Tierra", 1978),
	            new Revista("A71", "Bestseller revista", 2017, 85),
	            new Libro("B13", "Caperucita Roja", 1989),
	            };
	
	    // se transforma a libro para poder hacer la llamada
	    Libro l = (Libro) biblioteca[0]; 
	                                        
	    // llamada a prestar()
	    l.prestar();
	    
	    Libro l2 = (Libro) biblioteca[2];
	    l2.prestar();
	    
	    // Si descomento esto se devuelve uno de los libros que habian sido prestados
	    // l2.devolver();
	    
	    // Recorremos la biblioteca y mostramos todos los articulos que hay registrados
	    for (Publicacion p : biblioteca) {
	        System.out.println(p);
	    }
	    
	    // Publicaciones antes de 1990
	    System.out.println("El numero de publicaciones anteriores al a�o 1990 es: " + publicacionesAnterioresA(biblioteca, 1990));
	    // Libros prestados
	    System.out.println("El numero de libros prestados es: " + cuentaPrestados(biblioteca));
	}
	
}
