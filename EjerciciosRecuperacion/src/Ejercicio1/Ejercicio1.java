package Ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		String nombre;
		int edad;
		String direccion;
		Scanner t = new Scanner(System.in);
		System.out.println("Teclee su nombre");
		nombre = t.next();
		System.out.println("Teclee su edad");
		edad = t.nextInt();
		System.out.println("Teclee su direccion");
		direccion = t.next();
		System.out.println(nombre + edad + direccion);
		t.close();
	}

}
