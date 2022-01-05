package hello_world;
import java.util.Scanner;

public class PrimeNumberChecker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter any number to check if it's prime number or not: ");
		int number = input.nextInt();
		boolean isPrime = true;
		for (int i = 2; i <= number / 2; i++) {
			if(number%i == 0) {
				isPrime=false;
				break;
			}				
		}
		if(isPrime ==true) {
			System.out.printf("The number (%d) is Prime Number.", number);
		}else {
			System.out.printf("The number (%d) is not Prime Number.",number);
		}
		input.close();
	}

}
