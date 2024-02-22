package Ejercicio20;

import java.util.Scanner;

public class Ejercicio20 {

	public static void main(String[] args) {
		Scanner t = new Scanner(System.in);
		int num = 0;
		System.out.println("Introduzca un numero: ");
		num = t.nextInt();
		for (int i = num; i >= 1; i--) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		t.close();
	}

}
