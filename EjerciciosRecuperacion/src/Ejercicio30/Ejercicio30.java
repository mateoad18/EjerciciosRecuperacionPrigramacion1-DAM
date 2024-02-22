package Ejercicio30;

import java.util.Scanner;

public class Ejercicio30 {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	        int numLineas = 10;
	        String[] lineas = new String[numLineas];
	        for (int i = 0; i < numLineas; i++) {
	            System.out.print("Ingrese la línea " + (i + 1) + " (máximo 50 caracteres): ");
	            lineas[i] = scanner.nextLine();
	        }
	        ordenarLineasPorLongitud(lineas);
	        System.out.println("\nLíneas ordenadas por longitud:");
	        for (String linea : lineas) {
	            System.out.println(linea);
	        }

	        scanner.close();
	    }

	    private static void ordenarLineasPorLongitud(String[] lineas) {
	        for (int i = 0; i < lineas.length - 1; i++) {
	            for (int j = 0; j < lineas.length - i - 1; j++) {
	                if (lineas[j].length() > lineas[j + 1].length()) {
	                    String temp = lineas[j];
	                    lineas[j] = lineas[j + 1];
	                    lineas[j + 1] = temp;
	                }
	            }
	        }
	    }
	}