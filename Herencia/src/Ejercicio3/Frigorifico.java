package Ejercicio3;

public class Frigorifico extends Electrodomestico {
	private boolean NoFrost;

	public Frigorifico() {
		super();
		this.NoFrost = false;
	}

	public Frigorifico(float precio, int peso) {
		super(precio, peso);
		// TODO Auto-generated constructor stub
	}

	public Frigorifico(float precio, int peso, Color color, char consumo, float precFinal) {
		super(precio, peso, color, consumo, precFinal);
		this.NoFrost = false;
	}

	public Frigorifico(float precio, int peso, Color color, char consumo, float precFinal, boolean NoFrost) {
		super(precio, peso, color, consumo, precFinal);
		this.NoFrost = NoFrost;
	}

	public boolean isNoFrost() {
		return NoFrost;
	}

	public void setNoFrost(boolean noFrost) {
		NoFrost = noFrost;
	}

	@Override
	public String toString() {
		return "Frigorifico [precio=" + getPrecio() + ", peso=" + getPeso() + ", color=" + getColor() + ", consumo="
				+ getConsumo() + ", precFinal=" + getPrecFinal() + " NoFrost=" + NoFrost + "]";
	}

}
