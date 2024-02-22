package Ejercicio1_Animal;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		Animal animal1 = new Animal("Perro", LocalDate.of(2020, 5, 15));
        System.out.println("Animal 1: " + animal1);

        Animal animal2 = new Animal("Gato");
        System.out.println("Animal 2: " + animal2);
        animal2.setNombre("Pájaro");
        animal2.setFecha(LocalDate.now());
        System.out.println("Animal 2 después de cambiar nombre y fecha: " + animal2);
	}

}
