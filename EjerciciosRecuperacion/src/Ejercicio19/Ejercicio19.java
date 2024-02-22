package Ejercicio19;

import java.util.Scanner;

public class Ejercicio19 {

	public static void main(String[] args) {
		Scanner t = new Scanner(System.in);
		int num = 0;
		int suma = 0;
		System.out.println("Introduce un número: ");
		num = t.nextInt();
		for (int i = 1; i <= num; i++) {
			suma += i;
		}
		System.out.println("La suma de los numeros es: " + suma);
		t.close();
	}

}
