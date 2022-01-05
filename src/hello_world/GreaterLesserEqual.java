package hello_world;
import java.util.Scanner;


public class GreaterLesserEqual {
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter first number: ");
		int num1 = input.nextInt();
		System.out.print("Enter second number: ");
		int num2 = input.nextInt();
		
		if(num1 == num2) {
			System.out.println(num1 + " is equal to  "+ num2);
		} else if(num1 < num2) {
			System.out.println(num1 + " is lesser than " + num2);
		} else {
			System.out.println(num1 + " is greater than  " + num2);
		}
		input.close();
			
	}
}