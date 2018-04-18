package training;

import java.util.StringTokenizer;

import org.apache.log4j.Logger;

//Reverse
public class Reverse {
	
//Main Method
public static void main(final String[] args)
{
	
	//Used StringTokenizer to treat  sub-strings of string as tokens
	final Logger printf=Logger.getLogger(Reverse.class.getName());
    final String inputStr="Lets's take LeetCode contest";
	final StringTokenizer tokens = new StringTokenizer(inputStr); 
	
	
	StringBuffer xyz;                                        

	 /*Iterate until we are not done with each token,returns true if at
	  least one token is available in string 
	  */	                             
	while (tokens.hasMoreTokens())  
	{
		xyz = new StringBuffer (tokens.nextToken());  
		printf.info(xyz.reverse() + " ");
    }
	
	
	
}
	
	
	

}
