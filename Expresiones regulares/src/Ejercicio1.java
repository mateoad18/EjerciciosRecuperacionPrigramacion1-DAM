 import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner t = new Scanner(System.in);
		System.out.println("Introduce una linea de nombres separado por espacios en blanco");
		String cadena = t.nextLine();
		String[] trozos = cadena.split(" ");
		for (int i = 0; i < trozos.length; i++) {
			String nombre = trozos[i];
			if (validarPalabra(nombre)) {
				System.out.println(nombre);
			}
		}
		t.close();
	}

	public static boolean validarPalabra(String palabra) {
		String regex = "^[A-Z][a-z]{1,}$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(palabra);
		return matcher.matches();
	}

}