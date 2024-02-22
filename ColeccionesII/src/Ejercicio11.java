import java.util.*;

public class Ejercicio11 {
	public static void main(String[] args) {
		List<Integer> lista1 = Arrays.asList(1, 2, 3, 4, 5, 5, 6, 6, 7, 8, 9, 9, 9, 9);
		List<Integer> lista2 = Arrays.asList(5, 6, 7, 7, 8, 9, 10, 11, 12);

		int comunes = contarComunes(lista1, lista2);
		System.out.println("Cantidad de números comunes: " + comunes);
	}

	public static int contarComunes(List<Integer> lista1, List<Integer> lista2) {
		Set<Integer> set1 = new HashSet<>(lista1);
		Set<Integer> set2 = new HashSet<>(lista2);
		Set<Integer> numerosComunes = new HashSet<>();

		for (int num : set1) {
			if (set2.contains(num)) {
				numerosComunes.add(num);
			}
		}

		return numerosComunes.size();
	}
}
