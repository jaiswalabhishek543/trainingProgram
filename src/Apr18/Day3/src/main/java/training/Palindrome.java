package training;
import java.util.InputMismatchException;
import java.util.Scanner;

import org.apache.log4j.Logger;

/*
 * Checking Palindrome
 * 
*/
public class Palindrome 
{
	//Main method
	public static void main(String[] args)
	{
		 
      final Scanner sca=new Scanner(System.in);
      final Logger printf=Logger.getLogger(Palindrome.class.getName());
      printf.info("Enter the Integer");
      Integer input=sca.nextInt();  //Taking input from terminal
      
      if(isPalindrome(input))
         printf.info(input+" is palindrome");
      else
    	  printf.info(input+" is not palindrome");
      sca.close();
		
     	}  
      
	public static boolean isPalindrome(int input1)
	{
      int rem;
      int sum=0;
      int temp;           //Initializing the variables

      temp=input1;      
      
      while(input1>0)             //Running while loop until number(input) is greater then zero
      {
    	 rem=input1%10;    //Taking out the remainder of the number
    	 sum=sum*10+rem;  //Multiplying with 10 and adding remainder to obtain the reverse order 
    	 input1=input1/10;
    	  
      }
     
      
      if(sum==temp) //Checking the number is palindrome or not
      {return true;}
       else  
      {return false;}      
   
      
      
    
 
	}
	

}
