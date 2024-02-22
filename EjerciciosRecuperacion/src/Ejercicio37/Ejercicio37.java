package Ejercicio37;

import java.util.Scanner;

public class Ejercicio37 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Ingresa una frase: ");
		String frase = scanner.nextLine();
		contarLetras(frase);
		scanner.close();
	}

	public static void contarLetras(String frase) {
		frase = frase.toLowerCase();
		int[] contadorLetras = new int[26];
		for (int i = 0; i < frase.length(); i++) {
			char caracter = frase.charAt(i);
			if (Character.isLetter(caracter)) {
				int indice = caracter - 'a';
				contadorLetras[indice]++;
			}
		}

		for (char letra = 'a'; letra <= 'z'; letra++) {
			int indice = letra - 'a';
			int contador = contadorLetras[indice];

			if (contador > 0) {
				System.out.println("La letra '" + letra + "' aparece " + contador + " veces.");
			}
		}
	}
}
