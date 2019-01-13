// Jenil Patel
import java.util.Arrays;
public class Chpt7_Project {

	public static void main(String[] args) {
		
		// Generate 11 random numbers between 1 and 100
		int [] list = new int [11];
		for (int i = 0; i < list.length; i ++) {
			list[i] = (int) (Math.random()* 100 +1);
		}
		
		// Display an unsorted list of array
			System.out.println("The unsorted list is: " + Arrays.toString(list));
			
		// Invoke the bubbleSort method	
			bubbleSort(list);
			
		//	Display sorted list of array
			System.out.println("The sorted list is: " + Arrays.toString(list));
		
		// Find the median 
			double median = 0;
		      double pos1 = Math.floor((list.length - 1.0) / 2.0);
		      double pos2 = Math.ceil((list.length - 1.0) / 2.0);
		      if (pos1 == pos2 ) {
		         median = list[(int)pos1];
		      } else {
		         median = (list[(int)pos1] + list[(int)pos2]) / 2.0 ;
		      }
			 
		// Display the median of sorted array
			System.out.println("The median is located at position 6 and the value is " + list[list.length/2]);
			
		}
	
	public static void bubbleSort(int[] list) {
		// Sort the array from smallest to largest integer
		int temp;
			for (int i = list.length - 1; i > 0; i --) {
				
				for (int j = 0; j < i; j++)
				{
					if (list [j] > list [j + 1])
					{
					temp = list[j];
					list[j] = list[j + 1];
					list[j + 1] = temp;
					}
				  }
				}
			
			
			}
	

}
