package logica;

public class Gamer {

	// Atributos-propiedades
		// Declaramos variables de la clase
		private String nombre;
		private int nivel;
		private char sexo;
		
		public Gamer() {
			
		}
		
		public Gamer(String nombre, int nivel, char sexo) {
			
			this.nombre = nombre;
			this.nivel = nivel;
			this.sexo = sexo; 
		}
		
		// Métodos o funciones accesadores(get) o mutadores(set)
		// Accesadores o get
		public String getNombre() {
			return this.nombre;
		}
		
		public int getNivel() {
			return this.nivel;
		}
		
		public char getSexo() {
			return this.sexo;
		}
		
		// Mutadores o set
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		
		public void setNivel(int nivel) {
			this.nivel = nivel;
		}
		
		public void setSexo(char sexo) {
			this.sexo = sexo;
		}

}
