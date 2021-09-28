package ejercicio5;

import java.util.NoSuchElementException;

public class Pila implements ColeccionInterface {

	private int pila[];
	private int contador = 0;
	private int capacidad;
	
	/**
	 * @param pila
	 * @param contador
	 * @param capacidad
	 */
	public Pila(int capacidad) {
		this.capacidad = capacidad;
		this.pila = new int[this.capacidad];
	}

	public int[] getPila() {
		return pila;
	}

	public void setPila(int[] pila) {
		this.pila = pila;
	}

	public int getContador() {
		return contador;
	}

	public void setContador(int contador) {
		this.contador = contador;
	}

	public int getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}

	
	@Override
	public void anadir(int num) {
		// TODO Esbozo de método generado automáticamente
		if (this.contador <= this.capacidad) {
			pila[++contador] = num;
		}
		System.out.println("El numero " + num + " ha sido añadido.");
	}

	@Override
	public boolean estaVacia() {
		if (getContador() < 0) {
			return true;
		} else {
			return false;
		}

	}
	
	@Override
	public void extraer() {
		if (estaVacia()) {
			throw new NoSuchElementException("\nLa pila esta vacia");
		} else {
			pila[contador] = --contador;
			System.out.println("Numero " + contador + " retirado");
		}
	}
	
	@Override
	public int primero() {

		if (estaVacia()) {
			throw new NoSuchElementException("\nLa pila esta vacia");
		} else {
			return pila[1];
		}

	}
	
	public static void main(String[] args) {
	
	}
}
