package Ejercicio3;

public class Televisor extends Electrodomestico {
	private int pulgadas;
	private Sintonizador tipo;

	public Televisor(float precio, int peso) {
		super(precio, peso);
		// TODO Auto-generated constructor stub
	}

	public Televisor() {
		super();
		this.pulgadas = 20;
		this.tipo = Sintonizador.DVBT;
	}

	public Televisor(float precio, int peso, Color color, char consumo, float precFinal) {
		super(precio, peso, color, consumo, precFinal);
		this.pulgadas = 20;
		this.tipo = Sintonizador.DVBT;
	}

	public Televisor(float precio, int peso, Color color, char consumo, float precFinal, int pulgadas,
			Sintonizador tipo) {
		super(precio, peso, color, consumo, precFinal);
		this.pulgadas = pulgadas;
		this.tipo = tipo;

	}

	public int getPulgadas() {
		return pulgadas;
	}

	public void setPulgadas(int pulgadas) {
		this.pulgadas = pulgadas;
	}

	public Sintonizador getTipo() {
		return tipo;
	}

	public void setTipo(Sintonizador tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "Televisor [precio=" + getPrecio() + ", peso=" + getPeso() + ", color=" + getColor() + ", consumo="
				+ getConsumo() + ", precFinal=" + getPrecFinal() + " pulgadas=" + pulgadas + " Sintonizador=" + tipo
				+ "]";
	}

}
