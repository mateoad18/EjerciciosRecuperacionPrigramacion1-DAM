package Ejercicio32;

import java.util.Scanner;

public class Ejercicio32 {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	        System.out.print("Ingresa una frase: ");
	        String frase = scanner.nextLine();
	        mostrarFraseMayusculas(frase);
	        scanner.close();
	    }
	    public static void mostrarFraseMayusculas(String cadena) {
	        String mayusculas = cadena.toUpperCase();
	        System.out.println("La frase en mayúsculas es: " + mayusculas);
	    }
	}