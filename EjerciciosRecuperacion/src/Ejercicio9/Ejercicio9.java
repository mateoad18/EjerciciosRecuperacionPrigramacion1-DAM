package Ejercicio9;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		Scanner t = new Scanner(System.in);
		System.out.println("Introduzca la nota del examen de matematicas ");
		float notaExamenM = t.nextFloat();
		System.out.println("Introduzca la nota de las tareas de matematicas");
		float notaTareasM = t.nextFloat();
		float mediaMates = matematicas(notaExamenM, notaTareasM);
		System.out.printf("La media es: " + "%.2f \n", mediaMates);
		System.out.println("Introduzca la nota del examen de fisica ");
		float notaExamenF = t.nextFloat();
		System.out.println("Introduzca la nota de las tareas de fisica");
		float notaTareasF = t.nextFloat();
		float mediaFisica = fisica(notaExamenF, notaTareasF);
		System.out.printf("La media es: " + "%.2f \n", mediaFisica);
		System.out.println("Introduzca la nota del examen de quimica");
		float notaExamenQ = t.nextFloat();
		System.out.println("Introduzca la nota de las tareas de quimica");
		float notaTareasQ = t.nextFloat();
		float mediaQuimica = quimica(notaExamenQ, notaTareasQ);
		System.out.printf("La media es: " + "%.2f \n", mediaQuimica);
		System.out.printf("La media global es: " + "%.2f\n", mediaGlobal(mediaMates, mediaFisica, mediaQuimica));
		t.close();
	}

	public static float matematicas(float examen, float tareas) {
		float media = 0;
		media = (float) ((examen * 0.9) + (tareas * 0.1));
		return media;
	}

	public static float fisica(float examen, float tareas) {
		float media = 0;
		media = (float) ((examen * 0.8) + (tareas * 0.2));
		return media;
	}

	public static float quimica(float examen, float tareas) {
		float media = 0;
		media = (float) ((examen * 0.85) + (tareas * 0.15));
		return media;
	}

	public static float mediaGlobal(float mediaMates, float mediaFisica, float mediaQuimica) {
		float mediaGlobal = (mediaMates + mediaFisica + mediaQuimica) / 3;
		return mediaGlobal;
	}
}
