import java.util.*;

public class Ejercicio4 {
	private Map<Integer, TreeSet<String>> palabrasPorLongitud;

	public Ejercicio4() {
		palabrasPorLongitud = new HashMap<>();
	}

	public Ejercicio4(String texto) {
		this();
		agregarPalabras(texto);
	}

	public void agregarPalabra(String palabra) {
		if (!palabrasPorLongitud.containsKey(palabra.length())) {
			palabrasPorLongitud.put(palabra.length(), new TreeSet<>());
		}
		palabrasPorLongitud.get(palabra.length()).add(palabra);
	}

	public void agregarPalabras(String texto) {
		String[] palabras = texto.split("\\s+");
		for (String palabra : palabras) {
			agregarPalabra(palabra);
		}
	}

	public boolean contienePalabra(String palabra) {
		int longitud = palabra.length();
		TreeSet<String> palabras = palabrasPorLongitud.get(longitud);
		return palabras != null && palabras.contains(palabra);
	}

	public List<String> obtenerPalabrasDeLongitud(int longitud) {
		TreeSet<String> palabras = palabrasPorLongitud.get(longitud);
		return palabras != null ? new ArrayList<>(palabras) : new ArrayList<>();
	}

	public void borrarPalabras() {
		palabrasPorLongitud.clear();
	}

	public void borrarYAgregarPalabras(String texto) {
		borrarPalabras();
		agregarPalabras(texto);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Ejercicio4 palabras = new Ejercicio4();

		while (true) {
			System.out.println("\nIndique el comando (añadir, lista n, borrar, borrar:, fin):");
			String comando = scanner.next();

			if (comando.equals("añadir:")) {
				scanner.nextLine(); 
				String texto = scanner.nextLine();
				palabras.agregarPalabras(texto);
			} else if (comando.equals("lista")) {
				int longitud = scanner.nextInt();
				List<String> palabrasLista = palabras.obtenerPalabrasDeLongitud(longitud);
				System.out.println("Lista de palabras de longitud " + longitud + ": " + palabrasLista);
			} else if (comando.equals("borrar")) {
				palabras.borrarPalabras();
			} else if (comando.equals("borrar:")) {
				scanner.nextLine(); 
				String texto = scanner.nextLine();
				palabras.borrarYAgregarPalabras(texto);
			} else if (comando.equals("fin")) {
				palabras.borrarPalabras();
				break;
			} else {
				System.out.println("Comando no reconocido.");
			}
		}

		System.out.println("Programa finalizado.");
	}
}
