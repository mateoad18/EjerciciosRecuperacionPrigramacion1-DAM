package Ejercicio3_Autor;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		Autor autor = new Autor("Alberto Fernández", "afernandez@mail.com", "masculino");
		System.out.println("Nombre del autor: " + autor.getNombre());
		System.out.println("Email del autor: " + autor.getEmail());
		System.out.println("Género del autor: " + autor.getGenero());
		autor.setEmail("albertofernandez@mail.com");
		System.out.println("Información del autor actualizada: " + autor.toString());
		Autor autor1 = new Autor("Alberto Fernández", "afernandez@mail.com", "masculino");
		Autor autor2 = new Autor("María González", "mgonzalez@mail.com", "femenino");

		Collection<Autor> autores = List.of(autor1, autor2);

		Libro libro1 = new Libro("La Historia de Java", autores, 25.99f);
		System.out.println("Libro 1:");
		mostrarInformacionLibro(libro1);

		Libro libro2 = new Libro("Introducción a la Programación en Java", autores, 19.99f, 50);
		System.out.println("\nLibro 2:");
		mostrarInformacionLibro(libro2);

		libro1.setPrecio(29.99f);
		libro1.setStock(100);
		System.out.println("\nLibro 1 actualizado:");
		mostrarInformacionLibro(libro1);
	}

	public static void mostrarInformacionLibro(Libro libro) {
		System.out.println("Título: " + libro.getTitulo());
		System.out.println("Autores: " + obtenerNombresAutores(libro.getAutores()));
		System.out.println("Precio: " + libro.getPrecio() + " €");
		System.out.println("Stock: " + libro.getStock() + " unidades en stock");
	}

	public static String obtenerNombresAutores(Collection<Autor> autores) {
		List<String> nombresAutores = new ArrayList<>();
		for (Autor autor : autores) {
			nombresAutores.add(autor.getNombre());
		}
		return String.join(", ", nombresAutores);
	}
}
