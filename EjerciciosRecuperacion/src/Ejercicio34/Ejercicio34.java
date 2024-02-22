package Ejercicio34;

import java.util.Scanner;

public class Ejercicio34 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa una frase: ");
        String frase = scanner.nextLine();
        int cantidadEspacios = contarEspacios(frase);
        System.out.println("La frase contiene " + cantidadEspacios + " espacio(s) en blanco.");
        scanner.close();
    }
    public static int contarEspacios(String cadena) {
        int contadorEspacios = 0;
        for (int i = 0; i < cadena.length(); i++) {
            if (Character.isWhitespace(cadena.charAt(i))) {
                contadorEspacios++;
            }
        }

        return contadorEspacios;
    }
}