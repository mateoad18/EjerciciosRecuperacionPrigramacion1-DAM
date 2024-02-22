import java.util.*;

public class Ejercicio10 {
    public static void main(String[] args) {
        List<String> palabras = Arrays.asList("banana", "pera", "melón", "o", "sandía");

        Map<String, Integer> resultado = cuentaPares(palabras);

        System.out.println("Conteo de pares de caracteres:");
        for (Map.Entry<String, Integer> entry : resultado.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    public static Map<String, Integer> cuentaPares(List<String> palabras) {
        Map<String, Integer> conteoPares = new HashMap<>();

        for (String palabra : palabras) {
            for (int i = 0; i < palabra.length() - 1; i++) {
                String par = palabra.substring(i, i + 2);
                conteoPares.put(par, conteoPares.getOrDefault(par, 0) + 1);
            }
        }

        return conteoPares;
    }
}
