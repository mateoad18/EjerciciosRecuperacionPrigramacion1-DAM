import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio3 {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String cadena = "";
		while (!cadena.equalsIgnoreCase("fin")) {
			System.out.println("Introduzca una cadena");
			cadena = in.readLine();
			if (!cadena.equalsIgnoreCase("fin")) {
				String c = buscarCaracter(cadena);
				System.out.println(c);
			}

		}
		System.out.println("Fin de programa");
	}

	public static String buscarCaracter(String cadena) {
		boolean repe = false;
		for (int i = 0; i < cadena.length() - 1; i++) {
			repe = false;
			char car = cadena.charAt(i);
			for (int j = i + 1; j < cadena.length(); j++) {
				if (car == cadena.charAt(j)) {
					repe = true;
				}
			}
			if (repe == false) {
				return "El primer caracter que no se repite es: " + car;
			}
		}
		return "Los caracteres son iguales";
	}

	public static String buscarCaracter2(String cadena) {
		boolean repe = false;
		for (int i = 0; i < cadena.length(); i++) {
			repe = false;
			char car = cadena.charAt(i);
			if (cadena.indexOf(car,i+1)!=-1 ) {
				repe = true;
			}
			if (repe == false) {
				return "El primer caracter que no se repite es: " + car;
			}
		}
		return "Los caracteres son iguales";
	}

}
