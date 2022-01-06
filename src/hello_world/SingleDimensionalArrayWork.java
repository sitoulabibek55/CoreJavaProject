package hello_world;


public class SingleDimensionalArrayWork {

	public int[] sumArrayClass(int array1[], int array2[]) {
		int sumArray[] = new int[array1.length];
		for (int i = 0; i < array1.length; i++) {
			sumArray[i] = array1[i] + array2[i];
		}
		return sumArray;
	}

	public void printArray(int firstA[], int secondA[], int arrayS[]) {
		for (int i = 0; i < arrayS.length; i++) {
			System.out.println("\nThe sum of " + firstA[i] + " and " + secondA[i] + " is: " + arrayS[i]);
		}
	}
}