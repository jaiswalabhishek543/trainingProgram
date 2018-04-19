package day4;

import java.util.Scanner;
/*
 * @abhi
 */
public class MyCalculator {
	/*
	 * Calculator
	 * 
	 * Calculating the power of two numbers and giving output, according to constraints 
	 */
      
	//Method to find out the power
	public static long power(long base,long power) throws Exception
	{   long val=1;
		if(base==0 || power==0)
		{
			throw new Exception("n and p should not be zero");
			
		}
		else if(base<0 || power<0)
		{
			throw new Exception("n or p should not be negative");

		}
		else
		{
			
			while(power>0)
			{
				val=val*base;
				power--;
			}
			return val;

		}
				
	}
	
	
	
	public static void main(String[] args) throws Exception
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter two numbers");
		Long a=scan.nextLong();
		Long b=scan.nextLong();
		
		if(a>10 || b>10 || a<(-10) || b<(-10))
		{
			System.out.println("Enter values within -10 to 10");
		}
		else 
		{
		long c=power(a,b);
		System.out.println(c);
		}
		
	}
}
