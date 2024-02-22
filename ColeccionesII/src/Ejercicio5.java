import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;

public class Ejercicio5 {
    public static void main(String[] args) {
        Stack<Integer> pila = new Stack<>();
        pila.push(23);
        pila.push(-5);
        pila.push(37);
        pila.push(29);
        pila.push(-19);
        pila.push(-55);
        pila.push(89);

        System.out.println("Pila original: " + pila);

        negativosAbajoPositivosArriba(pila);

        System.out.println("Pila reorganizada: " + pila);
    }

    public static void negativosAbajoPositivosArriba(Stack<Integer> pila) {
        Queue<Integer> cola = new LinkedList<>();

        while (!pila.isEmpty()) {
            cola.offer(pila.pop());
        }

        while (!cola.isEmpty()) {
            int elemento = cola.poll();
            if (elemento < 0) {
                pila.push(elemento);
            }
        }
        while (!cola.isEmpty()) {
            int elemento = cola.poll();
            if (elemento >= 0) {
                pila.push(elemento);
            }
        }
    }
}
