// Jenil Patel
import java.util.Scanner;
public class Chpt6_Project {

	public static void main(String[] args) {
		// Create a new Scanner object
		Scanner input = new Scanner(System.in);
				
		// Prompt the user to enter the length in inches
		System.out.print("Enter the length: ");
		double length = input.nextDouble();
		
		// Prompt the user to enter the width in inches
		System.out.print("Enter the width: ");
		double width = input.nextDouble();
		
		// Prompt the user to enter the height in inches
		System.out.print("Enter the height: ");
		double height = input.nextDouble();
		
		// Invoke the calcVolume method that will calculate the volume of rectangle
	    double volume = calcVolume(length, width, height);
		
		// After invoking the calcVolume method, print the output
		System.out.printf("The volume for a cube %.2f inches long, %.2f inches wide, and %.2f inches tall is %.2f cubic inches.", length, width, height, volume);
		
	}
		
	public static double calcVolume(double length, double width, double height) {
		double volume;
		
		// Write the volume formula for the rectangle
		volume = length * width * height;
		return volume;
		
	}
	
}
