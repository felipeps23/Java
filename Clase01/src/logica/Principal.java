package logica;

public class Principal {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente
		
		System.out.println("Hola a todos!");
		
		// Declaración de variables y asignación para la reserva de memoria
			// Variable de tipo Clase
		String saludo="Hola curso Java";
		String espacio=" ";
		int numero1=12;
		double numero3=23.4545454545;
		
		System.out.println(saludo);
		System.out.println(numero1);
		System.out.println(numero3);
		
		// Concatenar datos
		System.out.println(saludo + " " + numero1);
		System.out.println(saludo + espacio + numero1);
		
		// Se suman
		System.out.println(numero3 + numero1);
		System.out.println(saludo + numero3 + numero1); // Se concatena porque coge de referencia el string
		System.out.println(saludo + (numero3 + numero1)); // Se suman porque entre paréntesis solo hay número
		
		//Operaciones básicas +,-,*,/
		int num1=2;
		int num2=5;
		
		// Solo he declarado una variable con su tipo de dato
		int suma;
		suma=num1+num2;
		System.out.println("Suma " + suma);
		// Actividad 1
		int resta;
		resta=num1-num2;
		System.out.println("Resta " + resta);
		
		int producto;
		producto=num1*num2;
		System.out.println("Producto " + producto);
		
		double num3=2;
		double num4=5;
		double division;
		division=num3/num4;
		// division=(double)num1/num2; // Se pone double porque estas diviendo números enteros
		System.out.println("División " + division);
		
		char letra='e'; // Cuando se usa char comillas simples
		System.out.println(letra);
		// Actividad 2 concatena tu nombre usando solamente tipo char
			// Almacenamiento de un carácter a través de código ASCII
		char letra1='F';
		char letra2='e';
		char letra3='l';
		char letra4='i';
		char letra5='p';
		char letra6='e';
		System.out.println(letra1 + letra2 + letra3 + letra4 + letra5 + letra6); // Me ha sumado las letras de código ASCII
		System.out.println("Mi nombre es " + letra1 + letra2 + letra3 + letra4 + letra5 + letra6); // Si no ponemos el String al principio se suman los numeros que corresponden del código ASCII de cada letra.
		
		// Actividad 3 suma, resta, división, multiplicación float
		float num5=2;
		float num6=5;
		
		float suma2;
		suma2=num5+num6;
		System.out.println(suma2);
		
		float resta2;
		resta2=num5-num6;
		System.out.println(resta2);
		
		float producto2;
		producto2=num5*num6;
		System.out.println(producto2);
		
		float division2;
		division2=num5/num6;
		System.out.println(division2);

		// Módulo símbolo es x%y
		int num7=6;
		int num8=9;
	
		int modulo = num8%num7;
		
		System.out.println(modulo);
		
		int num9=10;
		int num10=2;
	
		int modulo2 = num9%num10;
		
		System.out.println(modulo2);
		
		// Actividad 4 Calcular el módulo dia de nacimiento entre 2
		int num11=27;
		int num12=2;
	
		int modulo3 = num11%num12;
		
		System.out.println(modulo3);
		
	}

}
