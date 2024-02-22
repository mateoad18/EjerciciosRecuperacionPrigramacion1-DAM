import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ejercicio6 {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Por favor, proporciona la ruta de acceso al archivo de texto como parámetro de línea de comando.");
            return;
        }

        String filePath = args[0];

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            StringBuilder content = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line).append("\n");
            }

            String transformedContent = transformText(content.toString());
            System.out.println(transformedContent);

            // Escribir el contenido transformado en un nuevo archivo
            String outputPath = filePath.replace(".txt", "_transformed.txt");
            try (PrintWriter writer = new PrintWriter(new FileWriter(outputPath))) {
                writer.println(transformedContent);
                System.out.println("El contenido transformado se ha guardado en el archivo: " + outputPath);
            } catch (IOException e) {
                System.out.println("Error al escribir en el archivo: " + e.getMessage());
            }

        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
    }

    private static String transformText(String input) {
        Pattern pattern = Pattern.compile("<uppercase>(.*?)</uppercase>", Pattern.CASE_INSENSITIVE | Pattern.DOTALL);
        Matcher matcher = pattern.matcher(input);
        StringBuffer output = new StringBuffer();

        while (matcher.find()) {
            matcher.appendReplacement(output, matcher.group(1).toUpperCase());
        }
        matcher.appendTail(output);

        return output.toString();
    }
}
