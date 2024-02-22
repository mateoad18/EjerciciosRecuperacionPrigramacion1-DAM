package Ejercicio6;

import java.util.Scanner;

public class Main {
    private final Scanner scanner;
    private final Blackjack juego;

    public Main() {
        scanner = new Scanner(System.in);
        juego = new Blackjack();
    }

    public void ejecutar() {
        System.out.println("Bienvenido al juego de Blackjack en consola!");

        while (true) {
            System.out.print("Blackjack> ");
            String comando = scanner.nextLine().trim().toLowerCase();

            switch (comando) {
                case "repartir":
                    juego.repartir();
                    break;
                case "pedir":
                    juego.pedirCarta();
                    break;
                case "plantarse":
                    juego.plantarse();
                    break;
                case "fin":
                    if (juego.terminar()) {
                        System.out.println("¿Seguro que quieres terminar el juego? (s/n)");
                        String confirmacion = scanner.nextLine().trim().toLowerCase();
                        if (confirmacion.equals("s")) {
                            System.out.println("Gracias por jugar. ¡Hasta luego!");
                            scanner.close();
                            return;
                        }
                    }
                    break;
                default:
                    System.out.println("Comando no válido. Inténtalo de nuevo.");
                    break;
            }
        }
    }

    public static void main(String[] args) {
        Main juego = new Main();
        juego.ejecutar();
    }
}
