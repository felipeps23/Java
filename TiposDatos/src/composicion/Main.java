package composicion;

public class Main {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente

		Direccion d1 = new Direccion("Calle Girasol", 23);
		Direccion d2 = new Direccion("Calle Amapola", 21);
		Direccion d3 = new Direccion("Calle Rosa", 22);
		
		Persona p1 = new Persona("Jose", 21, d1);
		Persona p2 = new Persona("Pepe", 20, d2); // Si quito el d2 lo aniado abajo
		
		// p2.setDireccion(d2);
		
		Empresa e1 = new Empresa("FG34365DS", d3);
		
		System.out.println(e1.getDireccion().getCalle() + " n" + e1.getDireccion().getNumero());
	}

}
