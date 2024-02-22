package Ejercicio13;

import java.util.Scanner;

public class Ejercicio13 {

	public static void main(String[] args) {
		int numNumeros=0;
		int num;
		int suma = 0;
		double media = 0;
		Scanner t = new Scanner(System.in);
		System.out.println("Escriba cuantos numeros desea sumar: ");
		numNumeros = t.nextInt();
		while (numNumeros <= 0) {
			System.out.println("Secuencia invalida, pruebe otra vez");	
			numNumeros = t.nextInt();
		}

		for (int i = 0; i < numNumeros; i++) {
			System.out.println("Introduzca un numero");
			num = t.nextInt();
			suma += num;
		}
		media = suma / numNumeros;
		System.out.println("La suma de los numeros es: " + suma);
		System.out.printf("\n La media es: %.2f", media);
		t.close();
	}

}
