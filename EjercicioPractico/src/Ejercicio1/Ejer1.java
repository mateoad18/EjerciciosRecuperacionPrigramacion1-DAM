package Ejercicio1;


import java.util.Scanner;

public class Ejer1{

	public static void main(String[] args)  {
		String texto;
		Scanner in = new Scanner(System.in);
		System.out.println("Escriba un texto");
		texto=in.next();
		System.out.println(retornar(texto));

	}

	public static String retornar(String cadena) {
		String aux ="*";
		String resultado = "";
		resultado += cadena.charAt(0);
		resultado += aux.repeat(cadena.length()-2);
		resultado += cadena.charAt(cadena.length()-1);
		return resultado;
	}
}
