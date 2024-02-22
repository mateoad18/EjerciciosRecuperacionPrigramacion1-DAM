
import java.util.Scanner;
import java.util.Random;

public class Ejercicio4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Ingrese el tamaño del vector (entre 10 y 200): ");
		int tamano = scanner.nextInt();
		if (tamano < 10 || tamano > 200) {
			System.out.println("Tamaño no válido. El tamaño debe estar entre 10 y 200.");
			return;
		}

		int[] vector = new int[tamano];
		Random random = new Random();
		for (int i = 0; i < tamano; i++) {
			vector[i] = random.nextInt(201) - 100;
		}
		int suma = 0;
		int numerosNoSumados = 0;
		for (int i = 0; i < tamano; i++) {
			if (vector[i] != 13 && (i + 13 >= tamano || suma != 7)) {
				suma += vector[i];
			} else {
				numerosNoSumados++;
			}
		}

		System.out.println(
				"Suma de los números almacenados (sin considerar el 13 y siguientes si la suma es 7): " + suma);
		System.out.println("Contenido del vector:");
		for (int i = 0; i < tamano; i++) {
			System.out.print(vector[i] + " ");
		}
		System.out.println();
		System.out.println("Cantidad de números que no se han sumado: " + numerosNoSumados);
	}
}
