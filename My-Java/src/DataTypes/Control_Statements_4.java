package DataTypes;

public class Control_Statements_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Declaring an integer variable Day with value 3
		int Day = 10;
       
		// Check if Day equals 1
		if (Day == 1) {
			System.out.println("Sunday");   
		} 
		// Check if Day equals 2
		else if (Day == 2) {
			System.out.println("Monday");
		} 
		// Check if Day equals 3
		else if (Day == 3) {
			System.out.println("Tuesday");   
		} 
		// Check if Day equals 4
		else if (Day == 4) {
			System.out.println("Wednesday");
		} 
		// Check if Day equals 5
		else if (Day == 5) {
			System.out.println("Thursday");
		} 
		// Check if Day equals 6
		else if (Day == 6) {
			System.out.println("Friday");   
		} 
		// Check if Day equals 7
		else if (Day == 7) {
			System.out.println("Saturday");   
		} 
		// If Day is not between 1 and 7, print invalid number
		else {
			System.out.println("Invalid Week Number ");   
		}
	}
}
