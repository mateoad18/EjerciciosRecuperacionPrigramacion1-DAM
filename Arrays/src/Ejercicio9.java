import java.util.Scanner;

public class Ejercicio9 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Ingrese el tamaño del vector: ");
		int tamano = scanner.nextInt();
		int[] vector = new int[tamano];
		System.out.println("Ingrese los elementos del vector:");
		for (int i = 0; i < tamano; i++) {
			vector[i] = scanner.nextInt();
		}
		Integer indiceCentro = centro(vector);
		if (indiceCentro != null) {
			System.out.println("El índice del centro del vector es: " + indiceCentro);
		} else {
			System.out.println("El vector no tiene centro.");
		}
	}

	public static Integer centro(int[] vector) {
		if (vector == null || vector.length == 0) {
			return null;
		}

		int sumaIzquierda = 0;
		int sumaDerecha = 0;

		for (int num : vector) {
			sumaDerecha += num;
		}

		for (int i = 0; i < vector.length; i++) {
			sumaDerecha -= vector[i];

			if (sumaIzquierda == sumaDerecha) {
				return i;
			}

			sumaIzquierda += vector[i];
		}

		return null;
	}
}
