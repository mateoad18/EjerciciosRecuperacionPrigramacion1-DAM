import java.util.HashMap;
import java.util.Map;

public class Ejercicio3 {
	public static void main(String[] args) {
		Map<String, String> mapa = new HashMap<>();
		mapa.put("clave1", "valor1");
		mapa.put("clave2", "valor2");
		mapa.put("clave3", "valor3");
		mapa.put("clave4", "valor1");

		boolean resultado = valoresUnicos(mapa);
		System.out.println("¿Los valores son únicos? " + resultado);
	}

	public static boolean valoresUnicos(Map<String, String> mapa) {
		Map<String, String> valoresUnicos = new HashMap<>();

		for (Map.Entry<String, String> entry : mapa.entrySet()) {
			String clave = entry.getKey();
			String valor = entry.getValue();
			if (valoresUnicos.containsValue(valor)) {
				return false;
			} else {
				valoresUnicos.put(clave, valor);
			}
		}

		return true;
	}
}
