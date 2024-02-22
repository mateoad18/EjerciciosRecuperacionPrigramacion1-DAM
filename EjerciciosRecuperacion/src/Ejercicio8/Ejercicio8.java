package Ejercicio8;

import java.util.Scanner;

public class Ejercicio8 {
	static float ry =  0.299f;
	static float gy =  0.587f;
	static float by =  0.114f;
	static float ri =  0.596f;
	static float gi =  0.275f;
	static float bi =  0.321f;
	static float rq =  0.212f;
	static float gq =  0.528f;
	static float bq =  0.311f;

	public static void main(String[] args) {
		float r = 0;
		float g = 0;
		float b = 0;
		Scanner t = new Scanner(System.in);
		System.out.println("Introduzca el valor de R:");
		r = t.nextFloat();
		System.out.println("Introduzca el valor de G:");
		g = t.nextFloat();
		System.out.println("Introduzca el valor de B:");
		b = t.nextFloat();
		YIQ(r, g, b);
		t.close();
	}

	public static void YIQ(float r, float g, float b) {
		float y = 0;
		float i = 0;
		float q = 0;
		y = (ry * r) + (gy * g) + (by * b);
		i = (ri * r) + (gi * g) + (bi * b);
		q = (rq * r) + (gq * g) + (bq * b);
		System.out.println("El valor de Y es: " + y);
		System.out.println("El valor de I es: " + i);
		System.out.println("El valor de Q es: " + q);

	}
}
