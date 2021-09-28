package lambda;

public class EjemploLamdba implements MiInterface {

	public static void main(String[] args) {
		
		MiInterface esDivisor = (n, m) -> (n%m) == 0;
		
		if (esDivisor.valorB(10, 2)) {
			System.out.println("2 es divisor de 10");
		}
		
		if (!esDivisor.valorB(10, 3)) {
			System.out.println("3 no es divisor de 10");
		}
		
		System.out.println();
		
		// Esta es la expresion lambda devuelve true o false dependiendo del caso
		
		MiInterface menorQue = (n, m) -> (n < m);
		
		if (menorQue.valorB(2, 10)) {
			System.out.println("El 2 es menor que 10");
		}
		
		if (!menorQue.valorB(10, 2)) {
			System.out.println("El 10 no es menor que 2");
		}
		
		MiInterface positivos = (n, m) -> (n < 0 ? -n : n) == (m < 0 ? -m : m);
		
	}

	@Override
	public boolean valorB(int n, int m) {
		// TODO Esbozo de método generado automáticamente
		return false;
	}

}
