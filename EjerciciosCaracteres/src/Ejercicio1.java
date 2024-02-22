import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio1 {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String cad1;
		String cad2;
		int cont = 0;
		System.out.println("Escribe una cadena :");
		cad1 = in.readLine();
		System.out.println("Escribe otra cadena incluida en la cadena anterior :");
		cad2 = in.readLine();
		for (int i = 0; i < cad1.length() - cad2.length(); i++) {
			String aux = cad1.substring(i, i + cad2.length());
			if (aux.equals(cad2)) {
				cont++;
			}
		}
		System.out.println("La cadena se repite " + cont + " veces");
	}

}
