package hello_world;

import java.util.Scanner;

public class SingileDimensionalArrays {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the size of an Array: ");
		int size = input.nextInt();
		int inArray1[] = new int[size];
		int inArray2[] = new int[size];

		System.out.println("Enter the number for first array: ");
		// loop to insert values in array 1 and 2
		for (int i = 0; i < inArray1.length; i++) {
			inArray1[i] = input.nextInt();
		}

		System.out.println("\nEnter the number for second array: ");
		for (int i = 0; i < inArray2.length; i++) {
			inArray2[i] = input.nextInt();
		}
		SingleDimensionalArrayWork sd = new SingleDimensionalArrayWork();
		int[] printValue = sd.sumArrayClass(inArray1, inArray2);
		sd.printArray(inArray1, inArray2, printValue);

//
//		// for loop to add 2 array
//		for (int i = 0; i < sumArray.length; i++) {
//			sumArray[i] = inArray1[i] + inArray2[i];
//			System.out.println("\nThe sum of " + inArray1[i] + " and " + inArray2[i] + " is: " + sumArray[i]);
//		}
		input.close();
	}
}