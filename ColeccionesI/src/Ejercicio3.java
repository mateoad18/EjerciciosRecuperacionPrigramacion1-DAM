import java.util.*;

public class Ejercicio3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Ingrese una línea de texto:");
		String linea = scanner.nextLine();

		String[] palabras = linea.split("\\s+");

		Set<String> palabrasUnicas = new HashSet<>();
		List<String> palabrasRepetidas = new ArrayList<>();

		for (String palabra : palabras) {
			if (!palabrasUnicas.add(palabra)) {
				palabrasRepetidas.add(palabra);
			}
		}

		System.out.println("Palabras únicas: " + palabrasUnicas);
		System.out.println("Palabras repetidas: " + palabrasRepetidas);
	}
}
