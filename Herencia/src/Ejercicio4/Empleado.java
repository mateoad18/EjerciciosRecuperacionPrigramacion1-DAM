package Ejercicio4;

public abstract class Empleado implements Pagos {
	private String nombre;
	private String apellidos;
	private String fechCont;
	private int numCuentBanco;

	public Empleado(String nombre, String apellidos, String fechCont, int numCuentBanco) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.fechCont = fechCont;
		this.numCuentBanco = numCuentBanco;
	}

	public int getNumCuentBanco() {
		return numCuentBanco;
	}

	public void setNumCuentBanco(int numCuentBanco) {
		this.numCuentBanco = numCuentBanco;
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public String getFechCont() {
		return fechCont;
	}

	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", apellidos=" + apellidos + ", fechCont=" + fechCont + ", numCuentBanco="
				+ numCuentBanco + "]";
	}

}
