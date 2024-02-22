package Ejercicio5_Naipe;

public class Naipe {

	private String palo;
	private String rango;
	private int valorNumerico;

	public Naipe(String palo, String rango, int valorNumerico) {
		this.palo = palo;
		this.rango = rango;
		this.valorNumerico = valorNumerico;
	}

	public String getPalo() {
		return palo;
	}

	public String getRango() {
		return rango;
	}

	public int getValorNumerico() {
		return valorNumerico;
	}

	public void setValorNumerico(int valorNumerico) {
		this.valorNumerico = valorNumerico;
	}

	@Override
	public String toString() {
		return rango + " de " + palo;
	}

}