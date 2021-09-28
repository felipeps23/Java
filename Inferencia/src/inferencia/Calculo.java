package inferencia;

public class Calculo {

	public static void main(String[] args) {
		// var no se ocupa como una variable global, sino mas bien como
		// una variable local dentro de un método
		var dato = "Hola";
		System.out.println(dato);
		var num1 = 23.4;
		var num2 = 4;
		var suma = num1 + num2;
		System.out.println(suma);
		
		var dato2 = "2";
		var dato3 = 3;
		System.out.println(dato2+dato3);
		
		// Calcular las operaciones básicas utilizando var, mostrar el tipo de dato del var
		var tipoVar= "Hola";
		var num3=2.5;
		var num4=5;
		
		var suma1 = num3 + num4;
		var resta1 = num3 - num4;
		var producto1 = num3 * num4;
		var division1 = num3 / num4;
		
		System.out.println("El resultado de la suma es: " + suma1 + ". El resultado de la resta es: " + resta1 + 
				". El resultado del producto es: " + producto1 + ". El resultado de la division es: " + division1);
		System.out.println("El tipo de variable de tipoVar es: " + tipoVar.getClass().getSimpleName());
		System.out.println("El tipo de variable de producto1 es: " + ((Object)producto1).getClass().getSimpleName());
		
	}

}
