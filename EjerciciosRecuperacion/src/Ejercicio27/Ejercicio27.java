package Ejercicio27;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio27 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenido al juego de adivinanza.");
        System.out.print("Introduce la longitud de la combinación secreta (n): ");
        int n = scanner.nextInt();

        int[] combinacionSecreta = generarCombinacionSecreta(n);
        boolean adivinado = false;
        int intentos = 0;

        System.out.println("Se ha generado una combinación secreta de longitud " + n + ". ¡Adivina!");

        while (!adivinado) {
            int[] intentoUsuario = pedirIntentoUsuario(n);
            intentos++;

            if (Arrays.equals(intentoUsuario, combinacionSecreta)) {
                adivinado = true;
                System.out.println("¡Felicidades! Has adivinado la combinación secreta en " + intentos + " intentos.");
            } else {
                mostrarResultado(intentoUsuario, combinacionSecreta);
            }
        }

        scanner.close();
    }

    private static int[] generarCombinacionSecreta(int longitud) {
        int[] combinacion = new int[longitud];
        Random random = new Random();

        for (int i = 0; i < longitud; i++) {
            combinacion[i] = random.nextInt(5) + 1; 
        }

        return combinacion;
    }

    private static int[] pedirIntentoUsuario(int longitud) {
        Scanner scanner = new Scanner(System.in);
        int[] intento = new int[longitud];

        System.out.print("Introduce tu combinación de " + longitud + " números (del 1 al 5): ");
        for (int i = 0; i < longitud; i++) {
            intento[i] = scanner.nextInt();
        }

        return intento;
    }

    private static void mostrarResultado(int[] intentoUsuario, int[] combinacionSecreta) {
        System.out.print("Resultado: ");
        for (int i = 0; i < intentoUsuario.length; i++) {
            if (intentoUsuario[i] < combinacionSecreta[i]) {
                System.out.print("Menor ");
            } else if (intentoUsuario[i] > combinacionSecreta[i]) {
                System.out.print("Mayor ");
            } else {
                System.out.print("Igual ");
            }
        }
        System.out.println();
    }
}
