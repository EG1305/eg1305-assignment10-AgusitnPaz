import java.text.DecimalFormat;
import java.util.Scanner;

public class TestRectangle {

	public static void main(String[] args) {
		
		double length;
		double width;
		 
		DecimalFormat area = new DecimalFormat("0.0000");
		DecimalFormat perimeter = new DecimalFormat("0.00");
		
		Scanner input = new Scanner(System.in);
		
		int arrayLength; 
		
		System.out.println("Enter the number of rectangles to be created");
		arrayLength = input.nextInt();
		
		Rectangle[] userArray = new Rectangle[arrayLength];
		
		
		for(int i = 0; i < arrayLength; i++) {
			
			System.out.println("Enter rectangle " + (i + 1) + " length");
			length = input.nextDouble();
			
			System.out.println("Enter rectangle " + (i + 1) + " width");
			width = input.nextDouble();
			
			userArray[i] = new Rectangle(length, width);
			
		}
			
		System.out.println("Here are the rectangles that you created");
		
		for(int i = 0; i < arrayLength; i++) {
			
			System.out.print("Rectangle " + (i + 1) + ": " + "area: " + area.format(userArray[i].getArea()));
			System.out.println(" : " + "perimeter: " + perimeter.format(userArray[i].getPerimeter()));
		}
		
		input.close();
	}
	
}
