package DataTypes;

public class While_Loop {

    public static void main(String[] args) {
        // Example 1: Commented Code (prints numbers from 1 to 5)
        
        // Initialize a variable 'i' with the value 1
        // int i = 1;
        
        // A while loop that runs as long as 'i' is less than or equal to 5
        /*
        while (i <= 5) {
            // Print the value of 'i'
            System.out.print(i + " "); // Using print instead of println to keep numbers on the same line
            
            // Increment 'i' by 1
            i++;
        }
        */

        // Example 2: Active Code (prints even numbers from 2 to 100)

        // Initialize a variable 'a' with the value 2
        int a = 2;
       
        // A while loop that runs as long as 'a' is less than or equal to 100
        while (a <= 100) {
            // Print the current value of 'a'
            System.out.println(a);
            
            // Increment 'a' by 2 (to print even numbers)
            a = a + 2;
        }
    }
}
