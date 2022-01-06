package hello_world;

public class LuckyNumberByObjectCalling {
	public int sumOfDigit(int num) {
		int sum = 0;
		while (num != 0) {
			sum += num % 10;
			num /= 10;
		}
		if (sum <= 9) {
			System.out.println("Your lucky number is: " + sum);
			return sum;

		} else {
			return sumOfDigit(sum);
		}
	}
}
