package DataTypes;

public class Single_dim_2 {

    public static void main(String[] args) {
        // Entry point of the program

        // Declare and initialize an integer array 'a' with 8 elements
        int a[] = {100, 200, 300, 400, 500, 600, 700, 800}; 

        // Declare and initialize an integer array 'b' with 10 elements
        int b[] = {1,2,3,4,5,6,7,8,9,10};

        // Declare and initialize a string array 'c' with 2 elements
        String c [] = {"Upendar","Sankoju"};

        // Print the length of array 'a' (which is 8 in this case)
        System.out.println(a.length);  
               
        // Loop through array 'a' using a traditional for loop
        for (int i = 0; i < a.length; i++) {  // 'i' is the index of the array
           System.out.println(a[i]);  // Print each element of array 'a' using its index
        }

        // Loop through array 'b' using a for-each loop
        for (int i:b) {
        	System.out.println(i);  // Print each element of array 'b'
        }

        // Loop through array 'c' (String array) using a for-each loop
        for (String i:c) {
        	System.out.print(i);  // Print each element of array 'c' (Upendar Sankoju in this case)
        }
    }
}
