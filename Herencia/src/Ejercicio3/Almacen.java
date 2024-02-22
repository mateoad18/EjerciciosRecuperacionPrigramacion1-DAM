package Ejercicio3;

import java.util.ArrayList;

public class Almacen {
	ArrayList<Electrodomestico> lista = new ArrayList<Electrodomestico>();

	public void añadir(Electrodomestico e) {
		lista.add(e);
	}

	public void mostrar() {
		for (Electrodomestico electrodomestico : lista) {
			System.out.println(electrodomestico);
		}
	}
}
