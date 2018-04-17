
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
    	public boolean isPalindrome();
    }
	
	public static void main(String[] args)
	{   int n = 14; 
		
		//lamda expression for checking odd number
		OddCheck chk1=(num)->
		{
			if(n%2 == 0)
			{
				return false;
			}
			else return true;
		};
		System.out.println("n odd : "+chk1.isOdd(n));
		
		//lamda expression for checking number is prime or not
		PrimeCheck prime=(num)->{
			for(int x=1;x<=(n/2);x++)
			{
				if(n%x ==0)
					return false;
			}
			return true;
			
		};
		
		System.out.println("N prime : "+prime.isPrime(n));
		
		
		//lamda expression for checking number is palindrome or not
	/*	
		PalindromeCheck palindrome= (num)->
		{
			int rem=0,rev=0;
			while(n>0)
			{
				rem=num%10;
				num=num/10;
				rev=rev*10+rem;
		
				if(n==rev)
				{
					return true;
				}
				else return false;
				
			}
		
			
			
		};
      System.out.println("N palindrome :"+palindrome.isPalindrome(n));
      */		
	}
	
	
	
}
