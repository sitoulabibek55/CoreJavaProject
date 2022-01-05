package hello_world;
import java.util.Scanner;

public class LuckyNumberByName {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter any number or name to generate your lucky number: ");
		String str = input.nextLine();
		newString(str);
		input.close();
	}

	// Method
	public static String newString(String str) {
		int num, sum = 0;
		char ch;

		for (int i = 0; i < str.length(); i++) {
			ch = str.charAt(i);
			num = ch - '0';
			sum += num;

		}
		str = Integer.toString(sum);
		if (sum <= 9) {
			System.out.println("Your lucky number is: " + sum);
			return str;
		} else {
			return newString(str);
		}
	}
}
