import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio6 {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String cadena = "";
		double total = 0;
		do {
			System.out.println("Introduzca cadenas con el siguiente formato: LetraNumeroCaracter");
			cadena = in.readLine();
			if (!cadena.equals("EOF")) {
				String[] cadenas = cadena.split(" ");
				for (int i = 0; i < cadenas.length; i++) {
					total += leerCad(cadenas[i]);
				}
			}
		} while (!cadena.equals("EOF") || !cadena.equals(""));// El programa mostrara el resultado si el usuario
																// introduce "EOF" por teclado o una cadena vacia
		System.out.println("El resultado es: " + total);

	}

	public static double leerCad(String cadena) {
		double resultado = 0;
		char primer = cadena.charAt(0);
		String medio = cadena.substring(1, cadena.length() - 1);
		int numMedio = Integer.parseInt(medio);
		char ultimo = cadena.charAt(cadena.length() - 1);
		int codPrimerLetra = (int) (primer);
		if (primer >= 'A' && primer <= 'Z') {
			resultado = numMedio * codPrimerLetra;
		} else {
			resultado = numMedio / codPrimerLetra;
		}
		if (Character.isLetter(ultimo)) {
			resultado = Math.sqrt(resultado);
		}
		if (Character.isDigit(ultimo)) {
			resultado = Math.log(resultado);
		} else {
			resultado = Math.exp(resultado);
		}
		return resultado;
	}
}
