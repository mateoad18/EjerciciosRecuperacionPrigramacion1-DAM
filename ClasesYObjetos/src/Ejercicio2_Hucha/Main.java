package Ejercicio2_Hucha;

import java.util.Map;

public class Main {

	public static void main(String[] args) {
		Hucha miHucha = new Hucha("1234");

		miHucha.abrir("1234"); 
		miHucha.depositar(20.0, "1 Euro"); 
		miHucha.depositar(50.0, "20 Euros");
		miHucha.retirar("20 Euros", 2); 
		miHucha.retirar("1 Euro", 30); 
		System.out.println("Saldo actual: " + miHucha.verSaldo() + " euros.");
		System.out.println("Cantidad de monedas y billetes:");
		Map<String, Integer> cantidadMonedasBilletes = miHucha.obtenerCantidadMonedasBilletes();
		for (String tipo : cantidadMonedasBilletes.keySet()) {
			System.out.println(tipo + ": " + cantidadMonedasBilletes.get(tipo));
		}
		miHucha.cerrar(); 
		miHucha.retirar("20 Euros", 1); 
	}
}
