package setm_package3;

import java.util.Scanner; // Importing Java Utill for Scanner Class

public class SETM_Project3 
{

	public void WelcomeToTheTeam() {
		
		System.out.println("Hello Welcome to the Team"); //Output Statement
	}
	
	public static void main(String[] args) {
		
		SETM_Project3 s = new SETM_Project3(); //Creating an Object
		
		s.WelcomeToTheTeam();
		
		hello h = new hello();
		h.hello();
		
		h.PrintStar(); // Printing a Start with Calling Function
		
		System.out.println("Answer is "+Numbers()); // Calling Function In
		
	}
	
	public static class hello extends SETM_Project3 //Inheriting
	{
		public hello() {
			
			super();
		}
		
		public void hello() {
			
			System.out.println("Hello It's team A");
		}
	}
	
	public void PrintStar() {
		
		int c, d, e; // Variable Declaration
		
		for(c = 1; c <= 8; c++)
		{
			for(d = 1; d <= c; d++)
			{
				System.out.println("*");
			}
			
			System.out.println(""); // Printing Inner for Loop
		}
		
		for(e = 1; e <= 4; e++) 
		{
			System.out.println("***"); // Printing Inner for Loop

		}
	}
	
	public static double Numbers()
	{
		Scanner sc = new Scanner(System.in); //Scanner Class Creation
		
		System.out.println("Please Enter Value 1"); // Getting input from user keyboard
		double a = sc.nextDouble();
		
		System.out.println("Please Enter Value 2"); 
		double b = sc.nextDouble();
		
		double k = a + b;
		return k; //Returning the answer
	}
}
