import java.util.Random;
import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		Scanner t = new Scanner(System.in);
		System.out.println("Ingresa el tamaño del vector (entre 10 y 20):");
		int tamaño = t.nextInt();
		if (tamaño < 10 || tamaño > 20) {
			System.out.println("Tamaño no valido, intentelo de nuevo");
			return;
		}
		int[] vector = new int[tamaño];
		Random random = new Random();
		for (int i = 0; i < vector.length; i++) {
			vector[i] = random.nextInt(101);
		}
		System.out.println("");
		int minDif = MinimaDiferencia(vector);
		System.out.println("Mínima diferencia entre dos valores adyacentes: " + minDif);
	}

	private static int MinimaDiferencia(int[] vector) {
		if (vector.length <= 1) {
			return 0;
		}
		int minDif = Math.abs(vector[1] - vector[0]);
		for (int i = 2; i < vector.length; i++) {
			int diferencia = Math.abs(vector[i] - vector[i - 1]);
			minDif = Math.min(minDif, diferencia);
		}
		return minDif;
	}

}
