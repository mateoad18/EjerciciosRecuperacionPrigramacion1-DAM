import java.util.Scanner;

class Alumno {
	String nombre;
	double[] notas = new double[3];

	public Alumno(String nombre) {
		this.nombre = nombre;
	}

	public void setNota(int evaluacion, double nota) {
		if (evaluacion >= 1 && evaluacion <= 3) {
			notas[evaluacion - 1] = nota;
		} else {
			System.out.println("Número de evaluación no válido.");
		}
	}

	public double calcularNotaMedia() {
		double suma = 0;
		for (double nota : notas) {
			suma += nota;
		}
		return suma / notas.length;
	}

	public double getNota(int evaluacion) {
		if (evaluacion >= 1 && evaluacion <= 3) {
			return notas[evaluacion - 1];
		} else {
			System.out.println("Número de evaluación no válido.");
			return -1;
		}
	}
}

class Evaluacion {
	double[] notasEvaluacion = new double[3];

	public Evaluacion() {

	}

	public double calcularNotaFinal() {
		double suma = 0;
		for (double nota : notasEvaluacion) {
			suma += nota;
		}
		return suma / notasEvaluacion.length;
	}
}

public class Ejercicio12 {
	static Scanner scanner = new Scanner(System.in);
	static Alumno[] alumnos;
	static Evaluacion[] evaluaciones;

	public static void main(String[] args) {
		inicializarDatos();
		int opcion;
		do {
			mostrarMenu();
			opcion = scanner.nextInt();
			switch (opcion) {
			case 1:
				mostrarNotaMediaTodosAlumnos();
				break;
			case 2:
				mostrarNotaMediaAlumno();
				break;
			case 3:
				visualizarNotasYNotaFinal();
				break;
			case 4:
				visualizarNotasYNotaFinalAlumno();
				break;
			case 5:
				calcularNotaMediaCurso();
				break;
			case 6:
				calcularNotaMaximaMinima();
				break;
			case 7:
				System.out.println("Saliendo del programa...");
				break;
			default:
				System.out.println("Opción no válida. Introduce un número del 1 al 7.");
			}
		} while (opcion != 7);
	}

	static void inicializarDatos() {
		System.out.println("Introduce el número de alumnos:");
		int numAlumnos = scanner.nextInt();
		scanner.nextLine();
		alumnos = new Alumno[numAlumnos];
		evaluaciones = new Evaluacion[3];
		for (int i = 0; i < 3; i++) {
			evaluaciones[i] = new Evaluacion();
		}
		for (int i = 0; i < numAlumnos; i++) {
			System.out.println("Introduce el nombre del alumno " + (i + 1) + ":");
			String nombre = scanner.nextLine();
			alumnos[i] = new Alumno(nombre);
			System.out.println("Introduce las notas de las tres evaluaciones del alumno " + nombre + ":");
			for (int j = 0; j < 3; j++) {
				System.out.println("Nota de la evaluación " + (j + 1) + ":");
				double nota = scanner.nextDouble();
				alumnos[i].setNota(j + 1, nota);
			}
			scanner.nextLine();
		}
	}

	static void mostrarMenu() {
		System.out.println("Menú:");
		System.out.println("1. Mostrar la nota media de todos los alumnos.");
		System.out.println("2. Mostrar la nota media de un alumno determinado.");
		System.out.println("3. Visualizar las notas por evaluación y la nota final de cada evaluación.");
		System.out.println("4. Visualizar las notas por evaluación y la nota final de un alumno determinado.");
		System.out.println("5. Calcular la nota media del curso.");
		System.out.println("6. Calcular la nota más alta y la más baja e indicar a qué alumno y evaluación pertenece.");
		System.out.println("7. Salir.");
		System.out.println("Elige una opción:");
	}

	static void mostrarNotaMediaTodosAlumnos() {
		for (Alumno alumno : alumnos) {
			System.out.println("Nota media de " + alumno.nombre + ": " + alumno.calcularNotaMedia());
		}
	}

	static void mostrarNotaMediaAlumno() {
		System.out.println("Introduce el nombre del alumno:");
		String nombre = scanner.next();
		for (Alumno alumno : alumnos) {
			if (alumno.nombre.equals(nombre)) {
				System.out.println("Nota media de " + nombre + ": " + alumno.calcularNotaMedia());
				return;
			}
		}
		System.out.println("No se encontró ningún alumno con ese nombre.");
	}

	static void visualizarNotasYNotaFinal() {
		for (int i = 0; i < 3; i++) {
			System.out.println("Evaluación " + (i + 1) + ":");
			for (Alumno alumno : alumnos) {
				System.out.println(alumno.nombre + ": " + alumno.getNota(i + 1));
			}
			System.out.println("Nota final de la evaluación: " + evaluaciones[i].calcularNotaFinal());
		}
	}

	static void visualizarNotasYNotaFinalAlumno() {
		System.out.println("Introduce el nombre del alumno:");
		String nombre = scanner.next();
		for (Alumno alumno : alumnos) {
			if (alumno.nombre.equals(nombre)) {
				for (int i = 0; i < 3; i++) {
					System.out.println("Evaluación " + (i + 1) + ": " + alumno.getNota(i + 1));
				}
				System.out.println("Nota final del alumno " + nombre + ": " + alumno.calcularNotaMedia());
				return;
			}
		}
		System.out.println("No se encontró ningún alumno con ese nombre.");
	}

	static void calcularNotaMediaCurso() {
		double suma = 0;
		for (Alumno alumno : alumnos) {
			suma += alumno.calcularNotaMedia();
		}
		double media = suma / alumnos.length;
		System.out.println("Nota media del curso: " + media);
	}

	static void calcularNotaMaximaMinima() {
		double maxima = Double.MIN_VALUE;
		double minima = Double.MAX_VALUE;
		String alumnoMaxima = "";
		String alumnoMinima = "";
		int evaluacionMaxima = 0;
		int evaluacionMinima = 0;

		for (int i = 0; i < alumnos.length; i++) {
			for (int j = 0; j < 3; j++) {
				if (alumnos[i].getNota(j + 1) > maxima) {
					maxima = alumnos[i].getNota(j + 1);
					alumnoMaxima = alumnos[i].nombre;
					evaluacionMaxima = j + 1;
				}
				if (alumnos[i].getNota(j + 1) < minima) {
					minima = alumnos[i].getNota(j + 1);
					alumnoMinima = alumnos[i].nombre;
					evaluacionMinima = j + 1;
				}
			}
		}

		System.out.println("La nota más alta es " + maxima + " y pertenece al alumno " + alumnoMaxima
				+ " en la evaluación " + evaluacionMaxima);
		System.out.println("La nota más baja es " + minima + " y pertenece al alumno " + alumnoMinima
				+ " en la evaluación " + evaluacionMinima);
	}
}
