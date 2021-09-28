package logica;

public class Habitaciones{
	
	private int dias;
	private float valorDias;
	
	public Habitaciones() {
		
	}
	
	public Habitaciones(int dias, float valorDias) {
		this.dias = dias;
		this.valorDias = valorDias;
	}
	
	// Accesadores o get	
	public int getDias() {
		return this.dias;
	}
	
	public float getValorDias() {
		return this.valorDias;
	}
	
	// Mutadores o set	
	public void setDias(int dias) {
		this.dias = dias;
	}
	
	public void setValorDias(float valorDias) {
		this.valorDias = valorDias;
	}
	
	// Método calculo de noches de hospedaje
	public float calculoNoches(int dias, float valorDias) {
			float resultado;
			resultado = dias*valorDias;
		return resultado;
	}
	
	public float calculoDiasSobra(float dineroDisponible, float valorDias) {
			float diasHospedado;
			diasHospedado = dineroDisponible/valorDias;
		return diasHospedado;
	}
	
	public float calculoDineroRestante(float dineroDisponible, float valorDias) {
			float moduloDinero;
			moduloDinero = dineroDisponible%valorDias;
		return moduloDinero;
	}
}
