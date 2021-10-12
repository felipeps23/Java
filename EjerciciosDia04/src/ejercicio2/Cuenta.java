package ejercicio2;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Cuenta {
	
	private String numero;
	private String titular;
	private float saldo;
	private float intAnual;
	private String pregunta;	
	
	public Cuenta() {
		
	}
	
	public Cuenta(String numero, String titular, float saldo, float intAnual) {
		super();
		this.numero = numero;
		this.titular = titular;
		this.saldo = saldo;
		this.intAnual = intAnual;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	public float getIntAnual() {
		return intAnual;
	}

	public void setIntAnual(float intAnual) {
		this.intAnual = intAnual;
	}
	
	public void depositarDinero() {
		Scanner teclado = new Scanner(System.in);
		float ingreso;
		System.out.println("Introduzca el dinero que quiere depositar: ");
		ingreso = teclado.nextFloat();
		if (ingreso > 0) {
			saldo = saldo + ingreso;
			System.out.println("Su saldo ahora es de: " + saldo);
		} else {
			System.out.println("La cantidad introducidad no es valida");
		}
	}
	
	public void retirarDinero() {
		Scanner teclado = new Scanner(System.in);
		float cargo;
		System.out.println("Introduzca el dinero que quiere retirar: ");
		cargo = teclado.nextFloat();
		if (cargo <= saldo) {
			saldo = saldo - cargo;
			System.out.println("Su saldo ahora es de: " + saldo);
		} else {
			System.out.println("No tiene tanto dinero en la cuenta");
		}
    }
	
	public void consultarDinero() {
		System.out.println("El saldo disponible es " + saldo);
	}
	
	public void convertirDinero() {
		float convertido;
		convertido = (float)(saldo * 1.17);
		
		System.out.println("Su saldo convertido a USD: " + convertido + "$");
	}
	
	// Ejercicio 2
	// Modificar el Ejercicio del cajero automático y crear diferentes clientes y cuentas asociadas 
	// a esos clientes, utilizando listas de arreglos. Preguntar si se desea crear mas cuentas
	public void adminCuentas(){
		Scanner teclado = new Scanner(System.in);
		List<Cuenta> clienteList = new LinkedList<Cuenta>();
		  do {			
			
			System.out.println("Introduce el numero de cuenta: ");
			numero = teclado.next();
			
			System.out.println("Introduce el titular de cuenta: ");
			titular = teclado.next();
			
			System.out.println("Introduce el saldo de cuenta: ");
			saldo = teclado.nextFloat();
			
			System.out.println("Introduce el interes de cuenta: ");
			intAnual = teclado.nextFloat();
			
			System.out.println("Desea crear más cuentas? S/N");
			pregunta = teclado.next();
			
			clienteList.add(new Cuenta(numero, titular, saldo, intAnual));

		 } while (pregunta.equals("S"));
		 
		 for (Cuenta a : clienteList) {
			System.out.println("Numero de cuenta: " + a.getNumero() + ", Titular: " + a.getTitular() +
					", Saldo: " +a.getSaldo() + ", Interes: " + a.getIntAnual());
		 }
	}
}
