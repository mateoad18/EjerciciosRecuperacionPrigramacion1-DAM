public class Ejercicio13 {

	public static void ordenarPorInsercionDirecta(int[] vector) {
		for (int i = 1; i < vector.length; i++) {
			int actual = vector[i];
			int j = i - 1;
			while (j >= 0 && vector[j] > actual) {
				vector[j + 1] = vector[j];
				j--;
			}
			vector[j + 1] = actual;
		}
	}

	public static void ordenarPorSeleccionDirecta(int[] vector) {
		for (int i = 0; i < vector.length - 1; i++) {
			int minIndex = i;
			for (int j = i + 1; j < vector.length; j++) {
				if (vector[j] < vector[minIndex]) {
					minIndex = j;
				}
			}
			int temp = vector[minIndex];
			vector[minIndex] = vector[i];
			vector[i] = temp;
		}
	}

	public static void ordenarPorIntercambioDirecto(int[] vector) {
		for (int i = 0; i < vector.length - 1; i++) {
			for (int j = 0; j < vector.length - i - 1; j++) {
				if (vector[j] > vector[j + 1]) {
					int temp = vector[j];
					vector[j] = vector[j + 1];
					vector[j + 1] = temp;
				}
			}
		}
	}

	public static void imprimirVector(int[] vector) {
		for (int num : vector) {
			System.out.print(num + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		int[] vector = { 5, 3, 8, 1, 2, 7, 4, 6 };

		System.out.println("Vector original:");
		imprimirVector(vector);

		ordenarPorInsercionDirecta(vector.clone());
		System.out.println("Ordenado por inserción directa:");
		imprimirVector(vector);

		ordenarPorSeleccionDirecta(vector.clone());
		System.out.println("Ordenado por selección directa:");
		imprimirVector(vector);

		ordenarPorIntercambioDirecto(vector.clone());
		System.out.println("Ordenado por intercambio directo:");
		imprimirVector(vector);
	}
}
