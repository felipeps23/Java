package ejercicio1;

import java.util.Scanner;

public class Login {

	private String usuarioCliente;
	private String claveCliente;
	private String usuarioAdmin;
	private String claveAdmin;
	private Cuenta cuenta;
	
	public Login() {
		this.usuarioCliente = "user123";
		this.claveCliente = "clave123";
		this.usuarioAdmin = "admin123";
		this.claveAdmin = "clave123";
		
		cuenta = new Cuenta ("12345678", "Felipe", 10000, 2);
	}
	
	public void loguearse(String usuario, String clave) {
		if (usuario.equals(this.usuarioCliente) && clave.equals(this.claveCliente)) {
			menuCliente();
		} else if (usuario.equals(this.usuarioAdmin) && clave.equals(this.claveAdmin)){
			menuAdmin();
		}
	}
	
	public void menuCliente() {
		Scanner teclado = new Scanner(System.in);
		int n = 0;
		do {
			System.out.println("===================================");
			System.out.println("1. Depositar dinero.");
			System.out.println("2. Retirar dinero.");
			System.out.println("3. Consultar saldo disponible.");
			System.out.println("4. Convertir la moneda de Euro a USD.");
			System.out.println("5. Salir del programa [Cualquier numero].");
			System.out.println("===================================");
			
			System.out.println("Que desea realizar?");
			n = teclado.nextInt();
			
			switch(n)
			{
			   case 1 : this.cuenta.depositarDinero();
			      break;
			   
			   case 2 : this.cuenta.retirarDinero();
			      break;
			   
			   case 3 : this.cuenta.consultarDinero();
			      break;
			      
			   case 4 : this.cuenta.convertirDinero();
			      break;

			   default: System.out.println("Programa finalizado");
				   break;
			}
		} while(n >= 1 && n < 5);
	}
	
	public void menuAdmin() {
		Scanner teclado = new Scanner(System.in);
		int n = 0;
		
		do {
			System.out.println("===================================");
			System.out.println("1. Consultar número de cuenta.");
			System.out.println("2. Consultar titular de la cuenta.");
			System.out.println("3. Consultar el saldo disponible de la cuenta.");
			System.out.println("4. Consultar el interés anual de la cuenta.");
			System.out.println("5. Salir del programa [Cualquier numero].");
			System.out.println("===================================");
			
			System.out.println("Que desea realizar?");
			n = teclado.nextInt();
			
			switch(n)
			{
			   case 1 : System.out.println("El identificador de esta cuenta es de: " + cuenta.getNumero());
			      break;
			   
			   case 2 : System.out.println("El titular de esta cuenta es de: " + cuenta.getTitular());
			      break;
			   
			   case 3 : System.out.println("El saldo de esta cuenta es de: " + cuenta.getSaldo());
			      break;
			      
			   case 4 : System.out.println("El interes anual de esta cuenta es de: " + cuenta.getIntAnual());
			      break;

			   default: System.out.println("Programa finalizado"); 
				   break;
			}
		} while(n >= 1 && n < 5);
	}
	
}
