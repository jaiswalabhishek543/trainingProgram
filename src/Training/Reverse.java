package Training;

import java.util.StringTokenizer;

public class Reverse {
	
public static void main(String[] args)
{
	
	
	String inputStr="Lets's take LeetCode contest";
	StringTokenizer tokens = new StringTokenizer(inputStr); /*Used StringTokenizer to treat 
	                                                        sub-strings of string as tokens*/
	StringBuffer x;                                        

	while (tokens.hasMoreTokens())   /*Iterate until we are not done with each token,returns true
		                             if at least one token is available in string*/	                             
	{
		x = new StringBuffer (tokens.nextToken());  
		System.out.print(x.reverse() + " ");
    }
	
	
	
}
	
	
	

}
