
import java.util.Scanner;

public class Ejercicio16 {

	public static void rellenar(char[][] matriz, int filaInicial, int columnaInicial, char caracterInicial,
			char caracterRelleno) {

		int filas = matriz.length;
		int columnas = matriz[0].length;

		char original = matriz[filaInicial][columnaInicial];

		rellenarAux(matriz, filaInicial, columnaInicial, caracterInicial, caracterRelleno, original, filas, columnas);
	}

	private static void rellenarAux(char[][] matriz, int fila, int columna, char caracterInicial, char caracterRelleno,
			char original, int filas, int columnas) {

		if (fila < 0 || fila >= filas || columna < 0 || columna >= columnas || matriz[fila][columna] != original)
			return;

		matriz[fila][columna] = caracterRelleno;

		rellenarAux(matriz, fila - 1, columna, caracterInicial, caracterRelleno, original, filas, columnas);
		rellenarAux(matriz, fila + 1, columna, caracterInicial, caracterRelleno, original, filas, columnas);
		rellenarAux(matriz, fila, columna - 1, caracterInicial, caracterRelleno, original, filas, columnas);
		rellenarAux(matriz, fila, columna + 1, caracterInicial, caracterRelleno, original, filas, columnas);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int filas = scanner.nextInt();
		int columnas = scanner.nextInt();
		scanner.nextLine();

		char[][] matriz = new char[filas][columnas];
		for (int i = 0; i < filas; i++) {
			String fila = scanner.nextLine();
			matriz[i] = fila.toCharArray();
		}

		char caracterRelleno = scanner.nextLine().charAt(0);

		int filaInicial = scanner.nextInt();
		int columnaInicial = scanner.nextInt();

		System.out.println("Matriz original:");
		for (char[] fila : matriz) {
			System.out.println(fila);
		}

		rellenar(matriz, filaInicial, columnaInicial, matriz[filaInicial][columnaInicial], caracterRelleno);

		System.out.println("Matriz después del relleno:");
		for (char[] fila : matriz) {
			System.out.println(fila);
		}

		scanner.close();
	}
}
