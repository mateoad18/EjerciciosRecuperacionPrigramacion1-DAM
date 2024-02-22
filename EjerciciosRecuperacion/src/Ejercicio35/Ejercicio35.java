package Ejercicio35;

import java.util.Scanner;

public class Ejercicio35 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String contraseña = "secreto";
		System.out.println("¡Bienvenido al juego \"La Contraseña\"!");
		do {
			System.out.print("Introduce una palabra: ");
			String intento = scanner.nextLine();
			boolean esCorrecto = verificarContraseña(intento, contraseña);
			if (esCorrecto) {
				System.out.println("¡Felicidades! Has adivinado la contraseña.");
			} else {
				System.out.println("Intento incorrecto. Has acertado " + contarLetrasCorrectas(intento, contraseña)
						+ " letra(s) en la posición correcta.");
			}

		} while (!verificarContraseña(scanner.nextLine(), contraseña));
		scanner.close();
	}

	public static boolean verificarContraseña(String intento, String contraseña) {
		return intento.equals(contraseña);
	}

	public static int contarLetrasCorrectas(String intento, String contraseña) {
		int letrasCorrectas = 0;
		int longitud = Math.min(intento.length(), contraseña.length());

		for (int i = 0; i < longitud; i++) {
			if (intento.charAt(i) == contraseña.charAt(i)) {
				letrasCorrectas++;
			}
		}

		return letrasCorrectas;
	}
}
