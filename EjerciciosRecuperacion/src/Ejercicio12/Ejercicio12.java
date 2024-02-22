package Ejercicio12;

import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
		int n;
		Scanner t = new Scanner(System.in);
		System.out.println("Introduzca un numero para hacer la sucesion");
		n = t.nextInt();
		System.out.printf("\nEl valor de la serie es: %.2f", sumaSerie(n));
		t.close();
	}

	public static float sumaSerie(int n) {
		float suma = 0;
		if (n > 0) {

			for (int i = 1; i <= n; i++) {
				suma += 1 / (float) i;
			}
			return suma;

		} else {
			return 0;
		}
	}
}
