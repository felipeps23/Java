package hashMap;

import java.util.HashMap;

public class Ejemplo01 {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente

		HashMap<Integer, String> codigoComunidad = new HashMap<Integer, String>();
		
		// Agregar Clave y Valor
		
		codigoComunidad.put(91, "Madrid");
		codigoComunidad.put(98, "Galicia");
		codigoComunidad.put(96, "Murcia");
		codigoComunidad.put(95, "Andalucia");
				
		
		System.out.println("============================");
		
		System.out.println(codigoComunidad.get(95));
		
		System.out.println("============================");
		
		codigoComunidad.remove(95);
		
		System.out.println(codigoComunidad);
		
		System.out.println("============================");
		
		for (int i : codigoComunidad.keySet() ) {
			if(codigoComunidad.get(i).equals("Murcia")) {
				System.out.println(i);
			}
		}
	}

}
