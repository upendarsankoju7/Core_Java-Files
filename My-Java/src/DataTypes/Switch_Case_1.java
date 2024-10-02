package DataTypes;

public class Switch_Case_1 {

    public static void main(String[] args) {
        // Declaring and initializing the variable Day
        int Day = 4;

        // Start of switch statement
        switch (Day) 
        {
            // If Day is 1, print "Sunday"
            case 1: 
                System.out.println("Sunday"); 
                break;

            // If Day is 2, print "Monday"
            case 2: 
                System.out.println("Monday"); 
                break;

            // If Day is 3, print "Tuesday"
            case 3: 
                System.out.println("Tuesday"); 
                break;

            // If Day is 4, print "Wednesday"
            case 4: 
                System.out.println("Wednesday"); 
                break;

            // If Day is 5, print "Thursday"
            case 5: 
                System.out.println("Thursday"); 
                break;

            // If Day is 6, print "Friday"
            case 6: 
                System.out.println("Friday"); 
                break;

            // If Day is 7, print "Saturday"
            case 7: 
                System.out.println("Saturday"); 
                break;

            // If Day is not in the range 1-7, print "Invalid Week Day"
            default: 
                System.out.println("Invalid Week Day");
        }
    }
}
