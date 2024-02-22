import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio2 {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String cad1;
		String cad2;
		int cont = 0;
		System.out.println("Escribe una cadena :");
		cad1 = in.readLine();
		System.out.println("Escribe otra cadena :");
		cad2 = in.readLine();
		String[] trozos1 = cad1.split(" ");
		for (int i = 0; i < trozos1.length; i++) {
			String cadBuscar = trozos1[i];
			for (int j = 0; j < cad2.length() - cadBuscar.length(); j++) {
				String aux = cad2.substring(j, j + cadBuscar.length());
				if (aux.equals(cadBuscar)) {
					cont++;
				}
			}
		}
		System.out.println("Las palabras se incluyen " + cont + " veces");
	}
}
