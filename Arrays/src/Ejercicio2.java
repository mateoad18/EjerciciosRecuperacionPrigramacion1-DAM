import java.util.Arrays;
import java.util.Random;

public class Ejercicio2 {

	public static void main(String[] args) {
		int tamano = new Random().nextInt(41) + 10;
		int[] vectorOriginal = new int[tamano];
		llenarVector(vectorOriginal);
		int[] vectorInverso = new int[tamano];
		for (int i = 0; i < tamano; i++) {
			vectorInverso[i] = vectorOriginal[tamano - 1 - i];
		}
		System.out.println("Vector Original: " + Arrays.toString(vectorOriginal));
		System.out.println("Vector Inverso: " + Arrays.toString(vectorInverso));
	}

	private static void llenarVector(int[] vector) {
		Random random = new Random();
		boolean[] numerosUtilizados = new boolean[201];
		for (int i = 0; i < vector.length; i++) {
			int numeroAleatorio;
			do {
				numeroAleatorio = random.nextInt(201) - 100;
			} while (numerosUtilizados[numeroAleatorio + 100]);
			vector[i] = numeroAleatorio;
			numerosUtilizados[numeroAleatorio + 100] = true;
		}
	}
}
