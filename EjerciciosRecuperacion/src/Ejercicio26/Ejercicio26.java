package Ejercicio26;

public class Ejercicio26 {

	public static void main(String[] args) {
		int[] primos = obtenerPrimerosNPrimos(20);
		System.out.println("Los primeros 20 números primos son:");
		for (int primo : primos) {
			System.out.print(primo + " ");
		}
	}

	private static int[] obtenerPrimerosNPrimos(int n) {
		int[] primos = new int[n];
		int contador = 0;
		int numeroActual = 2;

		while (contador < n) {
			if (esPrimo(numeroActual)) {
				primos[contador] = numeroActual;
				contador++;
			}
			numeroActual++;
		}
		return primos;
	}

	private static boolean esPrimo(int numero) {
		if (numero <= 1) {
			return false;
		}
		for (int i = 2; i <= Math.sqrt(numero); i++) {
			if (numero % i == 0) {
				return false;
			}
		}
		return true;
	}
}