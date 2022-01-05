package hello_world;

import java.util.Scanner;

public class PrintStar {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number to print in star format in Ascending oder: ");
		starInAscendingOrder(input.nextInt());
		System.out.print("Enter the number to print in star format in Decending oder:");
		starInDecendingOrder(input.nextInt());
		System.out.print("Enter the number to print in star format in Ascending to Decending oder: ");
		starInAscendingToDecendingOrder(input.nextInt());
		input.close();
	}

	// 1.
	public static void starInAscendingOrder(int number) {
		for (int i = 1; i <= number; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	public static void starInDecendingOrder(int number) {
		int i, j;
		for (i = number; i >= 1; i--) {
			for (j = 1; j <= i; j++) {
				System.out.print("*" + " ");
			}
			System.out.println();
		}
	}

	public static void starInAscendingToDecendingOrder(int number) {
		int i, j, col;
		for (i = 1; i <= 2 * number; i++) {
			if (i > number) {
				col = 2 * number - i;
			} else {
				col = i;
			}
			for (j = 1; j <= col; j++) {
				System.out.print("*" + " ");
			}
			System.out.println();
		}
	}
}