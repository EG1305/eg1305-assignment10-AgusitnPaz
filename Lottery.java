import java.util.Scanner;

public class Lottery {

	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		
		int[] userArray = new int[5];
		
		getValues(userArray);
		int[] randArray = fillArray(5);
		
	    printArray(randArray);
	    
	    compareNumbers(userArray, randArray);
		
		
	}

	private static void printArray(int[] userArray) {
		
		System.out.println("\nThe lottery numbers are: ");
		
		for(int i = 0; i < userArray.length; i++) {
			
			System.out.print(userArray[i] + " ");
			
		}
		
		System.out.println();
	}

	private static void getValues(int[] userArray) {
		
		System.out.println("Enter a series of 5 numbers.");
		
		for(int i = 0; i < userArray.length; i ++) {
			
			System.out.print("Enter number " + (i + 1) + ": ");
			userArray[i] = input.nextInt();
			
		}
		
	}

	private static int[] fillArray(int arrayLength) {
		
		int[] randArray = new int[arrayLength];
		
		for(int i = 0; i < arrayLength; i++) {
			
			randArray[i] = (int)(Math.random() * 10);
			
		}
		
		return randArray;
	}
	
	private static void compareNumbers(int[] array1, int[] array2) {
		
		int correctNums = 0;
		int[] numsCorrect = new int[5];
		int j = 0;
		
		for(int i = 0; i < array1.length; i++) {
			
			if(array1[i] == array2[i]) {
				
				numsCorrect[j] = array1[i];
				
				j++;
				correctNums++;
				
			}
			
		}
		
		System.out.println("you matched " + correctNums + " numbers");
		
		if(correctNums > 0) {
			
		System.out.println("The matching numbers are:");
		
		for(int i = 0; i < correctNums; i++) {
			
			System.out.print(numsCorrect[i] + " ");
			
		}
		}
	}
	
}
