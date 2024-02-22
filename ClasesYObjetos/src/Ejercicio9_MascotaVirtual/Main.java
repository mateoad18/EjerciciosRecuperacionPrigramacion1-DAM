package Ejercicio9_MascotaVirtual;

import java.util.Scanner;
import java.util.HashMap;

public class Main {
    private static HashMap<String, MascotaVirtual> mascotas = new HashMap<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean salir = false;

        while (!salir) {
            System.out.println("Escriba un comando (crear <nombre>, comer <nombre>, entrenar <nombre>, dormir <nombre>, curar <nombre>, salir):");
            String entrada = scanner.nextLine();
            String[] partes = entrada.split(" ");
            
            if (partes.length < 2) {
                System.out.println("Comando inválido. Por favor, vuelva a intentarlo.");
                continue;
            }
            
            String comando = partes[0];
            String nombreMascota = partes[1];

            switch (comando) {
                case "crear":
                    crearMascota(nombreMascota);
                    break;
                case "comer":
                    alimentarMascota(nombreMascota);
                    break;
                case "entrenar":
                    hacerEjercicioMascota(nombreMascota);
                    break;
                case "dormir":
                    dormirMascota(nombreMascota);
                    break;
                case "curar":
                    curarMascota(nombreMascota);
                    break;
                case "salir":
                    salir = salirPrograma();
                    break;
                default:
                    System.out.println("Comando inválido. Por favor, vuelva a intentarlo.");
            }
        }
    }

    private static void crearMascota(String nombre) {
        if (mascotas.containsKey(nombre)) {
            System.out.println("Ya existe una mascota con ese nombre.");
        } else {
            mascotas.put(nombre, new MascotaVirtual(nombre));
            System.out.println("Mascota " + nombre + " creada con éxito.");
        }
    }

    private static void alimentarMascota(String nombre) {
        MascotaVirtual mascota = mascotas.get(nombre);
        if (mascota != null) {
            mascota.comer();
        } else {
            System.out.println("No existe una mascota con ese nombre.");
        }
    }

    private static void hacerEjercicioMascota(String nombre) {
        MascotaVirtual mascota = mascotas.get(nombre);
        if (mascota != null) {
            mascota.hacerEjercicio();
        } else {
            System.out.println("No existe una mascota con ese nombre.");
        }
    }

    private static void dormirMascota(String nombre) {
        MascotaVirtual mascota = mascotas.get(nombre);
        if (mascota != null) {
            mascota.dormir();
        } else {
            System.out.println("No existe una mascota con ese nombre.");
        }
    }

    private static void curarMascota(String nombre) {
        MascotaVirtual mascota = mascotas.get(nombre);
        if (mascota != null) {
            if (mascota.esEnferma()) {
                mascota.curar();
            } else {
                System.out.println("La mascota no está enferma.");
            }
        } else {
            System.out.println("No existe una mascota con ese nombre.");
        }
    }

    private static boolean salirPrograma() {
        if (!mascotas.isEmpty()) {
            System.out.println("Hay mascotas vivas. ¿Está seguro de que desea salir? (s/n)");
            String confirmacion = scanner.nextLine().toLowerCase();
            if (confirmacion.equals("s")) {
                return true;
            }
        } else {
            return true;
        }
        return false;
    }
}
