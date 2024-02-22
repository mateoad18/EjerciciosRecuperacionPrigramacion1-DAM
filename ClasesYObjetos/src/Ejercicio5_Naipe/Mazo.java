package Ejercicio5_Naipe;

import java.util.ArrayList;
import java.util.Random;

public class Mazo {

	private ArrayList<Naipe> naipes;

	public Mazo() {
		this.naipes = new ArrayList<>();
		crearBaraja();
	}

	public Mazo(int n) {
		this.naipes = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			crearBaraja();
		}
	}

	private void crearBaraja() {
		String[] palos = { "Tréboles", "Diamantes", "Corazones", "Picas" };
		String[] rangos = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "As", "Jack", "Queen", "King" };

		for (String palo : palos) {
			for (String rango : rangos) {
				Naipe naipe = new Naipe(palo, rango, 0);
				naipes.add(naipe);
			}
		}
	}

	public Naipe get() {
		Random random = new Random();
		int index = random.nextInt(naipes.size());
		return naipes.get(index);
	}

	public Naipe remove() {
		Random random = new Random();
		int index = random.nextInt(naipes.size());
		return naipes.remove(index);
	}

	public void add(Naipe naipe) {
		naipes.add(naipe);
	}

	public void addAll(Mazo otroMazo) {
		naipes.addAll(otroMazo.naipes);
		otroMazo.naipes.clear();
	}

	public int size() {
		return naipes.size();
	}

	public void shuffle() {
		Random random = new Random();
		for (int i = naipes.size() - 1; i > 0; i--) {
			int index = random.nextInt(i + 1);
			Naipe temp = naipes.get(index);
			naipes.set(index, naipes.get(i));
			naipes.set(i, temp);
		}
	}

	@Override
	public String toString() {
		StringBuilder result = new StringBuilder();
		for (Naipe naipe : naipes) {
			result.append(naipe.toString()).append("\n");
		}
		return result.toString();
	}

}
