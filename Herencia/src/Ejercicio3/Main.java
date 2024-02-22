package Ejercicio3;

public class Main {

	public static void main(String[] args) {
		Almacen a1 = new Almacen();
		Electrodomestico e1 = new Electrodomestico();
		Lavadora l1 = new Lavadora(200, 40, Color.BLANCO, 'A', 0, 9);
		Televisor t1 = new Televisor(800, 20, Color.NEGRO, 'D', 0, 65, Sintonizador.DVBT2);
		Frigorifico f1 = new Frigorifico(1000, 50, Color.GRIS, 'B', 0, true);
		a1.añadir(e1);
		a1.añadir(l1);
		a1.añadir(t1);
		a1.añadir(f1);
		a1.mostrar();
	}

}
