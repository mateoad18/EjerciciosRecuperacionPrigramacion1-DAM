package Ejercicio5_Naipe;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner t = new Scanner(System.in);
		Mazo mazo = new Mazo();
		mazo.shuffle();
		Naipe cartaJugador = mazo.remove();
		Naipe cartaOponente = mazo.remove();
		System.out.println("Tu carta es: " + cartaJugador);
		System.out.println("Adivina si la carta del oponente es más alta (s/n):");
		String respuesta = t.nextLine();
		System.out.println("La carta del oponente es: " + cartaOponente);
		int valorCartaJugador = obtenerValorCarta(cartaJugador);
		int valorCartaOponente = obtenerValorCarta(cartaOponente);
		if (valorCartaJugador > valorCartaOponente && respuesta.equalsIgnoreCase("s")) {
			System.out.println("¡Felicidades! Has acertado.");
		} else if (valorCartaJugador < valorCartaOponente && respuesta.equalsIgnoreCase("n")) {
			System.out.println("¡Felicidades! Has acertado.");
		} else {
			System.out.println("Lo siento, has fallado.");
		}
	}

	public static int obtenerValorCarta(Naipe carta) {
		String rango = carta.getRango();
		switch (rango) {
		case "2":
			return 2;
		case "3":
			return 3;
		case "4":
			return 4;
		case "5":
			return 5;
		case "6":
			return 6;
		case "7":
			return 7;
		case "8":
			return 8;
		case "9":
			return 9;
		case "10":
			return 10;
		case "Jack":
			return 11;
		case "Queen":
			return 12;
		case "King":
			return 13;
		case "As":
			return 14;
		default:
			return 0;
		}
	}
}
