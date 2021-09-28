package lista;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import java.util.LinkedList;

public class Camion extends Automovil{

	public Camion(String marca, String modelo, String fecha) {
		super(marca, modelo, fecha);
	}
	
	public static void main(String[] args) {
	
		List<String> concesionarioList = new ArrayList<String>();
		
		List<Automovil> camionList = new LinkedList<Automovil>();
		
		List<Integer> stockList = new Vector<Integer>();	
		
		concesionarioList.add("Salfa");
		concesionarioList.add("Volvo");
		
		camionList.add(new Automovil("Volvo", "3/4", "2001"));
		camionList.add(new Automovil("Mercedes", "3/4", "2000"));
		camionList.add(new Automovil("Samsung", "3/4", "2003"));
		
		stockList.add(100);
		stockList.add(100);
		stockList.add(300);
		stockList.add(400);
		
		stockList.remove(0);
		
		for(String s : concesionarioList ) {
			System.out.println(s);
		}
		
		System.out.println("==========================");
		for(Automovil a : camionList) {
			System.out.println("Marca " + a.getMarca() + "modelo " + a.getModelo() + " Fecha " + a.getFecha());
		}
		
		System.out.println("==========================");
		for(int t : stockList) {
			System.out.println(t);
		}
	
	}
}
