package hello_world;

public class PrintStarWork {
	public void starInAscendingOrder(int number) {
		for (int i = 1; i <= number; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	public void starInDecendingOrder(int number) {
		int i, j;
		for (i = number; i >= 1; i--) {
			for (j = 1; j <= i; j++) {
				System.out.print("*" + " ");
			}
			System.out.println();
		}
	}

	public void starInAscendingToDecendingOrder(int number) {
		int i, j, col;
		for (i = 1; i <= 2 * number; i++) {
			if (i > number) {
				col = 2 * number - i;
			} else {
				col = i;
			}
			for (j = 1; j <= col; j++) {
				System.out.print("*" + " ");
			}
			System.out.println();
		}
	}
}
