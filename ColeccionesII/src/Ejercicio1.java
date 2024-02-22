import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		LinkedList<String> coleccion = new LinkedList<String>();
		Scanner t = new Scanner(System.in);
		for (int i = 0; i < 10; i++) {
			System.out.println("Introduzca una cadena: ");
			String cad = t.nextLine();
			coleccion.add(cad);
		}
		eliminarLasDeLongitudPar(coleccion);
		mostrar(coleccion);
		t.close();
	}

	public static void eliminarLasDeLongitudPar(LinkedList<String> coleccion) {
//		for (int i = 0; i < coleccion.size(); i++) {
//			if ((coleccion.get(i)).length() % 2 == 0) {
//				coleccion.remove(i);
//			}
//			System.out.println(coleccion.get(i));
//		}
		Iterator it = coleccion.iterator();
		while (it.hasNext()) {
			String cadena = (String) it.next();
			if (cadena.length() % 2 == 0) {
				it.remove();
			}
		}
	}

	public static void mostrar(LinkedList<String> coleccion) {
		for (String string : coleccion) {
			System.out.println(string);
		}
	}
}
