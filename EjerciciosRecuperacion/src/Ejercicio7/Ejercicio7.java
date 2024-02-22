package Ejercicio7;

import java.util.Scanner;

public class Ejercicio7 {
	static double G = 6.673 * Math.pow(10, -11);

	public static void main(String[] args) {
		// F=G*(M1*M2/D*D)
		double m1 = 0;
		double m2 = 0;
		double d = 0;
		Scanner t = new Scanner(System.in);
		System.out.println("Introduzca el valor de la masa 1: ");
		m1 = t.nextDouble();
		System.out.println("Introduzca el valor de la masa 2: ");
		m2 = t.nextDouble();
		System.out.println("Introduzca la distancia entre las masas: ");
		d = t.nextDouble();
		fuerza(m1, m2, d);
		t.close();

	}

	public static void fuerza(double m1, double m2, double d) {
		double f = 0;
		f = G * ((m1 * m2) / Math.pow(d, 2));
		System.out.println("El valor de la fuerza es: " + f);
	}
}
