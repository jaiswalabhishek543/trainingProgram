package training;

import java.util.Scanner;

import org.apache.log4j.Logger;
/*
 * @author Abhishek

 */
public class MyCalculator {
	/*
	 * Calculator
	 * 
	 * Calculating the power of two numbers and giving output, according to constraints 
	 */

	//Method to find out the power
	final static Logger printf=Logger.getLogger(MyCalculator.class.getName());
	
	public long power1(final long base,long power) throws Exception
	{   long val=1;
	if(base>10 || power>10 || base<(-10) || power<(-10))
	{
		//System.out.println("Enter values within -10 to 10");
		printf.info("Enter values within -10 to 10");
		return -1;
	}
	else if(base==0 || power==0)
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



	public static void main(final String[] args) throws Exception
	{   
		MyCalculator myc=new MyCalculator();
		final Scanner scan=new Scanner(System.in);
		//System.out.println("Enter two numbers");
		printf.info("Enter two numbers");		
		final Long a11=scan.nextLong();
		final Long b11=scan.nextLong();
		final long c=myc.power1(a11,b11);
		//System.out.println(c);
		printf.info(c);

		scan.close();
	}
}
