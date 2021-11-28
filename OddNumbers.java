package week1.day1;

public class OddNumbers
{
	public static void main(String args[])
	{
		int a=20;		//-input declared as 20
		for(int b=1;b<=a;b++)		//-Iterate from 1 to 20
		{
			if (b%2!=0)				//-(within loop)check whether the integer is odd
			{
				System.out.println(b);		//-(within loop)print the odd integer
			}
		}
	}
}
