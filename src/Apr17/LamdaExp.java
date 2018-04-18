/*
 * Lamda Expression
 * 
 * Using methods that return lamda expression performing specified action
 * 
 */
public class LamdaExp {
    
	//Functional Interface
	interface OddCheck{
   	public boolean isOdd(int num); 
    }
	
	//Functional Interface
    interface PrimeCheck{
    	 	public boolean isPrime(int num);
    }
    
  //Functional Interface
    interface PalindromeCheck
    {
    	public boolean isPalindrome(int num);
    }
	
    
	public static void main(String[] args)
	{   int n = 33; 
		
		//lamda expression for checking odd number
		OddCheck chk1=(num)->
		{
			if(n%2 == 0)
			{
				return false;
			}
			else return true;
		};
		System.out.println("n is odd : "+chk1.isOdd(n));
		
		//lamda expression for checking number is prime or not
		PrimeCheck prime=(num)->{
			for(int x=1;x<=(n/2);x++)
			{
				if(n%x ==0)
					return false;
			}
			return true;
			
		};
		
		System.out.println("n is prime : "+prime.isPrime(n));
		
		
		//lamda expression for checking number is palindrome or not
		
		PalindromeCheck palindrome= (num)->
		{
			int n1,t,rem=0,rev=0;
			n1=n;
			t=n1;
			while(n1>0)
			{
				rem=n1%10;
				n1=n1/10;
				rev=rev*10+rem;
			}
				if(t==rev)
				{
					return true;
				}
				else return false;
				
			
		
			
			
		};
      System.out.println("n is palindrome :"+palindrome.isPalindrome(n));
      		
	}
	
	
	
}
