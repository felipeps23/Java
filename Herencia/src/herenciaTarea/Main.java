package herenciaTarea;

public class Main {

	public static void main(String[] args) {
		// TODO Esbozo de m�todo generado autom�ticamente

		Docente doc = new Docente("Felipe", 21, 18000, "12345678W", 5, 'M');
		
		doc.imprimir();
		System.out.println("=====================================================");
		System.out.println("Su sueldo mensual es: " + doc.calcularSueldoMensual(doc.getSueldo()) + "�");
		System.out.println("=====================================================");
		System.out.println("A�n puede dar clase a " + doc.calcularCursosRestantes(doc.getCursosImpartidos()) + " cursos m�s");
	}

}
