package Ejercicio29;

import java.util.Scanner;

public class Ejercicio29 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numAsignaturas = 0;
		int numAlumnos = 10;
		System.out.println("Introduzca en numero de asignaturas que tiene cada alumno: ");
		numAsignaturas = scanner.nextInt();
		double[][] calificaciones = new double[numAlumnos][numAsignaturas];
		for (int i = 0; i < numAlumnos; i++) {
			System.out.println("Ingrese las calificaciones del alumno " + (i + 1) + ":");
			for (int j = 0; j < numAsignaturas; j++) {
				System.out.print("Calificación en la asignatura " + (j + 1) + ": ");
				calificaciones[i][j] = scanner.nextDouble();
			}
		}
		double[] mediasAsignaturas = new double[numAsignaturas];
		for (int j = 0; j < numAsignaturas; j++) {
			double suma = 0;
			for (int i = 0; i < numAlumnos; i++) {
				suma += calificaciones[i][j];
			}
			mediasAsignaturas[j] = suma / numAlumnos;
		}
		System.out.println("\nMedias de calificaciones por asignatura:");
		for (int j = 0; j < numAsignaturas; j++) {
			System.out.println("Asignatura " + (j + 1) + ": " + mediasAsignaturas[j]);
		}

		scanner.close();
	}
}