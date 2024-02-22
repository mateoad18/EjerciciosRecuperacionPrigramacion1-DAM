package Ejercicio31;

import java.util.Scanner;

public class Ejercicio31 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa una cadena de texto: ");
        String input = scanner.nextLine();
        buscarVocales(input);
        scanner.close();
    }
    public static void buscarVocales(String cadena) {
        cadena = cadena.toLowerCase();
        char[] vocales = {'a', 'e', 'i', 'o', 'u'};
        for (char vocal : vocales) {
            int posicion = cadena.indexOf(vocal);
            if (posicion != -1) {
                System.out.println("La vocal '" + vocal + "' se encuentra en la posición: " + (posicion + 1));
            } else {
                System.out.println("La vocal '" + vocal + "' no se encuentra en la cadena.");
            }
        }
    }
}