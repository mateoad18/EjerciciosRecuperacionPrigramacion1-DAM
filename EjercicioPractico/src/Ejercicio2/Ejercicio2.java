package Ejercicio2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import Ejercicio1.Ejer1;

public class Ejercicio2 {

	public static void main(String[] args) {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String resultado = "";
		String cadena = "";
		while (true) {
			try {
				System.out.println("Introduzca un texto");
				cadena = in.readLine();
				resultado = Ejer1.retornar(cadena);
				System.out.println(resultado);
			} catch (Exception e) {
				break;
			}
		}
	}


}
