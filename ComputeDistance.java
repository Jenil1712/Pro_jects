import java.util.Scanner; // Scanner is in java.util package
public class ComputeDistance {

	public static void main(String[] args) {
		//Create a Scanner Object
		Scanner input = new Scanner(System.in);
		
		//Prompt the user to enter two numbers, for example first number less than 25 and second number less than 30
		System.out.print("Enter how many gallons the gas tank holds (must be less than 25): ");
		int numberOfGallons = input.nextInt();

		System.out.print("Enter the miles per gallon the car gets (must be less than 30 MPG): ");
		int milesPerGallon = input.nextInt();
		
		//Calculate the maximum distance by multiplying numberOfGallons with milesPerGallon
		int maximumDistance = numberOfGallons * milesPerGallon;
		
		//Print Result
		System.out.println("The maximum distance the car can travel " + " is: " 
		+ maximumDistance);
		
       
	}

}
