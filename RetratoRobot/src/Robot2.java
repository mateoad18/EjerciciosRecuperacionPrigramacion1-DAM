import java.util.Scanner;

public class Robot2 {

	public static void main(String[] args) {
		String[] pelos = { "WWWWWWWWW", "\\\\//////", "|\"\"\"\"\"|", "|||||||||" };
		String[] ojos = { "| O O |", "|-(· ·)-|", "|-(o o)-|", "| \\ / |" };
		String[] nariz = { "@ J @", "{ \" }", "[ j ]", "< - >" };
		String[] boca = { "| === |", "| - |", "| ___ |", "| --- |" };
		Scanner t = new Scanner(System.in);
		opciones();
		System.out.println("Elige una opcion para el pelo: ");
		int opPelo = t.nextInt() - 1;
		System.out.println("Elige una opcion para los ojos: ");
		int opOjos = t.nextInt() - 1;
		System.out.println("Elige una opcion para la nariz: ");
		int opNariz = t.nextInt() - 1;
		System.out.println("Elige una opcion para la boca: ");
		int opBoca = t.nextInt() - 1;
		if (opPelo >= 1 && opPelo <= pelos.length || opOjos >= 1 && opOjos <= ojos.length
				|| opNariz >= 1 && opNariz <= nariz.length || opBoca >= 1 && opBoca <= boca.length) {
			System.out.println(pelos[opPelo]);
			System.out.println(ojos[opOjos]);
			System.out.println(nariz[opNariz]);
			System.out.println(boca[opBoca]);
			System.out.println("\\_____/ ");

		} else {
			System.out.println("Opcion incorrecta");
		}
	}

	public static void opciones() {
		System.out.println("Opciones para el pelo:");
		System.out.println("1. “WWWWWWWWW”");
		System.out.println("2. “\\\\\\//////”");
		System.out.println("3. “|\"\"\"\"\"\"\"|”");
		System.out.println("4. “|||||||||”");
		System.out.println("Opciones para los ojos");
		System.out.println("1. “| O O |”");
		System.out.println("2. “|-(· ·)-|”");
		System.out.println("3. “|-(o o)-|”");
		System.out.println("4. “| \\ / |”");
		System.out.println("Opciones para orejas y nariz");
		System.out.println("1. “@ J @”");
		System.out.println("2. “{ \" }”");
		System.out.println("3. “[ j ]”");
		System.out.println("4. “< - >”");
		System.out.println("Opciones para la boca");
		System.out.println("1. “| === |”");
		System.out.println("2. “| - |”");
		System.out.println("3. “| ___ |”");
		System.out.println("4. “| --- |”");
		System.out.println("");
	}
}
