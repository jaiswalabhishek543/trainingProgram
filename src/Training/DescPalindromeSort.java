package Training;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class DescPalindromeSort {
	

	public static void checkPalindrome(String s)
	  {
	    // reverse the given String
	    String reverse = new StringBuffer(s).reverse().toString();
	 
	    // checking for palindrome
	    if (s.equals(reverse))
	    {  
	    	
	    		List<String> myList = new ArrayList<String>();
	    		myList.add(reverse);
	    		Collections.sort(myList, Collections.reverseOrder());
	    		
	    		
	    		for(String str: myList){
	    			System.out.println(str);
	    	   }
	    	
	    	
	    	      }
	    	
	    	
	    	
	    
	    	System.out.println();
	    }
	
	
	
	
	
	
	public static void main(String[] args)
	{
		
		
		checkPalindrome("12321");
	    checkPalindrome("121");
	    
		
		
	}

}
