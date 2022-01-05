package hello_world;
import java.util.Scanner;

public class FindMonths {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int number;
		do {
			System.out.print("Enter the Number from 1-12 to find it's respective month: ");
			number = input.nextInt();
			switchCase(number);
		} while (number != 0);
		input.close();
	
	}
	public static void switchCase(int num) {
		switch(num) {
		case 1:
			System.out.println(num + " is the month January." );
			break;
		case 2:
			System.out.println(num + " is the month February." );
			break;			
		case 3:
			System.out.println(num + " is the month March." );
			break;	
			
		case 4:
			System.out.println(num + " is the month April." );
			break;	
			
		case 5:
			System.out.println(num + " is the month May." );
			break;	
			
		case 6:
			System.out.println(num + " is the month June." );
			break;	
			
		case 7:
			System.out.println(num + " is the month July." );
			break;	
			
		case 8:
			System.out.println(num + " is the month August." );
			break;	
			
		case 9:
			System.out.println(num + " is the month September." );
			break;	
			
		case 10:
			System.out.println(num + " is the month October." );
			break;	
			
		case 11:
			System.out.println(num + " is the month November." );
			break;	
			
		case 12:
			System.out.println(num + " is the month December." );
			break;	
		default:
			if (num != 0) {
				System.out.println("Invalid selection of month.");
			}
			// break;
		}

	}
}