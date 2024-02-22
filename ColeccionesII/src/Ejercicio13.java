import java.util.Deque;
import java.util.LinkedList;

public class Ejercicio13 {
	public static void main(String[] args) {
		Deque<Integer> pila1 = new LinkedList<>();
		pila1.push(5);
		pila1.push(11);
		pila1.push(-3);
		pila1.push(14);
		pila1.push(9);
		pila1.push(4);
		pila1.push(21);
		pila1.push(-42);
		pila1.push(13);
		pila1.push(2);

		colapsar(pila1);

		System.out.println("Contenido final:");
		while (!pila1.isEmpty()) {
			System.out.print(pila1.pop() + " ");
		}
	}

	public static void colapsar(Deque<Integer> pila) {
		Deque<Integer> colaAuxiliar = new LinkedList<>();
		while (!pila.isEmpty()) {
			if (pila.size() >= 2) {
				int primero = pila.pop();
				int segundo = pila.pop();
				colaAuxiliar.offerFirst(primero + segundo);
			} else {
				colaAuxiliar.offerFirst(pila.pop());
			}
		}

		while (!colaAuxiliar.isEmpty()) {
			pila.push(colaAuxiliar.poll());
		}
	}
}
