package Ejercicio7_Automovil;

public class Automovil {
	
	private String modelo;
	private double capacidadDeposito;
	private double cantidadCombustible;
	private double consumoPorKilometro;
	private double totalKilometrosRecorridos;
	private double totalCombustibleConsumido;

	public Automovil(String modelo, double capacidadDeposito, double cantidadCombustible, double consumoPorKilometro) {
		this.modelo = modelo;
		this.capacidadDeposito = capacidadDeposito;
		this.cantidadCombustible = cantidadCombustible;
		this.consumoPorKilometro = consumoPorKilometro;
	}

	public Automovil(String modelo, double capacidadDeposito, double consumoPorKilometro) {
		this.modelo = modelo;
		this.capacidadDeposito = capacidadDeposito;
		this.cantidadCombustible = capacidadDeposito;
		this.consumoPorKilometro = consumoPorKilometro;
	}

	public void recorrerKilometros(double kilometros) {
		double combustibleNecesario = kilometros * consumoPorKilometro;
		if (combustibleNecesario <= cantidadCombustible) {
			cantidadCombustible -= combustibleNecesario;
			totalKilometrosRecorridos += kilometros;
			totalCombustibleConsumido += combustibleNecesario;
			System.out.println("Se han recorrido " + kilometros + " kilómetros.");
		} else {
			System.out.println("No hay suficiente combustible para recorrer esa distancia.");
		}
	}

	public void llenarDeposito() {
		cantidadCombustible = capacidadDeposito;
	}

	public double llenarDeposito(double litros) {
		double combustibleSobrante = 0;
		if (cantidadCombustible + litros <= capacidadDeposito) {
			cantidadCombustible += litros;
		} else {
			combustibleSobrante = cantidadCombustible + litros - capacidadDeposito;
			cantidadCombustible = capacidadDeposito;
		}
		return combustibleSobrante;
	}

	public double desplazar(double kilometros) {
		double combustibleNecesario = kilometros * consumoPorKilometro;
		if (combustibleNecesario <= cantidadCombustible) {
			cantidadCombustible -= combustibleNecesario;
			totalKilometrosRecorridos += kilometros;
			totalCombustibleConsumido += combustibleNecesario;
			return combustibleNecesario;
		} else {
			return -1;
		}
	}

	// Getters y setters
	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public double getCapacidadDeposito() {
		return capacidadDeposito;
	}

	public void setCapacidadDeposito(double capacidadDeposito) {
		this.capacidadDeposito = capacidadDeposito;
	}

	public double getCantidadCombustible() {
		return cantidadCombustible;
	}

	public void setCantidadCombustible(double cantidadCombustible) {
		this.cantidadCombustible = cantidadCombustible;
	}

	public double getConsumoPorKilometro() {
		return consumoPorKilometro;
	}

	public void setConsumoPorKilometro(double consumoPorKilometro) {
		this.consumoPorKilometro = consumoPorKilometro;
	}

	public double getTotalKilometrosRecorridos() {
		return totalKilometrosRecorridos;
	}

	public void setTotalKilometrosRecorridos(double totalKilometrosRecorridos) {
		this.totalKilometrosRecorridos = totalKilometrosRecorridos;
	}

	public double getTotalCombustibleConsumido() {
		return totalCombustibleConsumido;
	}

	public void setTotalCombustibleConsumido(double totalCombustibleConsumido) {
		this.totalCombustibleConsumido = totalCombustibleConsumido;
	}
}
