package Training;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Palindrome 
{
	public static void main(String[] args)
	{
      Scanner sc=new Scanner(System.in);  
      System.out.println("Enter the Integer");
 
      
      try {
    	     
      Integer input=sc.nextInt();  //Taking input from terminal
      
      
            
      int r,sum=0,temp;           //Initializing the variables
      temp=input;      
      
      while(input>0)             //Running while loop until number(input) is greater then zero
      {
    	 r=input%10;    //Taking out the remainder of the number
    	 sum=(sum*10)+r;  //Multiplying with 10 and adding remainder to obtain the reverse order 
    	 input=input/10;
    	  
      }
     
      
      if(sum==temp) //Checking the number is palindrome or not
      {System.out.println("true");}
      
      else  
      {System.out.println("false");}
		
          }
      
      catch(InputMismatchException e)
      {
    	  System.out.println("Input is not correct, Enter integers only ");
    	  
      }

		
	}
	
	

}
