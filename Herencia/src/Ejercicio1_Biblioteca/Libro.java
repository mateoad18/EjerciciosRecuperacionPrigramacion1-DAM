package Ejercicio1_Biblioteca;

public class Libro extends Publicacion implements Prestable {

	private String nombreAutor;
	private boolean prestado;

	public Libro(int codigo, String titulo, int año, String nombreAutor) {
		super(codigo, titulo, año);
		this.nombreAutor = nombreAutor;
		this.prestado = false;

	}

	public String getNombreAutor() {
		return nombreAutor;
	}

	public void setNombreAutor(String nombreAutor) {
		this.nombreAutor = nombreAutor;
	}

	@Override
	public String toString() {
		String cadena = super.toString();
		cadena += nombreAutor + "," + prestado;
		return cadena;
	}

	@Override
	public void prestar() {
		if (prestado == false) {
			prestado = true;
			System.out.println("Se ha prestado el libro " + getTitulo());
		} else {
			System.out.println("El libro " + getTitulo() + " ya a sido prestado");
		}

	}

	@Override
	public void devolver() {
		if (prestado == true) {
			prestado = false;
			System.out.println("El libro " + getTitulo() + " se ha devuelto ");
		} else {
			System.out.println("El libro no se puede devolver porque no ha sido prestado");
		}

	}

}
