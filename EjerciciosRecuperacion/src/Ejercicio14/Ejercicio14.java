package Ejercicio14;

import java.util.Scanner;

public class Ejercicio14 {

	public static void main(String[] args) {
		int dni = 0;
		int longitud = 0;
		String dniTexto = null;
		char[] letras = { 'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H',
				'L', 'C', 'K', 'E' };
		Scanner t = new Scanner(System.in);
		while (longitud != 8) {
			System.out.println("Introduzca el DNI sin la letra");
			dni = t.nextInt();
			dniTexto = dni + "";
			longitud = dniTexto.length();
		}

		int resto = dni % 23;
		char letra = letras[resto];
		dniTexto += letra;
		System.out.println("El DNI con letra es:" + dniTexto);
		t.close();
	}
}
