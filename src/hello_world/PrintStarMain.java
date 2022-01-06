package hello_world;

import java.util.Scanner;

public class PrintStarMain extends PrintStarWork {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintStarMain printStarMain = new PrintStarMain();

		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number to print in star format in Ascending oder: ");
		printStarMain.starInAscendingOrder(input.nextInt());
		System.out.print("Enter the number to print in star format in Decending oder:");
		printStarMain.starInDecendingOrder(input.nextInt());
		System.out.print("Enter the number to print in star format in Ascending to Decending oder: ");
		printStarMain.starInAscendingToDecendingOrder(input.nextInt());
		input.close();
	}
}