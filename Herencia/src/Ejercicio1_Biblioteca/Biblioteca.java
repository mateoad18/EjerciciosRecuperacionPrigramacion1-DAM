package Ejercicio1_Biblioteca;

import java.util.ArrayList;

public class Biblioteca {
	ArrayList<Publicacion> lista;

	public Biblioteca() {
		lista = new ArrayList<Publicacion>();
	}

	public void añadir(Publicacion p) {
		lista.add(p);
	}

	public String mostrar() {
		String cadena = "";
		for (Publicacion p : lista) {
			cadena += p.toString();/*
									 * El polimorfismo es el tiempo de ejecucion y gracias a la heremcia y a la
									 * redefinicion de metodos, se ejecuta el metodo segun el objeto que haga la
									 * llamada. En este caso, si el objeto es de la clase Libro, se ejecuta el
									 * toStrig de la clase Libro
									 */
		}
		return cadena;
	}
}
