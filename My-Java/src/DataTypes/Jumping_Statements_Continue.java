	package DataTypes;
	
	public class Jumping_Statements_Continue {
	
		public static void main(String[] args) {
			// Main method: This is the entry point of the program.
			
			// Using a for loop to iterate from 1 to 10.
			for (int i = 1; i <= 10; i++) {
	
				// Check if the current value of i is equal to 5.
				// If true, the continue statement skips the rest of the loop body and moves to the next iteration.
				if (i == 5) {
					continue; // Skip the iteration when i equals 5.
				}
	
				// Print the current value of i to the console.
				System.out.println(i);
			}
	}
}
