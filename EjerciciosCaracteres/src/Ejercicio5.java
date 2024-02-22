import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio5 {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String nombre = "";
		System.out.println("Escribe un nombre: ");
		nombre = in.readLine();
		nombre = nombre.replaceAll("\\s", "");
		String primCar = nombre.substring(0, 1);
		String ultCar = nombre.substring(nombre.length() - 1, nombre.length());
		String aux = nombre.substring(1, nombre.length() - 1);
		String resultado = primCar + aux.replaceAll("[a-z]", "*") + ultCar;
		System.out.println(resultado);
//		System.out.println(primCar);
//		System.out.println(ultCar);
//		System.out.println(aux);
	}

}
