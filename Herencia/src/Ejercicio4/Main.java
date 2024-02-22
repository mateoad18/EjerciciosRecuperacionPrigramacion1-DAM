package Ejercicio4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String concepto;
		float importe;
		EmpresaServicios e1 = new EmpresaServicios("Transportes Cuartas", "Logistica", 99112200);
		Asalariados a1 = new Asalariados("Manolo", "Gafotas", "11/7/2003", 7459850);
		Contratistas c1 = new Contratistas("Iker", "Jimenez", "11/09/2002", 6556480);
		System.out.println("Introduzca el concepto");
		concepto = in.nextLine();
		System.out.println("Introduzca el importe");
		importe = in.nextFloat();
		e1.recibirPago(importe, concepto);
		c1.recibirPago(importe, concepto);
		a1.recibirPago(importe, concepto);
	}

}
