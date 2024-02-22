import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ejercicio4 {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Por favor, proporciona la ruta de acceso al archivo HTML como parámetro de línea de comando.");
            return;
        }

        String filePath = args[0];

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            StringBuilder htmlContent = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                htmlContent.append(line);
            }

            String content = htmlContent.toString();

            Pattern pattern = Pattern.compile("(https?://\\S+)");
            Matcher matcher = pattern.matcher(content);

            System.out.println("URLs encontradas en el archivo:");
            while (matcher.find()) {
                System.out.println(matcher.group());
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
    }
}
