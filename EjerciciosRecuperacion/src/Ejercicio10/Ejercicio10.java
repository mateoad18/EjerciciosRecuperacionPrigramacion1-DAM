package Ejercicio10;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		int a;
		int b;
		int c;
		Scanner t = new Scanner(System.in);
		System.out.println("Introduzca el valor de la constante A");
		a = t.nextInt();
		System.out.println("Introduzca el valor de la constante B");
		b = t.nextInt();
		System.out.println("Introduzca el valor de la constante C");
		c = t.nextInt();
		solucion(a, b, c);
		t.close();
	}

	public static void solucion(int a, int b, int c) {
		float raiz = (b * b) - (4 * a * c);
		float x = 0;
		float x2 = 0;
		if (raiz == 0) {
			x = -b / (2 * a);
		} else {
			if (raiz < 0) {
				System.out.println("No tiene solucion");
			} else {
				x = (float) (-b + Math.sqrt(raiz)) / (2 * a);
				x2 = (float) (-b - Math.sqrt(raiz)) / (2 * a);
				System.out.printf("\nLas soluciones posibles son: %.2f y %.2f", x, x2);
			}
		}
	}
}
