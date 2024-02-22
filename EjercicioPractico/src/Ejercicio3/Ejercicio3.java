package Ejercicio3;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio3 {
	Scanner t = new Scanner(System.in);
	private ArrayList<String> nombres = new ArrayList();
	private ArrayList<Float> notas = new ArrayList();

	public static void main(String[] args) {

	}

	public void cadenas() {
		int lineas = 0;
		System.out.println("Introduzca el numero de lineas que se deberan de leer");
		lineas = t.nextInt();
		for (int i = 0; i < lineas; i++) {
			String linea = t.nextLine();
			tratarlinea(linea);
		}
	}

	private void tratarlinea(String linea) {
		String[] trozos = linea.split("-");
		nombres.add(trozos[0]);
		String[] trozosNotas = trozos[1].split(";");
		for (int i = 0; i < trozosNotas.length; i++) {
			String nota = trozosNotas[i];
			float n = convertirNota(nota);
			notas.add(n);
		}
	}

	private float convertirNota(String nota) {
		Float.parseFloat(nota);
		return 0;
	}

}
