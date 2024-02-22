package Ejercicio23;

import java.util.Scanner;

public class Ejercicio23 {

	public static void main(String[] args) {
		Scanner t = new Scanner(System.in);

		System.out.println("Introduce las coordenadas cartesianas (x, y):");
		double x = t.nextDouble();
		double y = t.nextDouble();

		CoordenadasPolares coordenadas = convertirACoordenadasPolares(x, y);

		System.out.println(
				"Coordenadas polares (r, θ): (" + coordenadas.getR() + ", " + coordenadas.getTheta() + " rad)");

		t.close();
	}

	public static CoordenadasPolares convertirACoordenadasPolares(double x, double y) {
		double r = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
		double theta = Math.atan2(y, x);

		return new CoordenadasPolares(r, theta);
	}

}

class CoordenadasPolares {
	private double r;
	private double theta;

	public CoordenadasPolares(double r, double theta) {
		this.r = r;
		this.theta = theta;
	}

	public double getR() {
		return r;
	}

	public double getTheta() {
		return theta;
	}
}