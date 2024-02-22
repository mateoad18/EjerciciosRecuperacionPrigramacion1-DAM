import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        int tamanoVector = solicitarTamanoVector();
        int[] vector = new int[tamanoVector];
        long tiempoLlenado = llenarVector(vector);
        mostrarInformacionVector(vector, tiempoLlenado);
    }

    private static int solicitarTamanoVector() {
        int tamanoVector;
        do {
            System.out.print("Ingrese el tamaño del vector (entre 10 y 1,000,000): ");
            tamanoVector = obtenerEnteroDesdeConsola();
        } while (tamanoVector < 10 || tamanoVector > 1_000_000);

        return tamanoVector;
    }

    private static int obtenerEnteroDesdeConsola() {
        Scanner scanner = new Scanner(System.in);
        while (!scanner.hasNextInt()) {
            System.out.print("Ingrese un número entero válido: ");
            scanner.next();
        }
        return scanner.nextInt();
    }

    private static long llenarVector(int[] vector) {
        long inicio = System.currentTimeMillis();

        Random random = new Random();
        boolean[] numerosUsados = new boolean[2_000_000];
        for (int i = 0; i < vector.length; i++) {
            int numeroAleatorio;
            do {
                numeroAleatorio = random.nextInt(2_000_000) - 999_999;
            } while (numerosUsados[numeroAleatorio + 999_999]);
            vector[i] = numeroAleatorio;
            numerosUsados[numeroAleatorio + 999_999] = true;
        }

        long fin = System.currentTimeMillis();
        return fin - inicio;
    }

    private static void mostrarInformacionVector(int[] vector, long tiempoLlenado) {
        System.out.println("Tamaño del vector: " + vector.length);
        System.out.println("Tiempo empleado en llenar el vector: " + tiempoLlenado + " milisegundos");
        int menor = Arrays.stream(vector).min().orElse(0);
        int mayor = Arrays.stream(vector).max().orElse(0);
        int diferencia = mayor - menor;
        System.out.println("Diferencia entre el menor y el mayor: " + diferencia);
        long inicioDiferencia = System.currentTimeMillis();
        long finDiferencia = System.currentTimeMillis();
        long tiempoDiferencia = finDiferencia - inicioDiferencia;
        System.out.println("Tiempo empleado en calcular la diferencia: " + tiempoDiferencia + " milisegundos");
    }
}
