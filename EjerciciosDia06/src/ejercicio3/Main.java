package ejercicio3;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	// Ejercicio 3
	/*
	    Escribe una aplicaci�n en java en la cual se implementen dos m�todos: 
		a)  saldoPrestados(): recibe por par�metro un array de objetos, y 
		devuelve cu�ntos de ellos est�n prestados. 
		b)  cantPublicaciones(): recibe por par�metro un array de Publicaciones 
		y  un  a�o,  y  devuelve  cu�ntas  publicaciones  tienen  fecha  anterior  al 
		a�o recibido por par�metro. 
		c)  En el m�todo main(), crear un array de Publicaciones, con 3 libros y 
		3  revistas,  prestar  uno  de  los  libros,  mostrar  por  pantalla  los  datos 
		almacenados en el array y mostrar por pantalla cu�ntas  hay prestadas 
		y cuantas hay anteriores a 2002. 
		
		Como puede hacerse 
		a)  saldoPrestados() recibe un array de Objetos para que se pueda utilizar tanto 
		con  Publicaciones  como  con  cualquier  otro  tipo  de  objetos  que  se  puedan 
		prestar. Para contar cu�ntos objetos est�n prestados, se utiliza un contador 
		que  se  inicializa  a  0.  Se  recorre  el  array  comprobando  si  cada  una  de  las 
		celdas es Prestable. Si lo es, se comprobar� si est� prestado. En este caso, 
		se incrementa el contador en una unidad 
		b)  cantPublicaciones():  utiliza  tambi�n  un  contador  inicializado  a  0.  Se 
		recorre  el  array  obteniendo  el  a�o  de  cada  una  de  las  publicaciones,  se 
		comprueba si es menor que el a�o recibido por par�metro y si es as�, se 
		incrementa el contador.
	 */
	
	static Scanner teclado = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		ArrayList<Publicaciones> listaLibros = new ArrayList<Publicaciones>();
        // A�adimos publicaciones a nuestro arrayList
        listaLibros.add(new Publicaciones("El Quijote", 2008, true));
		listaLibros.add(new Publicaciones("Caperucita Roja", 2021, false));
		listaLibros.add(new Publicaciones("Los pilares de la Tierra", 2017, true));
		listaLibros.add(new Publicaciones("Consejos de vida", 2005, true));
		
		// Libros antes del 2010
		System.out.println("Libros publicados antes de 2010: " + cantPublicaciones(listaLibros, 2010) + " libros.");
		// Cantidad de libros prestados
        System.out.println("Tenemos prestados un total de: " + saldoPrestados(listaLibros) + " libros.");
		
    }
	
	// Metodo para contar las publicaciones que tenemos prestadas
	public static int saldoPrestados(ArrayList<Publicaciones>listaLibros) {
		int contadorPre = 0;
		
		for (Publicaciones publicaciones : listaLibros) {
			if (publicaciones.getPrestado() == true) {
				contadorPre++;
			}
		}
		return contadorPre;
	}
	
	// Metodo para contar las publicaciones anteriores al a�o establecido
	public static int cantPublicaciones(ArrayList<Publicaciones>listaLibros, int a�o) {
		int contadorA�o = 0;
		
		for (Publicaciones publicaciones : listaLibros) {
			if (publicaciones.getA�o() < a�o) {
				contadorA�o++;
			}
		}
		return contadorA�o;
	}
	
}
