import java.util.Scanner;

public class Ejercicio15 {

	public static int[][] cuadrada1(int dim) {
		int[][] matriz = new int[dim][dim];
		int contador = 1;

		for (int j = 0; j < dim; j++) {
			for (int i = 0; i < dim; i++) {
				matriz[i][j] = contador;
				contador++;
			}
		}

		return matriz;
	}

	public static int[][] cuadrada2(int dim) {
		int[][] matriz = new int[dim][dim];
		int contador = 1;

		for (int j = 0; j < dim; j++) {
			for (int i = 0; i < dim; i++) {
				matriz[i][j] = contador;
				contador++;
			}
		}
		contador = dim * dim;
		for (int i = 0; i < dim; i++) {
			matriz[i][dim - 1] = contador;
			contador--;
		}

		return matriz;
	}

	public static String[][] palindromos(int c, int f) {
		if (c < 1 || c > 26 || f < 1 || f > 26)
			return null;

		String[][] matriz = new String[f][c];
		char base = 'a';

		for (int i = 0; i < f; i++) {
			char primeraYUltima = (char) (base + i % 3);
			for (int j = 0; j < c; j++) {
				char segunda = (char) ('a' + (i + j) % 3);
				matriz[i][j] = "" + primeraYUltima + segunda + primeraYUltima;
			}
		}

		return matriz;
	}

	public static void imprimir(int dim, int[][] matriz) {
		for (int i = 0; i < dim; i++) {
			for (int j = 0; j < dim; j++) {
				System.out.print(matriz[i][j] + "\t");
			}
			System.out.println();
		}
	}

	public static int max3x3sum(int[][] matriz) {
		int n = matriz.length;
		int m = matriz[0].length;

		if (n < 3 || m < 3)
			throw new IllegalArgumentException("La matriz debe tener al menos 3 filas y 3 columnas.");

		int maxSum = Integer.MIN_VALUE;

		for (int i = 0; i <= n - 3; i++) {
			for (int j = 0; j <= m - 3; j++) {
				int sum = 0;
				for (int k = i; k < i + 3; k++) {
					for (int l = j; l < j + 3; l++) {
						sum += matriz[k][l];
					}
				}
				maxSum = Math.max(maxSum, sum);
			}
		}

		return maxSum;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese la dimension de la matriz cuadrada: ");
		int dim = scanner.nextInt();
		int[][] matrizCuadrada = cuadrada1(dim);
		int[][] matrizCuadrada2 = cuadrada2(dim);
		imprimir(dim, matrizCuadrada);
		System.out.println("");
		imprimir(dim, matrizCuadrada2);
		System.out.println("");
		System.out.println("Ingrese el numero de filas de la matriz palindromos: ");
		int f = scanner.nextInt();
		System.out.println("Ingrese el numero de columnas de la matriz palindromos: ");
		int c = scanner.nextInt();
		String[][] resultado = palindromos(f, c);
		if (resultado != null) {
			for (int i = 0; i < f; i++) {
				for (int j = 0; j < c; j++) {
					System.out.print(resultado[i][j] + "\t");
				}
				System.out.println();
			}
		} else {
			System.out.println("El número de filas o columnas está fuera del rango permitido.");
		}
		System.out.println("");
		System.out.println("Ingrese el numero de filas de la matriz: ");
		int filas = scanner.nextInt();
		System.out.println("Ingrese el numero de columnas de la matriz: ");
		int columnas = scanner.nextInt();
		int[][] matriz = new int[filas][columnas];
		int cont = 0;
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				matriz[i][j] = cont;
				cont++;
			}
		}
		int maxSum = max3x3sum(matriz);
		System.out.println("El valor máximo de la suma de las submatrices de 3x3 es: " + maxSum);
		scanner.close();
	}
}
