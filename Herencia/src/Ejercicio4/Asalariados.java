package Ejercicio4;

public class Asalariados extends Empleado {

	public Asalariados(String nombre, String apellidos, String fechCont, int numCuentBanco) {
		super(nombre, apellidos, fechCont, numCuentBanco);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void recibirPago(float importe, String concepto) {
		System.out.println("El asalariado " + getNombre() + getApellidos() + ", recibe el ingreso de " + importe
				+ " en la cuenta nº " + getNumCuentBanco() + " con el siguiente concepto: " + concepto);
	}

}
