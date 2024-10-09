package DataTypes;

public class Double_Dimentional_Array_4 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        // Initialize an array of integers
        int a[] = {10, 20, 30, 40, 50, 60, 70, 80, 90};
        
        // Variable to store the sum of array elements
        int Sum = 0;

        // Enhanced for loop to iterate over the array 'a'
        for (int i : a) {
            // Add each element of the array to the variable 'Sum'
            Sum = Sum + i;
        }

        // Print the total sum of the elements in the array
        System.out.println(Sum);
    }
}
