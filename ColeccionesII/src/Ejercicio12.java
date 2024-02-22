import java.util.Stack;

public class Ejercicio12 {
	public static void main(String[] args) {
		Stack<Integer> pila = new Stack<>();
		pila.push(5);
		pila.push(9);
		pila.push(2);
		pila.push(6);
		pila.push(7);

		duplicar(pila);

		System.out.println("Pila después de duplicar valores:");
		System.out.println(pila);
	}

	public static void duplicar(Stack<Integer> pila) {
		Stack<Integer> auxiliar = new Stack<>();

		while (!pila.isEmpty()) {
			int valor = pila.pop();
			auxiliar.push(valor);
			auxiliar.push(valor);
		}

		while (!auxiliar.isEmpty()) {
			pila.push(auxiliar.pop());
		}
	}
}
