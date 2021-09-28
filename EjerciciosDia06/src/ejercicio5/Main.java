package ejercicio5;

public class Main {
	// Ejercicio 5
	/*
	    Escribe  una  interfaz,  llamada ColeccionInterfaz,  que  declare  los  siguientes 
		m�todos: 
		
		a)  a�adir(): a�ade un objeto por el extremo que corresponda, y devuelve 
		true si se ha a�adido y false en caso contrario. 
		b)  estaVacia(): devuelve true si la colecci�n est� vac�a y false en caso 
		contrario. 
		c)  extraer(): devuelve y elimina el primer elemento de la colecci�n. 
		d)  primero(): devuelve el primer elemento de la colecci�n. 
		Escribe una clase Pila, que implemente esta interfaz, utilizando para ello un array 
		de Object y un contador de objetos. 
		
		Como puede hacerse 
		1. En la interfaz se declaran todos los m�todos sin implementar ninguno. 
		2. Para la clase se utilizan como atributos un array de Object y un entero que 
		sirve de contador de objetos. 
		3. El constructor recibe por par�metro el tama�o m�ximo de la pila. 
		4. El m�todo estaVacia() comprueba si el contador es 0. 
		5. El m�todo a�adir() comprueba que cabe el elemento, y si es as�, lo a�ade 
		en  la  celda  que  indica  el  contador, posteriormente  se  incrementa el  valor 
		del contador. Devuelve true o false, seg�n si se ha a�adido o no. 
		6. primero() si est� vac�a, lanza NoSuchElementException, si no, devuelve el 
		elemento que est� indicado por el contador. 
		7. extraer() si est� vac�a, lanza NoSuchElementException, si no decrementa el 
		contador  y  devuelve  el  elemento  que  est�  enla  celda  indicada  por  el 
		contador, despu�s de decrementarse. 
		8. Sobreescribir el m�todo toString() (no estar�a de m�s)
	 */
	
	public static void main(String[] args) {
		
		Pila pila = new Pila(5);
		
		// A�adimos int a la pila
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
