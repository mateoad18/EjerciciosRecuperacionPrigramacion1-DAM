import java.util.*;

public class Ejercicio1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int cantidadNombres = scanner.nextInt();
		scanner.nextLine();

		Set<String> nombres = new LinkedHashSet<>();

		for (int i = 0; i < cantidadNombres; i++) {
			String nombre = scanner.nextLine();
			nombres.add(nombre);
		}

		for (String nombre : nombres) {
			System.out.println(nombre);
		}
	}
}
