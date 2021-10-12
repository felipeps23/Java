package ejercicio6;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;


public class Main extends Cliente {

	public Main(String nombre, int telefono, String apellido, String email) {
		super(nombre, telefono, apellido, email);
	}
	
	public static void main(String[] args) {
		// Ejercicio 6
		// Pedir por teclado los datos de un cliente (nombre, apellido, fono, email) puedes ser 
		// máximo 10 clientes y guardarlo en una lista que tenga Link a otra clase. Luego mostrar los 
		// datos por pantalla y que me dé la opción de agregar más usuarios si se desea.
		Scanner teclado = new Scanner(System.in);
		int cont = 0;
		String pregunta, pregunta2;
		List<Cliente> clienteList = new LinkedList<Cliente>();
		do {
			do {
				System.out.println("====================================");
				System.out.println("Ingrese el nombre: ");
				String nombre = teclado.next();
				System.out.println("Ingrese el telefono: ");
				int telefono = teclado.nextInt();
				System.out.println("Ingrese el apellido: ");
				String apellido = teclado.next();
				System.out.println("Ingrese el email: ");
				String email = teclado.next();
				
				clienteList.add(new Cliente(nombre, telefono, apellido, email));
				
				cont ++;
				
				System.out.println("¿Quieres agregar otro cliente? s/n");
				pregunta = teclado.next();			
				
				
			} while(cont < 10 && pregunta.equals("s"));
			for(Cliente c : clienteList) {
				System.out.println("Nombre " + c.getNombre() + " Telefono " + c.getTelefono() + " Apellido " + c.getApellido() + " Email " + c.getEmail());
			}
			System.out.println("¿Desea añadir más clientes? s/n");
			pregunta2 = teclado.next();
		} while (pregunta2.equals("s"));
	}

}
