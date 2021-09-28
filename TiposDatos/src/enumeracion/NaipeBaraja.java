package enumeracion;

public class NaipeBaraja {

	private Palo palo;
	private int rango;
	
	/**
	 * @param palo
	 * @param rango
	 */
	
	public NaipeBaraja(Palo palo, int rango) {
		super();
		this.palo = palo;
		this.rango = rango;
	}
	
	public Palo getPalo() {
		return palo;
	}

	public void setPalo(Palo palo) {
		this.palo = palo;
	}

	public int getRango() {
		return rango;
	}

	public void setRango(int rango) {
		this.rango = rango;
	}

	public String getNamePalo() {
		
		String name = "";
		
		switch (palo) {
		
		case PICAS:
			name = "PICAS";
			break;
			
		case CORAZONES:
			name = "CORAZONES";
			break;
		
		case TREBOLES:
			name = "TREBOLES";
			break;	
			
		case DIAMANTES:
			name = "DIAMANTES";
			break;
			
		default:
			// No es necesario comprobar si hay errores
		}
		return name;
		
	}

}
