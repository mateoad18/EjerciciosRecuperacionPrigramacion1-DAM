package Ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {
	
	public static void dividir(float dividendo, float divisor) {
		int cociente = 0;
		float resto = 0;
		while (dividendo > 0) {
			dividendo = dividendo - divisor;
			cociente++;
		}
		resto = dividendo;
		System.out.print(cociente);
	}

	public static void main(String[] args) {
		Scanner t = new Scanner(System.in);
		System.out.println("Introduzca el dividendo");
		float dividendo= t.nextFloat();
		System.out.println("Introduzca divisor");
		float divisor = t.nextFloat();
		dividir(dividendo,divisor);
			}

}
