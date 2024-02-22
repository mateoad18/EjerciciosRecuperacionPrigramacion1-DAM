import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ejercicio5 {
	public static void main(String[] args) {
		if (args.length != 1) {
			System.out.println(
					"Por favor, proporciona la ruta de acceso al archivo HTML como parámetro de línea de comando.");
			return;
		}

		String filePath = args[0];
		File file = new File(filePath);

		try {
			Scanner scanner = new Scanner(file);
			StringBuilder htmlContent = new StringBuilder();

			while (scanner.hasNextLine()) {
				htmlContent.append(scanner.nextLine());
			}

			String content = htmlContent.toString();
			Pattern pattern = Pattern.compile("<a\\s+[^>]*href\\s*=\\s*\"([^\"]*)\"[^>]*>", Pattern.CASE_INSENSITIVE);
			Matcher matcher = pattern.matcher(content);

			System.out.println("Hiperenlaces encontrados en el archivo:");
			while (matcher.find()) {
				System.out.println(matcher.group(1));
			}

			scanner.close();
		} catch (FileNotFoundException e) {
			System.out.println("Archivo no encontrado: " + e.getMessage());
		}
	}
}
