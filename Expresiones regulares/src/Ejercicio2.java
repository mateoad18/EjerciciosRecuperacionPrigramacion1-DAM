import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner t = new Scanner(System.in);
		System.out.println("Introduce una fecha separado por / o -");
		String fecha = t.nextLine();
		if (validarFecha(fecha)) {
			System.out.println(fecha + " es valida");
		} else {
			System.out.println("Fecha invalida");
		}
		t.close();
	}

	public static boolean validarFecha(String date) {
		String regex = "^(\\d{2}[/\\-])([a-zA-Z]{3}|\\d{2})[/\\-]\\d{4}$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(date);
		return matcher.matches();
	}

}