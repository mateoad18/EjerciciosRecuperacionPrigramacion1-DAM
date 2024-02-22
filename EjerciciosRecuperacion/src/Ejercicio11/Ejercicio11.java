package Ejercicio11;

import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
		int n;
		Scanner t = new Scanner(System.in);
		System.out.println("Introduzca un número:");
		n = t.nextInt();
		valor(n);
		t.close();
	}

	private static void valor(int n) {
		if (n == 0) {
			System.out.println("El numero es 0");
		} else {
			if (n < 0) {
				System.out.println("El numero es negativo");
			} else {
				System.out.println("El numero es positivo");
			}
		}
	}

}
