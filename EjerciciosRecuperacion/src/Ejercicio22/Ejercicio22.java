package Ejercicio22;

import java.util.Scanner;

public class Ejercicio22 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Introduce las coordenadas del primer punto (x1, y1):");
		double x1 = scanner.nextDouble();
		double y1 = scanner.nextDouble();

		System.out.println("Introduce las coordenadas del segundo punto (x2, y2):");
		double x2 = scanner.nextDouble();
		double y2 = scanner.nextDouble();

		double distancia = calcularDistanciaEuclidiana(x1, y1, x2, y2);

		System.out.println("La distancia euclidiana entre los dos puntos es: " + distancia);

		scanner.close();
	}

	public static double calcularDistanciaEuclidiana(double x1, double y1, double x2, double y2) {
		double diferenciaX = x2 - x1;
		double diferenciaY = y2 - y1;

		double distancia = Math.sqrt(Math.pow(diferenciaX, 2) + Math.pow(diferenciaY, 2));

		return distancia;
	}
}