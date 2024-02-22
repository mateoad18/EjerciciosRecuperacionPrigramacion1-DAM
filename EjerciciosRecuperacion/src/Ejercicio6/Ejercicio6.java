package Ejercicio6;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		// area=3.14159*(r*r)
		// perimetro=2 · π · r
		double radio = 0;
		Scanner t = new Scanner(System.in);
		System.out.println("Introduzca el radio de la circunferencia en metros");
		radio = t.nextDouble();
		double a = area(radio);
		System.out.println("El area de la circunferencia es: " + a + " metros");
		double p = perimetro(radio);
		System.out.println("El perimetro de la circunferencia es: " + p + " metros");
		t.close();
	}

	public static double area(double r) {
		double area = 0;
		area = Math.PI * (Math.pow(r, 2));
		return area;
	}

	public static double perimetro(double r) {
		double perimetro = 0;
		perimetro = 2 * Math.PI * r;
		return perimetro;
	}
}
