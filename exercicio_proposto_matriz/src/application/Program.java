package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the number of rows and columns: ");
		int m = sc.nextInt();
		int n = sc.nextInt();

		int[][] mat = new int[m][n];

		System.out.println("\nEnter the numbers that will fill your matrix:");
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				mat[i][j] = sc.nextInt();
			}
		}

		System.out.print("\nEnter a number that belongs to the matrix: ");
		int x = sc.nextInt();

		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				if (mat[i][j] == x) {
					System.out.print("Position: " + i + ", " + j);
					if (j > 0) {
						System.out.print("\nLeft: " + mat[i][j - 1]);
					}
					if (i > 0) {
						System.out.print("\nUp: " + mat[i - 1][j]);
					}
					if (j < mat[i].length - 1) {
						System.out.print("\nRight: " + mat[i][j + 1]);
					}
					if (i < mat.length - 1) {
						System.out.print("\nDown: " + mat[i + 1][j]);
					}
					System.out.println();
					System.out.println();
				}
			}
		}

		sc.close();

	}

}
