package Ejercicio3_Autor;

import java.util.Collection;
import java.util.List;

public class Libro {
	private String titulo;
	private Collection<Autor> autores;
	private float precio;
	private int stock;

	public Libro(String titulo, Collection<Autor> autores, float precio) {
		this.titulo = titulo;
		this.autores = autores;
		this.precio = precio;
		this.stock = 0;
	}

	public Libro(String titulo, Collection<Autor> autores, float precio, int stock) {
		this.titulo = titulo;
		this.autores = autores;
		this.precio = precio;
		this.stock = stock;
	}

	// Getters
	public String getTitulo() {
		return titulo;
	}

	public Collection<Autor> getAutores() {
		return autores;
	}

	public float getPrecio() {
		return precio;
	}

	public int getStock() {
		return stock;
	}

	// Setters
	public void setPrecio(float precio) {
		this.precio = precio;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	@Override
	public String toString() {
		StringBuilder autoresString = new StringBuilder();
		for (Autor autor : autores) {
			autoresString.append(autor.getNombre()).append(", ");
		}
		autoresString.delete(autoresString.length() - 2, autoresString.length()); // Eliminar la última coma y espacio

		return titulo + " (" + autoresString + ") " + precio + " € - " + stock + " unidades en stock";
	}

	public static void main(String[] args) {
		Autor autor1 = new Autor("Alberto Fernández", "afernandez@mail.com", "masculino");
		Autor autor2 = new Autor("María González", "mgonzalez@mail.com", "femenino");

		Collection<Autor> autores = List.of(autor1, autor2);

		Libro libro = new Libro("La Historia de Java", autores, 25.99f);

		System.out.println("Información del libro: " + libro.toString());

		libro.setPrecio(29.99f);

		libro.setStock(100);

		System.out.println("Información del libro actualizada: " + libro.toString());
	}
}
