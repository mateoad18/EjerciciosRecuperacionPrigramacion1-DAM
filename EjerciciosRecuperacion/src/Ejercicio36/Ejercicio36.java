package Ejercicio36;

import java.util.Scanner;

public class Ejercicio36 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Ingresa la primera palabra: ");
		String palabra1 = scanner.nextLine();
		System.out.print("Ingresa la segunda palabra: ");
		String palabra2 = scanner.nextLine();
		compararLongitud(palabra1, palabra2);
		scanner.close();
	}

	public static void compararLongitud(String palabra1, String palabra2) {
		int longitudPalabra1 = palabra1.length();
		int longitudPalabra2 = palabra2.length();

		if (longitudPalabra1 < longitudPalabra2) {
			System.out.println("La palabra \"" + palabra1 + "\" tiene menos caracteres que \"" + palabra2 + "\".");
		} else if (longitudPalabra1 > longitudPalabra2) {
			System.out.println("La palabra \"" + palabra2 + "\" tiene menos caracteres que \"" + palabra1 + "\".");
		} else {
			System.out.println("Ambas palabras tienen la misma cantidad de caracteres.");
		}
	}
}
