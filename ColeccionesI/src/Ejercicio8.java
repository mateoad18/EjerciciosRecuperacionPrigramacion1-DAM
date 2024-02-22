import java.util.*;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Set<String>> manosJugadores = new HashMap<>();

        while (true) {
            String entrada = scanner.nextLine().trim();
            if (entrada.equals("fin")) {
                break;
            }
            String[] partes = entrada.split(":");
            String nombreJugador = partes[0].trim();
            String[] naipes = partes[1].trim().split(" ");
            manosJugadores.putIfAbsent(nombreJugador, new HashSet<>());
            Collections.addAll(manosJugadores.get(nombreJugador), naipes);
        }

        Map<String, Integer> valoresJugadores = new HashMap<>();
        for (Map.Entry<String, Set<String>> entry : manosJugadores.entrySet()) {
            int valorMano = calcularValorMano(entry.getValue());
            valoresJugadores.put(entry.getKey(), valorMano);
        }

        for (Map.Entry<String, Integer> entry : valoresJugadores.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }

    public static int calcularValorMano(Set<String> mano) {
        Set<String> manoSinRepetidos = new HashSet<>(mano);
        int valorTotal = 0;

        for (String naipe : manoSinRepetidos) {
            char rango = naipe.charAt(0);
            char palo = naipe.charAt(1);
            int valorRango = obtenerValorRango(rango);
            int valorPalo = obtenerValorPalo(palo);
            valorTotal += valorRango * valorPalo;
        }

        return valorTotal;
    }

    public static int obtenerValorRango(char rango) {
        switch (rango) {
            case '2': return 2;
            case '3': return 3;
            case '4': return 4;
            case '5': return 5;
            case '6': return 6;
            case '7': return 7;
            case '8': return 8;
            case '9': return 9;
            case '1': return 10;
            case 'J': return 11;
            case 'Q': return 12;
            case 'K': return 13;
            case 'A': return 14;
            default: return 0;
        }
    }

    public static int obtenerValorPalo(char palo) {
        switch (palo) {
            case 'S': return 4;
            case 'H': return 3;
            case 'D': return 2;
            case 'C': return 1;
            default: return 0; 
        }
    }
}
