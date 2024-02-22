package Ejercicio2_Hucha;

import java.util.HashMap;
import java.util.Map;

public class Hucha {
	private boolean abierta;
	private String contraseña;
	private double saldo;
	private Map<String, Integer> monedasBilletes;

	// Constructor
	public Hucha(String contraseñaInicial) {
		abierta = false;
		contraseña = contraseñaInicial;
		saldo = 0.0;
		monedasBilletes = new HashMap<>();
		inicializarMonedasBilletes();
	}

	private void inicializarMonedasBilletes() {
		monedasBilletes.put("1 Euro", 0);
		monedasBilletes.put("2 Euros", 0);
		monedasBilletes.put("5 Euros", 0);
		monedasBilletes.put("10 Euros", 0);
		monedasBilletes.put("20 Euros", 0);
		monedasBilletes.put("50 Euros", 0);
	}

	public void abrir(String contraseñaIntroducida) {
		if (contraseñaIntroducida.equals(contraseña)) {
			abierta = true;
			System.out.println("Hucha abierta.");
		} else {
			System.out.println("Contraseña incorrecta. Hucha sigue cerrada.");
		}
	}

	public void cerrar() {
		abierta = false;
		System.out.println("Hucha cerrada.");
	}

	public void depositar(double cantidad, String tipo) {
		if (abierta) {
			saldo += cantidad;
			int cantidadActual = monedasBilletes.get(tipo);
			monedasBilletes.put(tipo, cantidadActual + 1);
			System.out.println("Se han depositado " + cantidad + " euros en la hucha.");
		} else {
			System.out.println("La hucha está cerrada. No se puede depositar dinero.");
		}
	}

	public void retirar(String tipo, int cantidad) {
		if (abierta) {
			int cantidadActual = monedasBilletes.get(tipo);
			if (cantidadActual >= cantidad) {
				saldo -= cantidad * Double.parseDouble(tipo.split(" ")[0]);
				monedasBilletes.put(tipo, cantidadActual - cantidad);
				System.out.println("Se han retirado " + cantidad + " " + tipo + " de la hucha.");
			} else {
				System.out.println("No hay suficientes " + tipo + " en la hucha.");
			}
		} else {
			System.out.println("La hucha está cerrada. No se puede retirar dinero.");
		}
	}

	public Map<String, Integer> obtenerCantidadMonedasBilletes() {
		return monedasBilletes;
	}

	public double verSaldo() {
		return saldo;
	}
}
