package logica;

public class Operaciones{
	InterfazOperaciones suma = (n, m) -> n + m;
	InterfazOperaciones resta = (n, m) -> n - m;
	InterfazOperaciones multiplicacion = (n, m) -> n * m;
	InterfazOperaciones division = (n, m) -> n / m;
	
	public float sumar(float n1, float n2) {
		return suma.operar(n1, n2);
	}
	
	public float restar(float n1, float n2) {
		return resta.operar(n1, n2);
	}
	
	public float multiplicar(float n1, float n2) {
		return multiplicacion.operar(n1, n2);
	}
	
	public float dividir(float n1, float n2) {
		if (n2 == 0 ) {
			throw new ArithmeticException("No se puede dividir entre cero");
		} else
			return division.operar(n1, n2);
		
	}
	
}
