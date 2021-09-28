package logica;

public class Principal {

	public static void main(String[] args) {
		// TODO Esbozo de m�todo generado autom�ticamente
		
		System.out.println("Hola a todos!");
		
		// Declaraci�n de variables y asignaci�n para la reserva de memoria
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
		System.out.println(saludo + (numero3 + numero1)); // Se suman porque entre par�ntesis solo hay n�mero
		
		//Operaciones b�sicas +,-,*,/
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
		// division=(double)num1/num2; // Se pone double porque estas diviendo n�meros enteros
		System.out.println("Divisi�n " + division);
		
		char letra='e'; // Cuando se usa char comillas simples
		System.out.println(letra);
		// Actividad 2 concatena tu nombre usando solamente tipo char
			// Almacenamiento de un car�cter a trav�s de c�digo ASCII
		char letra1='F';
		char letra2='e';
		char letra3='l';
		char letra4='i';
		char letra5='p';
		char letra6='e';
		System.out.println(letra1 + letra2 + letra3 + letra4 + letra5 + letra6); // Me ha sumado las letras de c�digo ASCII
		System.out.println("Mi nombre es " + letra1 + letra2 + letra3 + letra4 + letra5 + letra6); // Si no ponemos el String al principio se suman los numeros que corresponden del c�digo ASCII de cada letra.
		
		// Actividad 3 suma, resta, divisi�n, multiplicaci�n float
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

		// M�dulo s�mbolo es x%y
		int num7=6;
		int num8=9;
	
		int modulo = num8%num7;
		
		System.out.println(modulo);
		
		int num9=10;
		int num10=2;
	
		int modulo2 = num9%num10;
		
		System.out.println(modulo2);
		
		// Actividad 4 Calcular el m�dulo dia de nacimiento entre 2
		int num11=27;
		int num12=2;
	
		int modulo3 = num11%num12;
		
		System.out.println(modulo3);
		
	}

}
