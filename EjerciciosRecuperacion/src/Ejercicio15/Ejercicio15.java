package Ejercicio15;

public class Ejercicio15 {

	public static void main(String[] args) {
		long resultado = 1;
		int cont = 0;
		int numero = 1;
		while (cont < 50 ) {
			if (numero % 2 != 0) {
				cont++;
				resultado = resultado * numero;
			}
			numero++;
		}
		System.out.println("El producto de los 50 primeros numeros impares es: " + resultado);
	}

}
