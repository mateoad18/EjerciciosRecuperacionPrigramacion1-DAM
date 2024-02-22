import java.util.Random;

public class Ejercicio10 {
    public static void main(String[] args) {
        Random random = new Random();

       
        int filas = random.nextInt(19) + 2;
        int columnas = random.nextInt(19) + 2; 

       
        int[][] matriz = new int[filas][columnas];
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz[i][j] = random.nextInt(101);
            }
        }

        System.out.println("Matriz:");
        mostrarMatriz(matriz);

        int[] sumaFilas = sumarFilas(matriz);
        System.out.println("Suma de los valores de cada fila:");
        mostrarVector(sumaFilas);

        int[] sumaColumnas = sumarColumnas(matriz);
        System.out.println("Suma de los valores de cada columna:");
        mostrarVector(sumaColumnas);
    }

    public static void mostrarMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void mostrarVector(int[] vector) {
        for (int num : vector) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static int[] sumarFilas(int[][] matriz) {
        int[] sumaFilas = new int[matriz.length];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                sumaFilas[i] += matriz[i][j];
            }
        }

        return sumaFilas;
    }
    public static int[] sumarColumnas(int[][] matriz) {
        int[] sumaColumnas = new int[matriz[0].length];

        for (int j = 0; j < matriz[0].length; j++) {
            for (int i = 0; i < matriz.length; i++) {
                sumaColumnas[j] += matriz[i][j];
            }
        }

        return sumaColumnas;
    }
}
