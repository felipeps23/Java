package fechas;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Ejemplo01 {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente

		// Fecha
		LocalDate miFecha = LocalDate.now();
		System.out.println(miFecha);
		
		//Hora
		LocalTime miHora = LocalTime.now();
		System.out.println(miHora);
		
		// Fecha y Hora
		LocalDateTime miHoraFecha = LocalDateTime.now();
		System.out.println(miHoraFecha);
		
		// Formatear Fecha
		// Original yyyy-MM-dd
		DateTimeFormatter miFormato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String formato = miFecha.format(miFormato);
		
		System.out.println(formato);
		
		// Formatear Hora
		DateTimeFormatter miFormato2 = DateTimeFormatter.ofPattern("dd/MMM/yyyy HH:mm:ss.ss");
		String formato2 = miHoraFecha.format(miFormato2);
		
		System.out.println(formato2);
	}

}
