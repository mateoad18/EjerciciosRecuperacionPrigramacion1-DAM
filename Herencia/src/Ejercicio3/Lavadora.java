package Ejercicio3;

public class Lavadora extends Electrodomestico {
	private int[] cargas = { 4, 5, 6, 7, 8, 10, 11, 13 };
	private int carga;

	public Lavadora() {
		super();
		this.carga = 5;
	}

	public Lavadora(float precio, int peso) {
		super(precio, peso);
	}

	public Lavadora(float precio, int peso, Color color, char consumo, float precFinal) {
		super(precio, peso, color, consumo, precFinal);
		this.carga = 5;
	}

	public Lavadora(float precio, int peso, Color color, char consumo, float precFinal, int carga) {
		super(precio, peso, color, consumo, precFinal);
		this.carga = carga;
	}

	public int getCarga() {
		return carga;
	}

	public void setCarga(int carga) {
		this.carga = 5;
		for (int i = 0; i < cargas.length; i++) {
			if (cargas[i] == carga) {
				this.carga = carga;
			}
		}
	}

	@Override
	public String toString() {
		return "Lavadora [precio=" + getPrecio() + ", peso=" + getPeso() + ", color=" + getColor() + ", consumo="
				+ getConsumo() + ", precFinal=" + calcularPrecio() + " carga=" + carga + "]";
//		String cadena = super.toString();
//		cadena += "carga= " + carga + "," + calcularPrecio() + "\n";
//		return cadena;
	}

	@Override
	public float calcularPrecio() {
		float precLav = super.calcularPrecio();
		if (carga > 8) {
			precLav = (precLav * 0.1f) + precLav;
		}
		return precLav;
	}
}
