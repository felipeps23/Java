package lista;

import java.util.ArrayList;
import java.util.List;

public class Lista4 {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente

		List<String> nomodificable = List.of("uno", "dos", "tres");
		List<String> modificable = new ArrayList<>(List.of("cuatro", "cinco", "seis"));	
		
		// nomodificable.add("cero"); No se puede add en List.of
		
		for(String l: nomodificable) {
			System.out.println(l);
		}
		
		modificable.add("siete");
		
		for(String l: modificable) {
			System.out.println(l);
		}
		
	}

}
