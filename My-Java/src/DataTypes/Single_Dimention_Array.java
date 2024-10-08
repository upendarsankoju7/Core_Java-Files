package DataTypes;

public class Single_Dimention_Array {

    public static void main(String[] args) {
        // Entry point of the program

        // Declare a single-dimensional integer array 'a' with a size of 5
        int a[] = new int[5];

        // Assign values to the elements of the array 'a'
        a[0] = 100;  // Assign 100 to the first element (index 0)
        a[1] = 200;  // Assign 200 to the second element (index 1)
        a[2] = 300;  // Assign 300 to the third element (index 2)
        a[3] = 400;  // Assign 400 to the fourth element (index 3)
        a[0] = 500;  // Reassign the value at index 0 to 500 (overwriting the previous 100)

        // Print the value at index 1 of the array (which is 200)
        System.out.println(a[1]);  
    }
}
