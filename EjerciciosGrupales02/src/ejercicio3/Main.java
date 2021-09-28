package ejercicio3;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Operario oper = new Operario("Felipe", "Pacheco", "Soldado", "Granada", "999888777", "admin@gmail.com", "Tecnológico", 1250.5d, "Máximo");
		Directivo dire = new Directivo("Pepe", "Dominguez", "Montero", "Madrid", "123456789", "root@gmail.com", "Ambiental", 2000.0d);
		
		oper.imprimirOperario();
		dire.calcularSueldoAnual();
	}

}
