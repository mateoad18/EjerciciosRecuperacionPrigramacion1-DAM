import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio4 {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String nombre = "";
		while (!nombre.equalsIgnoreCase("fin")) {
			System.out.print("Nombre: ");
			nombre = in.readLine();
			if (!nombre.equalsIgnoreCase("fin")) {
				for (int i = 0; i < nombre.length(); i++) {
					String aux = nombre.substring(0, i + 1);
					System.out.println(aux);
				}
			}

		}
		System.out.println("fin de programa");
	}
}
