package hello_world;

import java.util.Scanner;

/*
 * 
 * --> check  the biggest number among 3 numbers 


			1)all are equal
			2)first one is biggest			
			3)second one is biggest			
			4)third one is biggest
 */

public class MaxNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter three numbers: ");
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		int num3 = input.nextInt();
		// System.out.printf("%d, %d, %d", num1, num2, num3);
		if (num1 == num2 && num1 == num3) {
			System.out.printf("%d, %d, %d are equal.\n", num1, num2, num3);
		} 
		else if (num1 > num2 && num1 > num3) {
			System.out.printf("%d is greater than %d and %d\n", num1, num2, num3);
		} 
		else if (num2 > num1 && num2 > num3) {
			System.out.printf("%d is greater than %d and %d\n", num2, num1, num3);
		} 
		else if (num3 > num1 && num3 > num2) {
			System.out.printf("%d is greater than %d and %d\n", num3, num1, num2);
		}
		else {
			System.out.println("two of them are same");
		}
		input.close();
	}

}