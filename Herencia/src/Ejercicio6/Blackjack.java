package Ejercicio6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Carta {
	private final String palo;
	private final String valor;

	public Carta(String palo, String valor) {
		this.palo = palo;
		this.valor = valor;
	}

	public String getPalo() {
		return palo;
	}

	public String getValor() {
		return valor;
	}

	public int getValorNumerico() {
		try {
			return Integer.parseInt(valor);
		} catch (NumberFormatException e) {
			if (valor.equals("J") || valor.equals("Q") || valor.equals("K")) {
				return 10;
			} else {
				return 11; 
			}
		}
	}

	@Override
	public String toString() {
		return valor + " de " + palo;
	}
}

// Clase que representa una mano de cartas
class Mano {
	private final List<Carta> cartas;

	public Mano() {
		cartas = new ArrayList<>();
	}

	public void añadirCarta(Carta carta) {
		cartas.add(carta);
	}

	public int getPuntuacion() {
		int puntuacion = 0;
		int ases = 0;
		for (Carta carta : cartas) {
			int valor = carta.getValorNumerico();
			puntuacion += valor;
			if (valor == 11) { 
				ases++;
			}
		}
		while (puntuacion > 21 && ases > 0) {
			puntuacion -= 10; //
			ases--;
		}
		return puntuacion;
	}

	public void mostrar() {
		for (Carta carta : cartas) {
			System.out.println(carta);
		}
		System.out.println("Puntuación total: " + getPuntuacion());
	}

	public char[] mostrarPrimeraCarta() {
		// TODO Auto-generated method stub
		return null;
	}
}



public class Blackjack {
 private final Mazo mazo;
 private final Mano crupier;
 private final Mano jugador;
 private boolean manoFinalizada;

 public Blackjack() {
     mazo = new Mazo();
     crupier = new Mano();
     jugador = new Mano();
     manoFinalizada = false;
     mazo.iniciar();
     mazo.barajar();
 }

 public void repartir() {
     if (!manoFinalizada) {
         jugador.añadirCarta(mazo.sacarCarta());
         crupier.añadirCarta(mazo.sacarCarta());
         jugador.añadirCarta(mazo.sacarCarta());
         crupier.añadirCarta(mazo.sacarCarta());

         System.out.println("Cartas del crupier:");
         System.out.println(crupier.mostrarPrimeraCarta());
         System.out.println("\nTus cartas:");
         jugador.mostrar();
     } else {
         System.out.println("Error: la mano ya está finalizada.");
     }
 }

 public void pedirCarta() {
     if (!manoFinalizada) {
         jugador.añadirCarta(mazo.sacarCarta());
         System.out.println("Tus cartas:");
         jugador.mostrar();
         if (jugador.getPuntuacion() > 21) {
             System.out.println("¡Te has pasado de 21! Has perdido.");
             manoFinalizada = true;
         }
     } else {
         System.out.println("Error: la mano ya está finalizada.");
     }
 }

 public void plantarse() {
     if (!manoFinalizada) {
         while (crupier.getPuntuacion() < 17) {
             crupier.añadirCarta(mazo.sacarCarta());
         }

         System.out.println("Cartas del crupier:");
         crupier.mostrar();

         int puntuacionJugador = jugador.getPuntuacion();
         int puntuacionCrupier = crupier.getPuntuacion();

         System.out.println("Tus cartas:");
         jugador.mostrar();

         if (puntuacionJugador > puntuacionCrupier || puntuacionCrupier > 21) {
             System.out.println("¡Felicidades! Has ganado.");
         } else if (puntuacionJugador < puntuacionCrupier) {
             System.out.println("Lo siento, has perdido.");
         } else {
             System.out.println("Es un empate.");
         }

         manoFinalizada = true;
     } else {
         System.out.println("Error: la mano ya está finalizada.");
     }
 }

 public boolean terminar() {
     return manoFinalizada;
 }
}

class Mazo {
	private final List<Carta> cartas;

	public Mazo() {
		cartas = new ArrayList<>();
	}

	public void iniciar() {
		String[] palos = { "Corazones", "Diamantes", "Tréboles", "Picas" };
		String[] valores = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A" };

		for (String palo : palos) {
			for (String valor : valores) {
				cartas.add(new Carta(palo, valor));
			}
		}
	}

	public void barajar() {
		Collections.shuffle(cartas);
	}

	public Carta sacarCarta() {
		if (cartas.isEmpty()) {
			throw new IllegalStateException("El mazo está vacío");
		}
		return cartas.remove(0);
	}
}
