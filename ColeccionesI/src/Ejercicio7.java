import java.util.*;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        Set<Integer> conjunto1 = new HashSet<>();
        Set<Integer> conjunto2 = new HashSet<>();
        for (int i = 0; i < n; i++) {
            int elemento = scanner.nextInt();
            conjunto1.add(elemento);
        }
        for (int i = 0; i < m; i++) {
            int elemento = scanner.nextInt();
            conjunto2.add(elemento);
        }
        Set<Integer> interseccion = new HashSet<>(conjunto1);
        interseccion.retainAll(conjunto2);

        for (int num : interseccion) {
            System.out.print(num + " ");
        }
    }
}
