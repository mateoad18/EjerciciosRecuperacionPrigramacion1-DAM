import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner t = new Scanner(System.in);
		int n = 1;
		int[] mesas = new int[10];
		for (int i = 0; i < mesas.length; i++) {
			mesas[i] = (int) (Math.random() * 5);
		}
		while (n > 0) {
			System.out.println("¿Cuántos son?(Introduzca un numero negativo para salir del programa):");
			n = t.nextInt();
			if (n > 4) {
				System.out.println("Lo siento, no admitimos grupos de " + n
						+ ", haga grupos de 4 personas como maximo e intentelo de nuevo");
			} else {
				int posMesa = 0;
				boolean encontrado = false;
				for (int i = 0; i < mesas.length; i++) {
					if (mesas[i] == 0) {
						mesas[i] = n;
						encontrado = true;
						posMesa = i + 1;
						break;
					}
				}
				if (encontrado == true) {
					mostrar(mesas);
					System.out.println("Por favor, sientese en la mesa numero: " + posMesa);
				} else {
					for (int i = 0; i < mesas.length; i++) {
						if (n + mesas[i] <= 4) {
							mesas[i] += n;
							break;
						}
					}
					mostrar(mesas);
				}
			}

		}
		System.out.println("Fin de programa.");
		t.close();

	}

	public static void mostrar(int mesas[]) {
		for (int i = 0; i < mesas.length; i++) {
			System.out.print(mesas[i]);
		}
	}

}
