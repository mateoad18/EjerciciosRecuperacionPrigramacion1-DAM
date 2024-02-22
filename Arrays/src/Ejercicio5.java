import java.util.*;
import java.util.stream.*;

public class Ejercicio5 {

	public static int maximo(int[] numeros) {
		return Arrays.stream(numeros).max().getAsInt();
	}

	public static double mediaExacta(int[] numeros) {
		return Arrays.stream(numeros).average().getAsDouble();
	}

	public static long cuentaCadenas(String[] array1, String[] array2, String cadena) {
		return Stream.concat(Arrays.stream(array1), Arrays.stream(array2)).filter(s -> s.contains(cadena)).count();
	}

	public static boolean sonIguales(String[] array1, String[] array2) {
		return Arrays.equals(array1, array2);
	}

	public static void intercambia(String[] array) {
		String temp = array[0];
		array[0] = array[1];
		array[1] = temp;
	}

	public static int rango(int[] numeros) {
		int min = Arrays.stream(numeros).min().getAsInt();
		int max = Arrays.stream(numeros).max().getAsInt();
		return max - min + 1;
	}

	public static double calculaS(int[] numeros) {
		double media = Arrays.stream(numeros).average().getAsDouble();
		double suma = 0;
		for (int numero : numeros) {
			suma += Math.pow(numero - media, 2);
		}
		return Math.sqrt(suma / (numeros.length - 1));
	}

	public static int[] sumaElementoAElemento(int[] array1, int[] array2) {
		int[] suma = new int[array1.length];
		for (int i = 0; i < array1.length; i++) {
			suma[i] = array1[i] + array2[i];
		}
		return suma;
	}

	public static int[] concatenaSinDuplicados(int[] array1, int[] array2) {
		return Arrays.stream(IntStream.concat(Arrays.stream(array1), Arrays.stream(array2)).distinct().toArray())
				.toArray();
	}

	public static int longitudSubsecuenciaOrdenada(int[] array) {
		int n = array.length;
		int[] dp = new int[n];
		int longitudMaxima = 0;

		for (int i = 0; i < n; i++) {
			dp[i] = 1;
			for (int j = 0; j < i; j++) {
				if (array[i] >= array[j]) {
					dp[i] = Math.max(dp[i], dp[j] + 1);
				}
			}
			longitudMaxima = Math.max(longitudMaxima, dp[i]);
		}

		return longitudMaxima;
	}

	public static void main(String[] args) {
		int[] numeros1 = { 5, 9, 11, 2, 7 };
		int[] numeros2 = { 3, 8, 10, 1, 6 };
		String[] cadenas1 = { "hola", "mundo" };
		String[] cadenas2 = { "hola", "mundo" };

		System.out.println("Maximo: " + maximo(numeros1));
		System.out.println("Media Exacta: " + mediaExacta(numeros1));
		System.out.println("Cuenta Cadenas: " + cuentaCadenas(cadenas1, cadenas2, "hola"));
		System.out.println("Son Iguales: " + sonIguales(cadenas1, cadenas2));
		intercambia(cadenas1);
		System.out.println("Intercambia: " + Arrays.toString(cadenas1));
		System.out.println("Rango: " + rango(numeros1));
		System.out.println("Calcula S: " + calculaS(numeros1));
		System.out.println("Suma Elemento a Elemento: " + Arrays.toString(sumaElementoAElemento(numeros1, numeros2)));
		System.out.println("Concatena Sin Duplicados: " + Arrays.toString(concatenaSinDuplicados(numeros1, numeros2)));
		System.out.println("Longitud Subsecuencia Ordenada: " + longitudSubsecuenciaOrdenada(numeros1));
	}
}