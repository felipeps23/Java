package ejercicio3;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	// Ejercicio 3
	/*
	    Escribe una aplicación en java en la cual se implementen dos métodos: 
		a)  saldoPrestados(): recibe por parámetro un array de objetos, y 
		devuelve cuántos de ellos están prestados. 
		b)  cantPublicaciones(): recibe por parámetro un array de Publicaciones 
		y  un  año,  y  devuelve  cuántas  publicaciones  tienen  fecha  anterior  al 
		año recibido por parámetro. 
		c)  En el método main(), crear un array de Publicaciones, con 3 libros y 
		3  revistas,  prestar  uno  de  los  libros,  mostrar  por  pantalla  los  datos 
		almacenados en el array y mostrar por pantalla cuántas  hay prestadas 
		y cuantas hay anteriores a 2002. 
		
		Como puede hacerse 
		a)  saldoPrestados() recibe un array de Objetos para que se pueda utilizar tanto 
		con  Publicaciones  como  con  cualquier  otro  tipo  de  objetos  que  se  puedan 
		prestar. Para contar cuántos objetos están prestados, se utiliza un contador 
		que  se  inicializa  a  0.  Se  recorre  el  array  comprobando  si  cada  una  de  las 
		celdas es Prestable. Si lo es, se comprobará si está prestado. En este caso, 
		se incrementa el contador en una unidad 
		b)  cantPublicaciones():  utiliza  también  un  contador  inicializado  a  0.  Se 
		recorre  el  array  obteniendo  el  año  de  cada  una  de  las  publicaciones,  se 
		comprueba si es menor que el año recibido por parámetro y si es así, se 
		incrementa el contador.
	 */
	
	static Scanner teclado = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		ArrayList<Publicaciones> listaLibros = new ArrayList<Publicaciones>();
        // Añadimos publicaciones a nuestro arrayList
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
	
	// Metodo para contar las publicaciones anteriores al año establecido
	public static int cantPublicaciones(ArrayList<Publicaciones>listaLibros, int año) {
		int contadorAño = 0;
		
		for (Publicaciones publicaciones : listaLibros) {
			if (publicaciones.getAño() < año) {
				contadorAño++;
			}
		}
		return contadorAño;
	}
	
}
