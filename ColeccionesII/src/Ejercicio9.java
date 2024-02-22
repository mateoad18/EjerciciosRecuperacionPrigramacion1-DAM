import java.util.*;

public class Ejercicio9 {
    public static void main(String[] args) {
        Map<String, Integer> edades = new HashMap<>();
        edades.put("Juan", 33);
        edades.put("Hugo", 29);
        edades.put("Ana", 45);
        edades.put("Luis", 47);
        edades.put("Mario", 33);
        edades.put("Rosa", 29);
        edades.put("Carmen", 33);
        edades.put("Elena", 59);
        edades.put("Benito", 33);

        int edadMenosRepetida = valorMenosRepetido(edades);

        System.out.println("Edad menos repetida: " + edadMenosRepetida);
    }
    public static int valorMenosRepetido(Map<String, Integer> mapa) {
        Map<Integer, Integer> conteoEdades = new HashMap<>();
        for (int edad : mapa.values()) {
            conteoEdades.put(edad, conteoEdades.getOrDefault(edad, 0) + 1);
        }
        int menorRepeticion = Integer.MAX_VALUE;
        int edadMenosRepetida = Integer.MAX_VALUE;
        for (Map.Entry<Integer, Integer> entry : conteoEdades.entrySet()) {
            int edad = entry.getKey();
            int repeticiones = entry.getValue();
            if (repeticiones < menorRepeticion || (repeticiones == menorRepeticion && edad < edadMenosRepetida)) {
                menorRepeticion = repeticiones;
                edadMenosRepetida = edad;
            }
        }

        return edadMenosRepetida;
    }
}
