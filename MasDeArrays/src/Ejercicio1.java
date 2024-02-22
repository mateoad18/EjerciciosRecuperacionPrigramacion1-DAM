import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner t = new Scanner(System.in);
		int[] array = new int[10];
		for (int i = 0; i < array.length; i++) {
			System.out.println("Escriba el numero en la posicion " + i);
			array[i] = t.nextInt();
		}
		System.out.println("Array inicial:");
		Mostrar(array);

		System.out.println("Escribe la posicion inicial:");
		int inicial = t.nextInt();
		System.out.println("Escribe la posicion final:");
		int fin = t.nextInt();

		if (inicial < fin && inicial >= 0 && inicial <= 9 && fin >= 0 && fin <= 9) {
			int temp = array[inicial];
			for (int i = inicial; i < fin; i++) {
				array[i] = array[i + 1];
			}
			array[fin] = temp;

			System.out.println("Array final:");
			Mostrar(array);
		} else {
			System.out
					.println("Error: La posición inicial debe ser menor que la final y ambos deben estar entre 0 y 9.");
		}
	}

	public static void Mostrar(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.println("Posicion " + i + ": " + array[i]);
		}
	}
}
