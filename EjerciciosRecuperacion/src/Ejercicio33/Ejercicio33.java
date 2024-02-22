package Ejercicio33;

import java.util.Scanner;

public class Ejercicio33 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa una frase: ");
        String frase = scanner.nextLine();
        if (esPalindromo(frase)) {
            System.out.println("La frase es un palíndromo.");
        } else {
            System.out.println("La frase no es un palíndromo.");
        }
        scanner.close();
    }
    public static boolean esPalindromo(String cadena) {
        String cadenaProcesada = cadena.replaceAll("\\s+", "").toLowerCase();
        return cadenaProcesada.equals(new StringBuilder(cadenaProcesada).reverse().toString());
    }
}
