package Ejercicio4;

public class EmpresaServicios implements Pagos {
	private String nombre;
	private String tipo;
	private int numCuenta;

	public EmpresaServicios(String nombre, String tipo, int numCuenta) {
		this.nombre = nombre;
		this.tipo = tipo;
		this.numCuenta = numCuenta;
	}

	public int getNumCuenta() {
		return numCuenta;
	}

	public void setNumCuenta(int numCuenta) {
		this.numCuenta = numCuenta;
	}

	public String getNombre() {
		return nombre;
	}

	public String getTipo() {
		return tipo;
	}

	@Override
	public void recibirPago(float importe, String concepto) {
		System.out.println("La empresa " + nombre + ", recibe el ingreso de " + importe + " en la cuenta nº "
				+ numCuenta + " con el siguiente concepto: " + concepto);
	}

}
