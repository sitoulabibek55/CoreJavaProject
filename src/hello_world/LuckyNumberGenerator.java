package hello_world;
import java.util.Scanner;

public class LuckyNumberGenerator {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number to generate your lucky number: ");
		int num = input.nextInt();
		LuckyNumberByObjectCalling lc = new LuckyNumberByObjectCalling();
		lc.sumOfDigit(num);
		input.close();
	}
	//using recursion to find the sum of digits of given number

}
