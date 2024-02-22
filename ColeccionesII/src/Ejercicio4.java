import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Ejercicio4 {
    public static void main(String[] args) {
        List<String> lista = Arrays.asList("a", "b", "c", "a", "d", "e", "a", "f", "g", "a");
        boolean resultado = algunaSeRepiteAlMenos3Veces(lista);
        System.out.println("¿Algún elemento se repite al menos 3 veces? " + resultado);
    }

    public static boolean algunaSeRepiteAlMenos3Veces(List<String> lista) {
        Map<String, Integer> conteo = new HashMap<>();
        for (String elemento : lista) {
            conteo.put(elemento, conteo.getOrDefault(elemento, 0) + 1);
        }
        for (int cantidad : conteo.values()) {
            if (cantidad >= 3) {
                return true;
            }
        }
        return false;
    }
}
