import java.util.*;
import java.util.regex.*;
import java.text.DecimalFormat;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pattern pattern = Pattern.compile("(.+)<<(.+),(\\d+):(\\d+)");
        Map<String, Integer> muebles = new HashMap<>();
        double total = 0.0;

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            if (line.equals("comprar")) {
                break;
            }
            Matcher matcher = pattern.matcher(line);
            if (matcher.matches()) {
                String nombre = matcher.group(1);
                double precio = Double.parseDouble(matcher.group(2).replace(',', '.'));
                int cantidad = Integer.parseInt(matcher.group(4));
                total += precio * cantidad;
                muebles.put(nombre, muebles.getOrDefault(nombre, 0) + cantidad);
            }
        }

        System.out.println("Compra:");
        for (Map.Entry<String, Integer> entry : muebles.entrySet()) {
            System.out.println(entry.getKey() + " (" + entry.getValue() + ")");
        }
        DecimalFormat df = new DecimalFormat("#.00");
        System.out.println("Importe total:\n" + df.format(total) + "€");
    }
}
