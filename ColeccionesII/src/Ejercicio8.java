import java.util.HashMap;
import java.util.Map;

public class Ejercicio8 {
    public static void main(String[] args) {
        Map<String, Integer> mapa1 = new HashMap<>();
        mapa1.put("Fernando", 53);
        mapa1.put("Manuela", 29);
        mapa1.put("Ana", 41);
        mapa1.put("Luis", 65);
        mapa1.put("Mario", 33);
        mapa1.put("Adrián", 21);
        mapa1.put("Carmen", 39);
        mapa1.put("Elena", 19);

        Map<String, Integer> mapa2 = new HashMap<>();
        mapa2.put("Valentina", 37);
        mapa2.put("Ana", 41);
        mapa2.put("Mario", 33);
        mapa2.put("Benito", 67);
        mapa2.put("Carmen", 39);
        mapa2.put("Ramón", 44);
        mapa2.put("Elena", 19);
        mapa2.put("Hugo", 32);

        Map<String, Integer> interseccionMapa = interseccion(mapa1, mapa2);

        System.out.println("Intersección de los dos mapas:");
        System.out.println(interseccionMapa);
    }

    public static Map<String, Integer> interseccion(Map<String, Integer> mapa1, Map<String, Integer> mapa2) {
        Map<String, Integer> interseccionMapa = new HashMap<>();

        for (Map.Entry<String, Integer> entry : mapa1.entrySet()) {
            String clave = entry.getKey();
            Integer valor = entry.getValue();
            if (mapa2.containsKey(clave) && mapa2.get(clave).equals(valor)) {
                interseccionMapa.put(clave, valor);
            }
        }

        return interseccionMapa;
    }
}
