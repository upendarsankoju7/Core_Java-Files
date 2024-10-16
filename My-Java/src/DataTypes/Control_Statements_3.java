package DataTypes;

public class Control_Statements_3 {

    public static void main(String[] args) {
        // Main method - entry point of the program

        // Initializing three integer variables
        int a = 100;
        int b = 400;
        int c = 300;
        
        // First if condition: checks if 'a' is greater than both 'b' and 'c'
        if (a > b && a > c) {
            // If true, print that 'a' is the largest number
            System.out.println("A is the Largest Number");
        }
        // Else-if condition: checks if 'b' is greater than both 'a' and 'c'
        else if (b > a && b > c) {
            // If true, print that 'b' is the largest number
            System.out.println("B is the Largest Number");
        }
        // Else block: if neither of the above conditions is true, 'c' is the largest
        else {
            // Print that 'c' is the largest number
            System.out.println("C is the Largest Number");
        }
    }
}
