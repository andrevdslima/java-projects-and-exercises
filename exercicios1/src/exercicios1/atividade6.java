package exercicios1;

import java.util.Locale;
import java.util.Scanner;

public class atividade6 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner (System.in);
		
		double A, B, C, areatriangulo, areacirculo, pi = 3.14159, areatrapezio, areaquadrado, arearetangulo;
		
		System.out.print("Informe três valores com ponto flutuante de dupla precisão: ");
		
		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();
		
		areatriangulo = A*C/2.0;
		areacirculo = pi * Math.pow(C, 2.0);
		areatrapezio = (A + B) / 2.0 * C;
		areaquadrado = Math.pow(B, 2.0);
		arearetangulo = A * B;
		
		System.out.printf("Triângulo: %.3f%n", areatriangulo);
		System.out.printf("Circulo: %.3f%n", areacirculo);
		System.out.printf("Trapézio: %.3f%n", areatrapezio);
		System.out.printf("Quadrado: %.3f%n", areaquadrado);
		System.out.printf("Retângulo: %.3f%n", arearetangulo);
		
		sc.close();

	}

}
