import java.util.Random;

public class Ejercicio6 {
	public static void main(String[] args) {
		Random random = new Random();
		int tamano = random.nextInt(491) + 10;
		int[] vector = new int[tamano];
		for (int i = 0; i < tamano; i++) {
			vector[i] = random.nextInt(201) - 100;
		}

		if (tamano <= 50) {
			System.out.println("Contenido del vector:");
			for (int i = 0; i < tamano; i++) {
				System.out.print(vector[i] + " ");
			}
			System.out.println();
		}
		int contadorSecuencias = contarSecuenciasRepetidas(vector);
		System.out.println("Número de secuencias de números repetidos: " + contadorSecuencias);
	}

	private static int contarSecuenciasRepetidas(int[] vector) {
		int contadorSecuencias = 0;

		for (int i = 0; i < vector.length - 1; i++) {
			if (vector[i] == vector[i + 1]) {
				contadorSecuencias++;
				while (i < vector.length - 1 && vector[i] == vector[i + 1]) {
					i++;
				}
			}
		}

		return contadorSecuencias;
	}
}
