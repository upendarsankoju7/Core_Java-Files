package DataTypes;

public class Single_Dimention_3 {

    public static void main(String[] args) {
        // Declare a 2D array with 3 rows and 2 columns
        int a[][] = new int[3][2];

        // Assign values to the 2D array
        a[0][0] = 100; // Assign value to row 0, column 0
        a[0][1] = 200; // Assign value to row 0, column 1
        
        a[1][0] = 300; // Assign value to row 1, column 0
        a[1][1] = 400; // Assign value to row 1, column 1
        
        a[2][0] = 500; // Assign value to row 2, column 0
        a[2][1] = 600; // Assign value to row 2, column 1
        
        // Display the number of rows in the 2D array (a.length gives the number of rows)
        System.out.println("Number of Rows: " + a.length);
        
        // Display the number of columns in the first row of the 2D array (a[0].length gives the number of columns)
        System.out.println("Number of Columns: " + a[0].length);
          
        // Nested for-loop to iterate through the 2D array and print its elements
        for (int i = 0; i < a.length; i++) {  // Loop through each row (i is the row index)
        	
            for (int j = 0; j < a[i].length; j++) {  // Loop through each column in the current row (j is the column index)
            	
                // Print the element at row i and column j
                System.out.println(a[i][j]);
            }																				
        }
    }
}
