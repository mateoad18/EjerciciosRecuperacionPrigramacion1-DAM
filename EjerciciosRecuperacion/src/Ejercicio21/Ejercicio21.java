package Ejercicio21;

import java.util.Scanner;

public class Ejercicio21 {

	public static void main(String[] args) {
		Scanner t = new Scanner(System.in);
		int n = 0;
		System.out.println("Introduzca el n-ésimo termino de Fibonacci");
		n = t.nextInt();
		fibonacci(n);
		t.close();
	}

	private static void fibonacci(int n) {
		int n1 = 0;
		int n2 = 1;
		int n3 = 0;
		for (int i = 0; i < n-2; i++) {
			n3 = n1 + n2;
			n1 = n2;
			n2 = n3;
		}
		System.out.println("El ultimo termino es " + n3);

	}

}
