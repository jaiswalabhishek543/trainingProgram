package training;
import java.util.InputMismatchException;
import java.util.Scanner;

import org.apache.log4j.Logger;

//Class
public class Palindrome 
{
	//Main method
	public static void main(String[] args)
	{
      final Scanner sca=new Scanner(System.in);
      final Logger printf=Logger.getLogger(Palindrome.class.getName());
      printf.info("Enter the Integer");
 
      
      try {
    	     
      Integer input=sca.nextInt();  //Taking input from terminal
      
      
            
      int rem;
      int sum=0;
      int temp;           //Initializing the variables
      temp=input;      
      
      while(input>0)             //Running while loop until number(input) is greater then zero
      {
    	 rem=input%10;    //Taking out the remainder of the number
    	 sum=sum*10+rem;  //Multiplying with 10 and adding remainder to obtain the reverse order 
    	 input=input/10;
    	  
      }
     
      
      if(sum==temp) //Checking the number is palindrome or not
      {printf.info("true");}
      
      else  
      {printf.info("false");}
   
      }
      
      catch(InputMismatchException e)
      {
    	  printf.info("Input is not correct, Enter integers only ");
    	  
      }
  sca.close();
		
	}
	
	

}
