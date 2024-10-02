package DataTypes;

public class Jumping_Statements_break {

	public static void main(String[] args) {
		// Main method: This is the entry point of the program.
		
		// Using a for loop to iterate from 1 to 10.
		for (int i = 1; i <= 10; i++) {
			
			// Check if the current value of i is equal to 10.
			// If true, the break statement will terminate the loop.
			if (i == 10) {
				break;  // Exit the loop when i equals 10.
			}
			
			// Print the current value of i to the console.
			System.out.println(i);
		}
	}
}
