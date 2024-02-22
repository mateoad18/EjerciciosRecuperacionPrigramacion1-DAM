import java.util.Random;
import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        Random random = new Random();

        int[] array = new int[20];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(401); 
        }

        System.out.println("Array inicial:");
        mostrarArray(array);

        System.out.println("¿Qué múltiplos quieres resaltar? (5 o 7)");
        int multiplo = t.nextInt();

        System.out.println("Array con múltiplos de " + multiplo + " resaltados :");
        mostrarArrayResaltado(array, multiplo);
    }

    public static void mostrarArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void mostrarArrayResaltado(int[] array, int multiplo) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] % multiplo == 0) {
                System.out.print("[" + array[i] + "] ");
            } else {
                System.out.print(array[i] + " ");
            }
        }
        System.out.println();
    }
}
