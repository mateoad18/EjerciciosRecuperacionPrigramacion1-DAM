import java.util.Stack;

public class Ejercicio7 {
    public static void main(String[] args) {
        Stack<Integer> pila = new Stack<>();
        pila.push(2);
        pila.push(7);
        pila.push(12);
        pila.push(5);
        pila.push(14);
        pila.push(9);
        pila.push(7);
        pila.push(10);
        pila.push(17);
        pila.push(17);
        pila.push(22);
        pila.push(6);

        eliminarSiMayoresEncima(pila);

        System.out.println("Pila después de eliminar elementos:");
        while (!pila.isEmpty()) {
            System.out.print(pila.pop() + " ");
        }
    }

    public static void eliminarSiMayoresEncima(Stack<Integer> pila) {
        Stack<Integer> auxiliar = new Stack<>();
        while (!pila.isEmpty()) {
            int actual = pila.pop();
            boolean eliminar = false;
            while (!pila.isEmpty() && pila.peek() > actual) {
                pila.pop();
                eliminar = true;
            }
            if (!eliminar) {
                auxiliar.push(actual);
            }
        }

        while (!auxiliar.isEmpty()) {
            pila.push(auxiliar.pop());
        }
    }
}
