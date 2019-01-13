public class Chpt5_Project {
	public static void main(String[] args) {
		// Declare the variables and assign value to them
		final int NUMBER_OF_PRIMES = 26;
		final int NUMBER_OF_PRIMES_PER_LINE_EXCEPT_FOR_THE_LAST_LINE = 5;
				
		int count = 0;
		int number = 1;
	
		System.out.println("The prime numbers between 1 and 100 are: ");

		// Repeatedly find prime numbers with the use of while loop
		while (count < NUMBER_OF_PRIMES) {
			boolean isPrime = true;
				
		// Test whether the number is prime through the for loop
	
				for (int divisor = 2; divisor <= number / 2; divisor++) {				
					if (number % divisor == 0) {
						isPrime = false;
						break;
			}
				}
				
		// Display the Prime numbers
					if (isPrime == true) {
						count++;
						if (count % NUMBER_OF_PRIMES_PER_LINE_EXCEPT_FOR_THE_LAST_LINE == 0 ) {
					System.out.println(number);
						}	
						else
					System.out.print(number + " ");				
					
					}
					
				number++;
			}
	}
}
