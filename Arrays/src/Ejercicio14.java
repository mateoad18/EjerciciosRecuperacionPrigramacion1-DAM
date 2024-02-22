import java.util.Arrays;
import java.util.Random;

public class Ejercicio14 {

	public static void main(String[] args) {

		Random random = new Random();
		int longitudVector1 = random.nextInt(91) + 10;
		int longitudVector2 = random.nextInt(91) + 10;
		int[] vector1 = generarVectorAleatorio(longitudVector1);
		int[] vector2 = generarVectorAleatorio(longitudVector2);
		Arrays.sort(vector1);
		Arrays.sort(vector2);
		int[] vectorMezclado = mezclarVectoresOrdenados(vector1, vector2);
		System.out.println("Vector 1 ordenado:");
		imprimirVector(vector1);
		System.out.println("Vector 2 ordenado:");
		imprimirVector(vector2);
		System.out.println("Vector mezclado manteniendo la ordenación:");
		imprimirVector(vectorMezclado);
	}

	public static int[] generarVectorAleatorio(int longitud) {
		int[] vector = new int[longitud];
		Random random = new Random();
		for (int i = 0; i < longitud; i++) {
			vector[i] = random.nextInt(100);
		}
		return vector;
	}

	public static int[] mezclarVectoresOrdenados(int[] vector1, int[] vector2) {
		int[] vectorMezclado = new int[vector1.length + vector2.length];
		int i = 0, j = 0, k = 0;
		while (i < vector1.length && j < vector2.length) {
			if (vector1[i] < vector2[j]) {
				vectorMezclado[k++] = vector1[i++];
			} else {
				vectorMezclado[k++] = vector2[j++];
			}
		}
		while (i < vector1.length) {
			vectorMezclado[k++] = vector1[i++];
		}
		while (j < vector2.length) {
			vectorMezclado[k++] = vector2[j++];
		}
		return vectorMezclado;
	}

	public static void imprimirVector(int[] vector) {
		for (int num : vector) {
			System.out.print(num + " ");
		}
		System.out.println();
	}
}
