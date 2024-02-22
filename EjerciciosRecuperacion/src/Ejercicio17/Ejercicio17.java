package Ejercicio17;

import java.util.Calendar;
import java.util.Scanner;

public class Ejercicio17 {

	public static void main(String[] args) {
		Scanner t = new Scanner(System.in);
		String nombre;
		Calendar calendari = Calendar.getInstance();
		float tiempo1 = calendari.getTimeInMillis();
		System.out.printf("Dime tu nombre: ");

		nombre = t.next();
		float tiempo2 = calendari.getTimeInMillis();
		float tiempo = tiempo2 - tiempo1;
		System.out.printf("\n Hola %s, has tardado %f segundos en decirme tu nombre", nombre, tiempo);
		t.close();
	}

}
