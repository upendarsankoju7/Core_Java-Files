package DataTypes;

public class Double_Dimenational_3 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        // Initialize an array of integers
        int a[] = {10, 20, 30, 40, 50, 60, 70};
        
        // Initialize the number to be searched in the array
        int num = 10;
        
        // Boolean flag to track if the element is found
        boolean flag = false;

        // Enhanced for loop to iterate over the array 'a'
        for (int i : a) {
            // Check if the current element 'i' is equal to 'num'
            if (i == num) {
                // If found, print "Element Found"
                System.out.println("Element Found");
                // Set the flag to true indicating the element is found
                flag = true;
                // Break out of the loop as the element has been found
                break;
            }
        }

        // If the element is not found (flag is still false), print "Element Not Found"
        if (flag == false) {
            System.out.println("Element Not Found");
        }
    }
}
