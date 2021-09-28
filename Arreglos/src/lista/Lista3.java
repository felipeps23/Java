package lista;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Lista3 {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente

		List<String> list = Stream.of("Mendez", "Solis").collect(Collectors.toList());
		
		if(list.contains("Solis")) {
			System.out.println("Esta persona existe");
		} else {
			System.out.println("Esta persona NO existe");
		}
	}

}
