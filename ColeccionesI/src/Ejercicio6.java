import java.util.*;

public class Ejercicio6 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Map<String, List<String>> contactos = new TreeMap<>();

		System.out.println("Ingrese un comando (Ejemplo: > nombre:teléfono)");

		while (true) {
			String comando = scanner.nextLine().trim();

			if (comando.startsWith(">")) {
				comando = comando.substring(1).trim(); 
				String[] partes = comando.split(":", 2);

				if (partes.length == 2) {
					String nombre = partes[0].trim();
					String telefono = partes[1].trim();

					switch (nombre.toLowerCase()) {
					case "salir":
						System.out.println("Saliendo del programa...");
						return;
					case "contactos":
						mostrarContactos(contactos);
						break;
					case "buscar":
						buscarContacto(contactos, telefono);
						break;
					case "eliminar":
						eliminarContacto(contactos, telefono);
						break;
					default:
						agregarContacto(contactos, nombre, telefono);
						break;
					}
				} else {
					System.out.println("Formato de comando incorrecto.");
				}
			} else {
				System.out.println("Formato de comando incorrecto.");
			}
		}
	}

	public static void agregarContacto(Map<String, List<String>> contactos, String nombre, String telefono) {
		contactos.putIfAbsent(nombre, new ArrayList<>());
		List<String> telefonos = contactos.get(nombre);

		if (!telefonos.contains(telefono)) {
			telefonos.add(telefono);
			System.out.println("Contacto agregado correctamente.");
		} else {
			System.out.println("El teléfono ya existe para este contacto.");
		}
	}

	public static void buscarContacto(Map<String, List<String>> contactos, String nombre) {
		if (contactos.containsKey(nombre)) {
			List<String> telefonos = contactos.get(nombre);
			System.out.println("Teléfono(s): " + String.join(", ", telefonos));
		} else {
			System.out.println("El contacto no existe.");
		}
	}

	public static void eliminarContacto(Map<String, List<String>> contactos, String nombre) {
		if (contactos.containsKey(nombre)) {
			System.out.println("¿Está seguro de que desea eliminar el contacto " + nombre + "? (s/n)");
			Scanner scanner = new Scanner(System.in);
			String respuesta = scanner.nextLine().trim().toLowerCase();

			if (respuesta.equals("s")) {
				contactos.remove(nombre);
				System.out.println("Contacto eliminado correctamente.");
			} else {
				System.out.println("Operación cancelada.");
			}
		} else {
			System.out.println("El contacto no existe.");
		}
	}

	public static void mostrarContactos(Map<String, List<String>> contactos) {
		if (contactos.isEmpty()) {
			System.out.println("No hay contactos para mostrar.");
		} else {
			for (Map.Entry<String, List<String>> entry : contactos.entrySet()) {
				System.out.println(entry.getKey() + ": " + String.join(", ", entry.getValue()));
			}
		}
	}
}
