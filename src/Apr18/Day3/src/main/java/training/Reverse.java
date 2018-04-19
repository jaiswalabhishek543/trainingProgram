package training;

import java.util.StringTokenizer;

import org.apache.log4j.Logger;
/*
 * Reverse of string
 * 
*/
public class Reverse {
	
//Main Method
public static void main(final String[] args)
{
	
	//Used StringTokenizer to treat  sub-strings of string as tokens
	final Logger printf=Logger.getLogger(Reverse.class.getName());
    final String inputStr1="Lets's take LeetCode contest";
	 
	isReverse(inputStr1);
    
    
    
}	
	           
	 /*Iterate until we are not done with each token,returns true if at
	  least one token is available in string 
	  */	
public static String isReverse(String inputStr)
{
	String str1="";
    StringBuffer xyz;
	final StringTokenizer tokens = new StringTokenizer(inputStr);
	while (tokens.hasMoreTokens())  
	{
		xyz = new StringBuffer (tokens.nextToken());
		
		str1=str1+(xyz.reverse() + " ");
	
    }
	return str1;
	
}	

	
	
	

}
