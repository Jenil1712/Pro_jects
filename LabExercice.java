import java.util.Scanner;
public class LabExercice {

	public static void main(String[] args) {
	   Scanner input = new Scanner(System.in);
	   // Prompt the user to enter the country name
	   System.out.print("Enter country name: ");
	   String country = input.nextLine();
	   
	   if (country.equals("United States"))
		   System.out.print("The capital is Washington, DC");
	   else if (country.equals("Brazil"))
		   System.out.print("The capital is Brasilia");
	   else if (country.equals("Canada"))
		   System.out.print("The capital is Ottawa");
	   else if (country.equals("France"))
		   System.out.print("The capital is Paris");
	   else if (country.equals("India"))
		   System.out.print("The capital is New Delhi");
	   else
		   System.out.println("I don't know the capital of " + country);
		   
	   input.close();
	   
		
		   		
		   
	   
	   		
	   
	   
		

	}

}
