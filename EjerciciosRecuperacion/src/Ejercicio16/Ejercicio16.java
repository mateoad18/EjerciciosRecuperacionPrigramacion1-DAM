package Ejercicio16;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio16 {

	public static void main(String[] args) {
		Random r = new Random();
		int numAleatorio = r.nextInt(100) + 1;
		int numJugador = 0;
		Scanner t = new Scanner(System.in);

		while (numJugador != numAleatorio) {
			System.out.println("Introduzca el numero a adivinar");
			numJugador = t.nextInt();
			if (numJugador < numAleatorio) {
				System.out.println("El numero inscrito es mas pequeño que el número secreto");
			} else {
				System.out.println("El numero inscrito es mas grande que el número secreto");
			}
		}
		System.out.println("Has acertado el número!");
		t.close();
	}

}
