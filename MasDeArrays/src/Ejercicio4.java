import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);

        String[] palabras = new String[8];
        String[] colores = {"verde", "rojo", "azul", "amarillo", "naranja", "rosa", "negro", "blanco", "morado"};
        String[] palabrasNoColores = new String[8];
        int contadorColores = 0;
        int contadorNoColores = 0;

        System.out.println("Ingrese 8 palabras:");
        for (int i = 0; i < 8; i++) {
            palabras[i] = t.nextLine().toLowerCase(); 
        }

        for (int i = 0; i < 8; i++) {
            boolean esColor = false;
            for (int j = 0; j < colores.length; j++) {
                if (palabras[i].equals(colores[j])) {
                    esColor = true;
                    break;
                }
            }
            if (esColor) {
                palabras[contadorColores] = palabras[i];
                contadorColores++;
            } else {
                palabrasNoColores[contadorNoColores] = palabras[i];
                contadorNoColores++;
            }
        }

        System.out.println("Palabras con los colores al comienzo:");
        for (int i = 0; i < contadorColores; i++) {
            System.out.println(palabras[i]);
        }
        for (int i = 0; i < contadorNoColores; i++) {
            System.out.println(palabrasNoColores[i]);
        }
    }
}
