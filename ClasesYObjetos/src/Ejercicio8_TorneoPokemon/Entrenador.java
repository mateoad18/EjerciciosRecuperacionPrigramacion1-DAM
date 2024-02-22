package Ejercicio8_TorneoPokemon;

import java.util.ArrayList;
import java.util.Iterator;

public class Entrenador {
	private String nombre;
    private int numeroInsignias;
    private ArrayList<Pokemon> pokemons;

    public Entrenador(String nombre) {
        this.nombre = nombre;
        this.numeroInsignias = 0;
        this.pokemons = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public int getNumeroInsignias() {
        return numeroInsignias;
    }

    public void aumentarInsignias() {
        numeroInsignias++;
    }

    public ArrayList<Pokemon> getPokemons() {
        return pokemons;
    }

    public void agregarPokemon(Pokemon pokemon) {
        pokemons.add(pokemon);
    }

    public int getCantidadPokemons() {
        return pokemons.size();
    }

    public void reducirSaludPokemons() {
        Iterator<Pokemon> iterator = pokemons.iterator();
        while (iterator.hasNext()) {
            Pokemon pokemon = iterator.next();
            pokemon.setPuntosSalud(pokemon.getPuntosSalud() - 10);
            if (pokemon.getPuntosSalud() <= 0) {
                iterator.remove();
            }
        }
    }
}
