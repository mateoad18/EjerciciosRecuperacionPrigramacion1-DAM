import java.util.Scanner;

public class Ejercicio8 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] nombres = new String[10];
		for (int i = 0; i < nombres.length; i++) {
			System.out.print("Ingrese el nombre de la persona " + (i + 1) + ": ");
			nombres[i] = scanner.nextLine();
		}

		String cadenaMasLarga = encontrarCadenaMasLarga(nombres);
		System.out.println("La cadena más larga es: " + cadenaMasLarga);
	}

	private static String encontrarCadenaMasLarga(String[] vector) {
		if (vector == null || vector.length == 0) {
			return null;
		}

		String cadenaMasLarga = vector[0];

		for (int i = 1; i < vector.length; i++) {
			if (vector[i].length() > cadenaMasLarga.length()) {
				cadenaMasLarga = vector[i];
			}
		}

		return cadenaMasLarga;
	}
}
