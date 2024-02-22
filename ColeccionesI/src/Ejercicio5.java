import java.util.*;

public class Ejercicio5 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] firstLine = scanner.nextLine().split(" ");
		int N = Integer.parseInt(firstLine[0]);
		int K = Integer.parseInt(firstLine[1]);
		int X = Integer.parseInt(firstLine[2]);
		Queue<Integer> cola = new LinkedList<>();
		String[] secondLine = scanner.nextLine().split(" ");
		for (String num : secondLine) {
			cola.offer(Integer.parseInt(num));
		}

		for (int i = 0; i < K; i++) {
			cola.poll();
		}

		if (cola.contains(X)) {
			System.out.println("true");
		} else {
			if (cola.isEmpty()) {
				System.out.println("0");
			} else {
				int min = Integer.MAX_VALUE;
				for (int num : cola) {
					if (num < min) {
						min = num;
					}
				}
				System.out.println(min);
			}
		}
	}
}
