package Ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {
	public static float valorDolar = 1.06f;

	public static float convertirDolar(float euro) {
		float dolar = euro * valorDolar;
		return dolar;
	}

	public static void main(String[] args) {
		Scanner t = new Scanner(System.in);
		System.out.println("Escriba los euros que quiera convertir:");
		float euro = t.nextFloat();
		float d = convertirDolar(euro);
		System.out.printf("La cantidad de %.2f € en dolares es %.2f $",euro,d);
		t.close();
	}

}
