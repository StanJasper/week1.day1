package week1.day1;

import java.util.Iterator;

public class Factorial 
{
	public static void main(String args[])
	{
		int a=5;		// Declare your input as 5
		int fact =1;			// Declare an integer variable fact as 1
		for (int b=1;b<=a;b++)			// Iterate from 1 to your input
		{
			fact=fact*b;				// Within the loop: Multiply fact with the iterator variable
		}
			
		System.out.println(fact);			// Print factorial
		
	}
}
