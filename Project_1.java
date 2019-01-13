import java.util.Scanner;
public class Chpt4_Project {

	public static void main(String[] args) {
		// Create a new Scanner object
		Scanner input = new Scanner(System.in);
		
		// Prompt the user to enter the first city
		System.out.print("Enter the first city: ");
		String firstCity = input.nextLine();
		
		// Prompt the user to enter the second city
		System.out.print("Enter the second city: ");
		String secondCity = input.nextLine();
		
		// Enter the latitude(lat1) and longitude(long1) of first city
		System.out.print("Enter the latitude and longitude of first city separated by a space (example 28.8 81.2): ");
		double lat1 = input.nextDouble();
		double long1 = input.nextDouble();
		
		// Enter the latitude(lat2) and longitude(long2) of second city
		System.out.print("Enter the latitude and longitude of second city separated by a space (example 28.8 81.2): ");
		double lat2 = input.nextDouble();
		double long2 = input.nextDouble();
		
		// Convert the differences in longitudes and latitudes of two cities in miles and calculate the distance
		double x,y,miles = input.nextDouble();
		x = (long1 - long2) * 55;
		y = (lat1 - lat2) * 69;
		miles = Math.sqrt(x*x + y*y);
		
		// Display the distance between two cities
		System.out.println("The distance between the two cities is " + miles + " miles");

	}

}
