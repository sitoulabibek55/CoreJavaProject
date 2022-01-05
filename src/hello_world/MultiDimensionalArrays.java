package hello_world;

import java.util.Scanner;

public class MultiDimensionalArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the size of row for Matrix: ");
		int row = input.nextInt();
		System.out.print("\nEnter the size of column for Matrix: ");
		int col = input.nextInt();
		int[][] inMatrix1 = new int[row][col];
		int[][] inMatrix2 = new int[row][col];
		int[][] sumMatrix = new int[row][col];
		int i, j;
		// Input elements for first matrix
		System.out.println();
		for (i = 0; i < inMatrix1.length; i++) {
			for (j = 0; j < inMatrix1[i].length; j++) {
				System.out.print("Enter the number in first matrix for index [" + i + ", " + j + "]: ");
				inMatrix1[i][j] = input.nextInt();
			}
		}

		// Input element for second matrix
		System.out.println();
		for (i = 0; i < inMatrix2.length; i++) {
			for (j = 0; j < inMatrix2[i].length; j++) {
				System.out.print("Enter the number in second matrix for index [" + i + ", " + j + "]: ");
				inMatrix2[i][j] = input.nextInt();
			}
		}

		System.out.println();
		// adding first and second matrix and storing result in sumMatrix
		for (i = 0; i < sumMatrix.length; i++) {
			for (j = 0; j < sumMatrix[i].length; j++) {
				sumMatrix[i][j] = inMatrix1[i][j] + inMatrix2[i][j];
				System.out.println("The sum matrix for index [" + i + ", " + j + "] is: " + sumMatrix[i][j]);
			}
		}

		// ************************************************************************************
		// Output for first matrix in row * col format
		System.out.println("\nThe first matrix of " + row + " * " + col + " is: ");
		for (i = 0; i < inMatrix1.length; i++) {
			for (j = 0; j < inMatrix1[i].length; j++) {
				System.out.print(inMatrix1[i][j] + "\t");
			}
			System.out.println();
		}

		// second matrix output in row * col format
		System.out.println("\nThe second matrix of " + row + " * " + col + " is: ");
		for (i = 0; i < inMatrix2.length; i++) {
			for (j = 0; j < inMatrix2[i].length; j++) {
				System.out.print(inMatrix2[i][j] + "\t");
			}
			System.out.println();
		}

		// Displaying sum in matrix
		System.out.println("----------------------------------------------");
		System.out.println("The sum  of two matrix of " + row + " * " + col + " is: ");
		for (i = 0; i < sumMatrix.length; i++) {
			for (j = 0; j < sumMatrix[i].length; j++) {
				System.out.print(sumMatrix[i][j] + "\t");
			}
			System.out.println();
		}
		input.close();
	}
}
