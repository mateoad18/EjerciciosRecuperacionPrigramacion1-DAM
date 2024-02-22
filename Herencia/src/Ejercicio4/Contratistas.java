package Ejercicio4;

import java.util.ArrayList;

public class Contratistas extends Empleado {
	private ArrayList<SociedadAnonima> sociedades = new ArrayList<SociedadAnonima>();

	public Contratistas(String nombre, String apellidos, String fechCont, int numCuentBanco) {
		super(nombre, apellidos, fechCont, numCuentBanco);
		this.sociedades = new ArrayList<SociedadAnonima>();
	}

	public ArrayList<SociedadAnonima> getSociedades() {
		return sociedades;
	}

	public void setSociedades(ArrayList<SociedadAnonima> sociedades) {
		this.sociedades = sociedades;
	}

	@Override
	public void recibirPago(float importe, String concepto) {
		System.out.println("El contratista " + getNombre() + getApellidos() + ", recibe el ingreso de " + importe
				+ " en la cuenta nº " + getNumCuentBanco() + " con el siguiente concepto: " + concepto);
	}

}
