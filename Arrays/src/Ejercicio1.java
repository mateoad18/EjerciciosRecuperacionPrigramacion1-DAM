import java.util.Random;
import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Introduce la cantidad de veces que deseas lanzar el dado: ");
		int N = scanner.nextInt();

		if (N <= 0) {
			System.out.println("Por favor, introduce un número entero positivo.");
		} else {
			simularLanzamientoDado(N);
		}

		scanner.close();
	}

	public static void simularLanzamientoDado(int N) {
		int[] resultados = new int[6];
		Random random = new Random();
		for (int i = 0; i < N; i++) {
			int resultadoDado = random.nextInt(6) + 1;
			resultados[resultadoDado - 1]++;
		}
		for (int cara = 1; cara <= 6; cara++) {
			System.out.println("Cara " + cara + ": " + resultados[cara - 1] + " veces");
		}
	}
}
