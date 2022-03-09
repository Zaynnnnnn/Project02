package Project02;

// Import Library...
import java.util.Scanner;

public class tasks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        // Tasks of 2nd Class of java...
		
        //	Q 01: Write a program to get input number from the user, if number is Even OR Odd number then print that number is Odd OR Even... 	
		
        //	Solve 01;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your number to find your number is Odd Or Even...");
		System.out.println(" ");
		
		int input = sc.nextInt();
		
		if (input % 2 == 0) {
			System.out.println("Your Number is Even Number");
		}
		else {
			System.out.println("Your Number is Odd Number");
		}
		
		//  Solved...
		//  First Question is Done...		
		
		//  Q 02: Get a number from the user and factorial that number...
		
		//  solve 02;
		
		System.out.println(" ");
		System.out.println("Enter your number to find the factorial of it...");
		System.out.println(" ");
		
		int input1 = sc.nextInt();
			
		int z = 1;
		int fact = 1 ;
		
		while (z <= input1) {
			
		fact = fact * z;
		z++;
			
		}
		
		System.out.println("Factorial of "+ input1 + " is : " + fact);
		
		// Solved...
		// Second Question is Done...
		
		
		// Task is Done...
	}

}
