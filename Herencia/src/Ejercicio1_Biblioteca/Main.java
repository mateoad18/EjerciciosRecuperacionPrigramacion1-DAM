package Ejercicio1_Biblioteca;

public class Main {

	public static void main(String[] args) {
		Biblioteca b = new Biblioteca();
		Libro l = new Libro(1, "titulo", 2000, "Tolkien");
		Revista r = new Revista(2, "titulin", 1999, 33, 5, 12);
		b.añadir(r);
		b.añadir(l);
		System.out.println(b.mostrar());
	}

}
