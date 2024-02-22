package Ejercicio7_Automovil;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner t = new Scanner(System.in);

		int numAutomoviles = t.nextInt();
		t.nextLine();

		Automovil[] automoviles = new Automovil[numAutomoviles];

		for (int i = 0; i < numAutomoviles; i++) {
			String[] datosAutomovil = t.nextLine().split(" ");
			String modelo = datosAutomovil[0];
			double capacidadDeposito = Double.parseDouble(datosAutomovil[1]);
			double litrosDeposito = Double.parseDouble(datosAutomovil[2]);
			double consumo = Double.parseDouble(datosAutomovil[3]);

			boolean modeloRepetido = false;
			for (int j = 0; j < i; j++) {
				if (automoviles[j].getModelo().equals(modelo)) {
					modeloRepetido = true;
					break;
				}
			}

			if (!modeloRepetido) {
				automoviles[i] = new Automovil(modelo, capacidadDeposito, litrosDeposito, consumo);
			} else {
				System.out.println("Ya existe un automóvil con el modelo " + modelo + ". No se creará otro.");
			}
		}

		String linea;
		while (!(linea = t.nextLine()).equals("fin")) {
			String[] datosDesplazamiento = linea.split(" ");
			String modelo = datosDesplazamiento[1];
			double kilometros = Double.parseDouble(datosDesplazamiento[2]);

			Automovil automovil = null;
			for (Automovil auto : automoviles) {
				if (auto.getModelo().equals(modelo)) {
					automovil = auto;
					break;
				}
			}

			if (automovil != null) {
				double combustibleConsumido = automovil.desplazar(kilometros);
				if (combustibleConsumido >= 0) {
					System.out.println(
							"El automóvil " + automovil.getModelo() + " tiene " + automovil.getCantidadCombustible()
									+ " litros en el depósito después del desplazamiento de " + kilometros
									+ " km. Se consumieron " + combustibleConsumido + " litros de combustible.");
				} else {
					System.out.println("Combustible insuficiente para el desplazamiento del automóvil "
							+ automovil.getModelo() + " de " + kilometros + " km.");
				}
			} else {
				System.out.println("No se encontró ningún automóvil con el modelo " + modelo);
			}
		}
		for (Automovil automovil : automoviles) {
			if (automovil != null) {
				System.out.println("Modelo: " + automovil.getModelo());
				System.out.println("Combustible restante: " + automovil.getCantidadCombustible() + " litros");
				System.out
						.println("Total de kilómetros recorridos: " + automovil.getTotalKilometrosRecorridos() + " km");
				System.out.println("Total de litros de combustible consumidos: "
						+ automovil.getTotalCombustibleConsumido() + " litros");
				System.out.println();
			}
		}

		t.close();
	}
}
