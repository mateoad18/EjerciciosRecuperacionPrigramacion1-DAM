package Ejercicio4;

import java.util.ArrayList;

public class SociedadAnonima {
	private String nombre;
	private ArrayList<String> trabajos = new ArrayList<String>();

	public SociedadAnonima(String nombre) {
		super();
		this.nombre = nombre;
		this.trabajos = new ArrayList<String>();
	}

	public String getNombre() {
		return nombre;
	}

	public ArrayList<String> getTrabajos() {
		return trabajos;
	}

	public void setTrabajos(ArrayList<String> trabajos) {
		this.trabajos = trabajos;
	}

}
