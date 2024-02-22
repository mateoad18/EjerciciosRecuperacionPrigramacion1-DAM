package Ejercicio8_TorneoPokemon;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner t = new Scanner(System.in);
		HashMap<String, Entrenador> entrenadores = new HashMap<>();

		while (t.hasNextLine()) {
			String line = t.nextLine();
			if (line.equals("torneo")) {
				procesarTorneo(entrenadores, t);
				mostrarResultados(entrenadores);
				entrenadores.clear();
			} else {
				String[] datosPokemon = line.split(" ");
				String nombreEntrenador = datosPokemon[0];
				String nombrePokemon = datosPokemon[1];
				String elemento = datosPokemon[2];
				int salud = Integer.parseInt(datosPokemon[3]);

				Pokemon pokemon = new Pokemon(nombrePokemon, elemento, salud);
				Entrenador entrenador = entrenadores.getOrDefault(nombreEntrenador, new Entrenador(nombreEntrenador));
				entrenador.agregarPokemon(pokemon);
				entrenadores.put(nombreEntrenador, entrenador);
			}
		}
	}

	public static void procesarTorneo(HashMap<String, Entrenador> entrenadores, Scanner scanner) {
		HashSet<String> elementosTorneo = new HashSet<>();

		while (scanner.hasNextLine()) {
			String line = scanner.nextLine();
			if (line.equals("fin")) {
				break;
			} else {
				elementosTorneo.add(line);
			}
		}

		for (Entrenador entrenador : entrenadores.values()) {
			boolean tieneElemento = false;
			for (Pokemon pokemon : entrenador.getPokemons()) {
				if (elementosTorneo.contains(pokemon.getElemento())) {
					tieneElemento = true;
					break;
				}
			}
			if (tieneElemento) {
				entrenador.aumentarInsignias();
			} else {
				entrenador.reducirSaludPokemons();
			}
		}
	}

	public static void mostrarResultados(HashMap<String, Entrenador> entrenadores) {
		for (Entrenador entrenador : entrenadores.values()) {
			System.out.println(entrenador.getNombre() + " " + entrenador.getNumeroInsignias() + " "
					+ entrenador.getCantidadPokemons());
		}
	}

}
