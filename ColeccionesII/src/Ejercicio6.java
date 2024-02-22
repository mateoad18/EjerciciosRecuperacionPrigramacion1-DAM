import java.util.*;

public class Ejercicio6 {
    public static void main(String[] args) {
        List<Integer> lista = Arrays.asList(1, 2, 3, 4, 5, 5, 6, 6, 6, 7, 8, 9, 9, 9, 9);
        System.out.println("Moda: " + moda(lista));
    }

    public static int moda(List<Integer> numeros) {
        if (numeros.isEmpty()) {
            return 0;
        }
        Map<Integer, Integer> conteo = new HashMap<>();
        for (int num : numeros) {
            conteo.put(num, conteo.getOrDefault(num, 0) + 1);
        }
        int moda = 0;
        int maxFrecuencia = 0;
        for (Map.Entry<Integer, Integer> entry : conteo.entrySet()) {
            int frecuencia = entry.getValue();
            if (frecuencia > maxFrecuencia) {
                maxFrecuencia = frecuencia;
                moda = entry.getKey();
            }
        }

        return moda;
    }
}
