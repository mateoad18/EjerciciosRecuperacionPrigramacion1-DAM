import java.util.HashSet;
import java.util.LinkedList;
import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		HashSet<Integer> coleccion = new HashSet<Integer>();
		Scanner t = new Scanner(System.in);
		for (int i = 0; i < 10; i++) {
			System.out.println("Introduce un numero: ");
			int num = t.nextInt();
			coleccion.add(num);
		}
		System.out.println(contieneImpares(coleccion));
		mostrar(coleccion);
		t.close();

	}

	public static boolean contieneImpares(HashSet<Integer> coleccion) {
		for (Integer integer : coleccion) {
			if (integer % 2 != 0) {
				return true;
			}
		}
		return false;
	}

	public static void mostrar(HashSet<Integer> coleccion) {
		for (Integer string : coleccion) {
			System.out.println(string);
		}
	}
}
