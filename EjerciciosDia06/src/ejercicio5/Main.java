package ejercicio5;

public class Main {
	// Ejercicio 5
	/*
	    Escribe  una  interfaz,  llamada ColeccionInterfaz,  que  declare  los  siguientes 
		métodos: 
		
		a)  añadir(): añade un objeto por el extremo que corresponda, y devuelve 
		true si se ha añadido y false en caso contrario. 
		b)  estaVacia(): devuelve true si la colección está vacía y false en caso 
		contrario. 
		c)  extraer(): devuelve y elimina el primer elemento de la colección. 
		d)  primero(): devuelve el primer elemento de la colección. 
		Escribe una clase Pila, que implemente esta interfaz, utilizando para ello un array 
		de Object y un contador de objetos. 
		
		Como puede hacerse 
		1. En la interfaz se declaran todos los métodos sin implementar ninguno. 
		2. Para la clase se utilizan como atributos un array de Object y un entero que 
		sirve de contador de objetos. 
		3. El constructor recibe por parámetro el tamaño máximo de la pila. 
		4. El método estaVacia() comprueba si el contador es 0. 
		5. El método añadir() comprueba que cabe el elemento, y si es así, lo añade 
		en  la  celda  que  indica  el  contador, posteriormente  se  incrementa el  valor 
		del contador. Devuelve true o false, según si se ha añadido o no. 
		6. primero() si está vacía, lanza NoSuchElementException, si no, devuelve el 
		elemento que está indicado por el contador. 
		7. extraer() si está vacía, lanza NoSuchElementException, si no decrementa el 
		contador  y  devuelve  el  elemento  que  está  enla  celda  indicada  por  el 
		contador, después de decrementarse. 
		8. Sobreescribir el método toString() (no estaría de más)
	 */
	
	public static void main(String[] args) {
		
		Pila pila = new Pila(5);
		
		// Añadimos int a la pila
		// pila.anadir(1);
		pila.anadir(2);
		pila.anadir(3);
		pila.anadir(4);
		
		// Comprobamos si la pila esta vacia
		if (pila.estaVacia()) {
			System.out.println("La pila esta vacia");
		} else {
			System.out.println("La pila no esta vacia");
		}
		
		// Sacamos el ultimo numero de la pila
		System.out.println("El primer numero de la pila es " + pila.primero());
		
		// Extraemos el numero
		pila.extraer();
		
	}

}
