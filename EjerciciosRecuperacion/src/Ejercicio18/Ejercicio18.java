package Ejercicio18;

import java.util.Scanner;

public class Ejercicio18 {

	public static void main(String[] args) {
		Scanner t = new Scanner(System.in);
		int edades = 0;
		int mayores = 0;
		float media = 0;
		int numAlumnos = 0;
		int suma = 0;

		while (edades >= 0) {
			System.out.println("Introduzca la edad de los alumnos uno por uno: ");
			edades = t.nextInt();
			if (edades > 0) {
				numAlumnos++;
				suma += edades;
			}
			if (edades > 18) {
				mayores++;
			}
		}
		media = suma / numAlumnos;
		System.out.printf("La media de la edad de los alumnos es: %.2f \n", media);
		System.out.println("El numero de alumnos mayores de edad son: " + mayores);
		System.out.println("El numero total de alumnos es: " + numAlumnos);
		t.close();
	}
}
