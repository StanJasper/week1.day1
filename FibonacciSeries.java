package week1.day1;

import org.apache.poi.util.SystemOutLogger;

public class FibonacciSeries
{
	public static void main(String args[])
	{
		int r=8, f = 0, s = 1;		// initialize 3 int variable
		System.out.println(f);		//print first number
		System.out.println(s);		//print second number
		for(int a = 2;a<r;a++)		// Iterate from 2 to the range (1 and 2 nums already printed)
		{
		int sum = f + s;			//add first and second number assign to sum
		f = s;						// Assign second number to the first number
		s = sum;					// Assign sum to the second number
		System.out.println(sum);	// print sum
		}
	}
	
		
}
