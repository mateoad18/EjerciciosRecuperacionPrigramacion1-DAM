package Ejercicio9_MascotaVirtual;

import java.util.Random;

public class MascotaVirtual {
	private String nombre;
	private int nivelEnergia;
	private boolean enferma;
	private boolean viva;

	public MascotaVirtual(String nombre) {
		this.nombre = nombre;
		this.nivelEnergia = 20; // nivel de energía inicial
		this.enferma = false;
		this.viva = true;
	}

	public void comer() {
		if (viva) {
			if (!enferma) {
				nivelEnergia += 5;
				verificarEstado();
			} else {
				agravarEnfermedad();
			}
			comunicarEstadoDeAnimo();
			verificarFallecimiento();
		} else {
			System.out.println("¡La mascota " + nombre + " está muerta! No puede realizar acciones.");
		}
	}

	public void dormir() {
		if (viva) {
			if (!enferma) {
				nivelEnergia += 2;
				verificarEstado();
			} else {
				agravarEnfermedad();
			}
			comunicarEstadoDeAnimo();
			verificarFallecimiento();
		} else {
			System.out.println("¡La mascota " + nombre + " está muerta! No puede realizar acciones.");
		}
	}

	public void hacerEjercicio() {
		if (viva) {
			if (!enferma) {
				nivelEnergia -= 3;
				verificarEstado();
			} else {
				agravarEnfermedad();
			}
			comunicarEstadoDeAnimo();
			verificarFallecimiento();
		} else {
			System.out.println("¡La mascota " + nombre + " está muerta! No puede realizar acciones.");
		}
	}

	private void verificarEstado() {
		Random random = new Random();
		int probabilidadEnfermedad = random.nextInt(10); // probabilidad de 0 a 9
		if (!enferma && (nivelEnergia > 50 || nivelEnergia < 5 || probabilidadEnfermedad < 3)) {
			enfermar();
		}
	}

	private void enfermar() {
		enferma = true;
		nivelEnergia = 10; // nivel de energía al enfermar
		System.out.println(nombre + " se ha enfermado!");
		comunicarEstadoDeAnimo();
	}

	private void agravarEnfermedad() {
		nivelEnergia -= 1;
		if (nivelEnergia <= 0) {
			viva = false;
			System.out.println("¡La mascota " + nombre + " ha fallecido virtualmente!");
		}
	}

	public void curar() {
		if (viva) {
			enferma = false;
			nivelEnergia = 20; // nivel de energía al curar
			System.out.println(nombre + " ha sido curado y su nivel de energía ha sido restablecido.");
			comunicarEstadoDeAnimo();
		} else {
			System.out.println("¡La mascota " + nombre + " está muerta! No puede ser curada.");
		}
	}

	public void mostrarEstado() {
		System.out.println("Estado de " + nombre + ":");
		System.out.println("Nivel de energía: " + nivelEnergia);
		if (enferma) {
			System.out.println("Estado: Enferma");
		} else {
			System.out.println("Estado: Sana");
		}
		if (!viva) {
			System.out.println("La mascota está muerta.");
		}
	}

	private void comunicarEstadoDeAnimo() {
		if (viva) {
			if (enferma) {
				System.out.println(nombre + " se siente mal.");
			} else if (nivelEnergia > 3) {
				System.out.println(nombre + " se siente alegre.");
			} else {
				System.out.println(nombre + " se siente apático.");
			}
		} else {
			System.out.println("¡La mascota " + nombre + " está muerta! No puede comunicar su estado de ánimo.");
		}
	}

	private void verificarFallecimiento() {
		if (nivelEnergia <= 0 || nivelEnergia > 55) {
			viva = false;
			System.out.println("¡La mascota " + nombre + " ha fallecido virtualmente!");
		}
	}

	public boolean esEnferma() {
		return enferma;
	}

}
