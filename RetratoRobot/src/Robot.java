import java.util.Scanner;

public class Robot {
	private String[] pelos = { "WWWWWWWWW", "\\\\//////", "|\"\"\"\"\"|", "|||||||||" };
	private String[] ojos = { "| O O |", "|-(· ·)-|", "|-(o o)-|", "| \\ / |" };
	private String[] nariz = { "@ J @", "{ \" }", "[ j ]", "< - >" };
	private String[] boca = { "| === |", "| - |", "| ___ |", "| --- |" };
	Scanner t = new Scanner(System.in);

	public static void main(String[] args) {
		Robot r = new Robot();
		r.run();
	}

	public int muestraPelos() {
		int opPelo = 0;
		for (int i = 0; i < pelos.length; i++) {
			System.out.println((i + 1) + "._" + pelos[i] + "\n");
		}
		System.out.println("Elegir pelo");
		opPelo = t.nextInt();
		return opPelo;
	}

	public int muestraOjos() {
		int opOjos = 0;
		for (int i = 0; i < ojos.length; i++) {
			System.out.println((i + 1) + "._" + ojos[i] + "\n");
		}
		System.out.println("Elegir ojos");
		opOjos = t.nextInt();
		return opOjos;
	}

	public int muestraNariz() {
		int opNariz = 0;
		for (int i = 0; i < nariz.length; i++) {
			System.out.println((i + 1) + "._" + nariz[i] + "\n");
		}
		System.out.println("Elegir nariz");
		opNariz = t.nextInt();
		return opNariz;
	}

	public int muestraBoca() {
		int opBoca = 0;
		for (int i = 0; i < boca.length; i++) {
			System.out.println((i + 1) + "._" + boca[i] + "\n");
		}
		System.out.println("Elegir boca");
		opBoca = t.nextInt();
		return opBoca;
	}

	public void run() {
		int opPelo = muestraPelos();
		switch (opPelo) {
		case 1:
			System.out.println(pelos[0]);
			break;
		case 2:
			System.out.println(pelos[1]);
			break;
		case 3:
			System.out.println(pelos[2]);
			break;
		case 4:
			System.out.println(pelos[3]);
			break;
		default:
			System.out.println("Opcion incorrecta");
			break;
		}
		int opOjos = muestraOjos();
		switch (opOjos) {
		case 1:
			System.out.println(ojos[0]);
			break;
		case 2:
			System.out.println(ojos[1]);
			break;
		case 3:
			System.out.println(ojos[2]);
			break;
		case 4:
			System.out.println(ojos[3]);
			break;
		default:
			System.out.println("Opcion incorrecta");
			break;

		}
		int opNariz = muestraNariz();
		switch (opNariz) {
		case 1:
			System.out.println(nariz[0]);
			break;
		case 2:
			System.out.println(nariz[1]);
			break;
		case 3:
			System.out.println(nariz[2]);
			break;
		case 4:
			System.out.println(nariz[3]);
			break;
		default:
			System.out.println("Opcion incorrecta");
			break;

		}
		int opBoca = muestraBoca();
		switch (opBoca) {
		case 1:
			System.out.println(boca[0]);
			break;
		case 2:
			System.out.println(boca[1]);
			break;
		case 3:
			System.out.println(boca[2]);
			break;
		case 4:
			System.out.println(boca[3]);
			break;
		default:
			System.out.println("Opcion incorrecta");
			break;

		}
		System.out.println(" \\_____/ ");
	}
}
