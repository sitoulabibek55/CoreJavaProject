package hello_world;

import java.util.Scanner;

public class SingileDimensionalArrays {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the size of an Array: ");
		int size = input.nextInt();
		// int singleDimensionArray [] = new int [size];
		int inArray1[] = new int[size];
		int inArray2[] = new int[size];
		int sumArray[] = new int[size];

		System.out.print("Enter the number for first array: ");
		// loop to insert values in array 1 and 2
		for (int i = 0; i < inArray1.length; i++) {
			inArray1[i] = input.nextInt();
		}

		System.out.print("\nEnter the number for second array: ");
		for (int i = 0; i < inArray2.length; i++) {
			inArray2[i] = input.nextInt();
		}
		// for loop to add 2 array
		for (int i = 0; i < sumArray.length; i++) {
			sumArray[i] = inArray1[i] + inArray2[i];
			System.out.println("\nThe sum of " + inArray1[i] + " and " + inArray2[i] + " is: " + sumArray[i]);
		}

		input.close();
	}
}
/*
 * 
 * 
 * 
 * ---> declare three Equal single dimensional Arrays, read input into two
 * arrays and store the sum of two arrays into third array.
 * 
 * 
 * 0 1 2 3 4 -------------------------- A 10 20 30 40 50
 * 
 * B 1 2 3 4 5
 * 
 * 
 * C 11 22 33 44 55
 * 
 */