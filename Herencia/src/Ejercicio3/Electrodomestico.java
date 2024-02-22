package Ejercicio3;

public class Electrodomestico {
	private float precio;
	private int peso;
	private Color color;
	private char consumo;
	private float precFinal;

	public Electrodomestico() {
		this.precio = 100;
		this.peso = 5;
		
	}

	public Electrodomestico(float precio, int peso) {
		this();
		this.precio = precio;
		this.peso = peso;
		this.precFinal = calcularPrecio();
	}

	public Electrodomestico(float precio, int peso, float precFinal) {
		this();
		this.precio = precio;
		this.peso = peso;
		this.color = Color.BLANCO;
		this.consumo = 'F';
		this.precFinal = calcularPrecio();
	}

	public Electrodomestico(float precio, int peso, Color color, char consumo, float precFinal) {
		this();
		this.precio = precio;
		this.peso = peso;
		this.color = color;
		this.consumo = consumo;
		this.precFinal = calcularPrecio();
	}

	public float calcularPrecio() {
		float incCon = 0;
		float incPes = 0;
		switch (consumo) {
		case 'A':
			incCon = (precio * 0.3f);
			break;
		case 'B':
			incCon = (precio * 0.25f);
			break;
		case 'C':
			incCon = (precio * 0.2f);
			break;
		case 'D':
			incCon = (precio * 0.15f);
			break;
		case 'E':
			incCon = (precio * 0.1f);
			break;
		case 'F':
			incCon = (precio * 0.05f);
			break;
		}
		if (peso > 0 || peso < 20) {
			incPes = (precio * 0.05f);
		}
		if (peso >= 20 || peso < 50) {
			incPes = (precio * 0.1f);
		}
		if (peso >= 50 || peso < 80) {
			incPes = (precio * 0.15f);
		}
		if (peso >= 80) {
			incPes = (precio * 0.2f);
		}
		precFinal = precio + incCon + incPes;
		return precFinal ;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public char getConsumo() {
		return consumo;
	}

	public void setConsumo(char consumo) {
		this.consumo = consumo;
	}

	public float getPrecFinal() {
		return precFinal;
	}

	public void setPrecFinal(int precFinal) {
		this.precFinal = precFinal;
	}

	@Override
	public String toString() {
		return "Electrodomestico [precio=" + precio + ", peso=" + peso + ", color=" + color + ", consumo=" + consumo
				+ ", precFinal=" +  calcularPrecio() + "]";
	}

}
