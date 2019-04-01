import java.util.Scanner;

public class Distinct {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int[] userArray = new int[10];	
		
		for(int i = 0; i < userArray.length; i++) {
			
			System.out.print("Enter integer " + (i + 1) + ":");
			
			userArray[i] = input.nextInt();
			
		}
		
		printDistinctNumbers(userArray);
		
		input.close();
	}
	
	public static void printDistinctNumbers(int[] userArray) {
		
		int[] distinctNum = new int[userArray.length];
		
		distinctNum[0] = userArray[0];
		
		System.out.println("\nDistinct numbers are:");
		System.out.print(userArray[0] + " "); 

	for(int i = 1; i < userArray.length; i++) {
			
			boolean isNotEqual = true;
			int j = 0;

			while(isNotEqual) {
				
				if(userArray[i] == distinctNum[j]) {
					
					isNotEqual = false;
				}
				
				else if(j == i - 1) {
					
					System.out.print(userArray[i] + " ");
					
					distinctNum[j + 1] = userArray[i];
					
					break;
	
				}
				
				j++;
				
			}
			
		}
		
	}
	

}
