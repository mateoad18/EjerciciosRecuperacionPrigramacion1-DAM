import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce los boletos separados por comas:");

        String input = scanner.nextLine();
        String[] tickets = input.split(",\\s*");

        for (String ticket : tickets) {
            if (esBoletoPremiado(ticket)) {
                System.out.println(ticket);
            } else {
                System.out.println(ticket + " - NO VÁLIDO");
            }
        }
    }

    public static boolean esBoletoPremiado(String ticket) {
        String primeraMitad = ticket.substring(0, 10);
        String segundaMitad = ticket.substring(10);

        Pattern pattern = Pattern.compile("\\$+|&+|@+|#+");
        Matcher matcherPrimera = pattern.matcher(primeraMitad);
        Matcher matcherSegunda = pattern.matcher(segundaMitad);

        if (matcherPrimera.find() && matcherSegunda.find() &&
            matcherPrimera.group().equals(matcherSegunda.group())) {
            int longitud = matcherPrimera.group().length();
            char caracter = matcherPrimera.group().charAt(0);
            System.out.print(ticket + " - " + caracter + longitud);
            if (longitud == 10) {
                System.out.print(" BOTE!");
            }
            System.out.println();
            return true;
        }

        return false;
    }
}
