package pila;

import java.util.Iterator;
import java.util.Stack;

public class Pila {

	public static void main(String[] args) {
		
		Stack<Integer> pila = new Stack<Integer>();
		
		pila.push(1);
		pila.push(2);
		pila.push(3);
		pila.push(4);
		pila.push(5);
		
		System.out.println("Los elementos actuales de mi pila son: " + pila);
		
		int eliminado = pila.pop();
		
		System.out.println("**********************************");
		
		System.out.println("Los elementos actuales de mi pila son: " + pila);
		System.out.println("El ultimo elemento eliminado es: " + eliminado);
		
		System.out.println("**********************************");
		
		System.out.println("El ultimo elemento de la pila es: " + pila.peek());
		
		System.out.println("**********************************");
		
		System.out.println("La posicion del numero 3 es: " + pila.search(3));
		
		System.out.println("**********************************");
		
		Iterator<Integer> i = pila.iterator();
		
		while(i.hasNext())
		
		System.out.println("Los elementos de la pila con while son: " + i.next());
		
	}
	
}
