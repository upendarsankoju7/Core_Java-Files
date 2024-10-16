package DataTypes;

public class Oparators {

	public static void main(String[] args) {
		// Arthamtic Operators + * - / %
		int a = 20;
		int b = 40;
		
		System.out.println("sum of A and B is : " + (a+b));
		System.out.println("sum of A and B is : " + (a*b));
		System.out.println("sum of A and B is : " + (a-b));
		System.out.println("sum of A and B is : " + (a/b));
		System.out.println("sum of A and B is : " + (a%b));
		
		// Relational Operators / Comparison Operators 
		// > >= <= != == - always return a boolean value(true/false)
		
		System.out.println(a>b); //false
		System.out.println(b>a); //true
		System.out.println(a!=b); //true
		System.out.println(a<b); //true
		System.out.println(a>b); //false
		System.out.println(a<=b); //true
		System.out.println(a>=b); //false
		
		//Logical operators && || ! -- returns true/false
	
		boolean x=true;
		boolean y=false;
		
		System.out.println(x && y); //false
		System.out.println(x || y); //true
		System.out.println(!x);//false
		
		a=100;	// int res=a++;   // post increment
		// int res=++a;  //pre increment
		
		//System.out.println(res);
		
		System.out.println(a++); //100   101
		System.out.println(++a); //102
		
		
        b=100;
		
		//int res=b--;
		
		int res=--b;
		System.out.println(res);
		
		

	}

}
