package training;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import org.apache.log4j.Logger;

public class DescPalindromeSort {
	

	public static void checkPalindrome(String s)
	  {
	    // reverse the given String
	    final String reverse = new StringBuffer(s).reverse().toString();
	    final Logger printf=Logger.getLogger(DescPalindromeSort.class.getName());

	    // checking for palindrome
	    if (s.equals(reverse))
	    {  
	    	
	    		final List<String> myList = new ArrayList<String>();
	    		myList.add(reverse);
	    		Collections.sort(myList, Collections.reverseOrder());
	    		
	    		
	    		for(String str: myList){
	    			printf.info(str);
	    	   }
	    	
	    	
	    	      }
	    	
	    	
	    	
	    
	    	//System.out.println();
	    }
	
	
	
	
	
	
	public static void main(String[] args)
	{
		
		 
		checkPalindrome("12321");
	    checkPalindrome("121");
	    
		
		
	}

}
