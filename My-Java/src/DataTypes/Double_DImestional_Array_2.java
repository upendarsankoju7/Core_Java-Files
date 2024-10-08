package DataTypes;

public class Double_DImestional_Array_2 {

		    public static void main(String[] args) {
		        // Initialize a 2D array with predefined values
		        int a[][] = {{1, 2,9 }, {3, 4,10 }, {5, 6,11 }, {7, 8,12 }};

		        // Print the number of rows in the array
		        System.out.println("Number of rows: " + a.length);
		        // Print the number of columns in the first row of the array
		        System.out.println("Number of columns: " + a[0].length);

		        // Iterate through each row of the 2D array
		        for (int r[] : a) {
		            // Iterate through each element in the current row
		            for (int i : r) {
		                // Print the element followed by a tab for spacing
		                System.out.print(i + "\t");
		            }
		            // Move to the next line after printing all elements of the current row
		            System.out.println();
		        }
		    }
		}
