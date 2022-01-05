package hello_world;
import java.util.Scanner;

public class LuckyNumberGenerator {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your name to generate your lucky number: ");
		int num = input.nextInt();
		sumOfDigit( num);
		input.close();
	}
	//using recursion to find the sum of digits of given number
	public static int sumOfDigit( int num) {
		int sum=0;
		while(num!=0) {
			sum += num %10;
			num /=10;
		}
		if (sum <= 9) {
			System.out.println("Your lucky number is: "+ sum);
			return sum;

		}else {
			return sumOfDigit(sum);
		}
	}
}
