package training;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

import org.apache.log4j.Logger;

/*
 * Reorganize String
 * 
 *  For given String checking if letters can be rearranged so that characters that are adjacent 
 *  to each other are not same
 */

public class ReorganizeString {
         public static void main(final String[] args)
         {
        	 final Logger printf=Logger.getLogger(ReorganizeString.class.getName());
    		 String input;
    		 int count1=0;
    		 //Creating ArrayList
    		    final ArrayList<Character> ch1 = new ArrayList<Character>();
    	        final Scanner scanner = new Scanner(System.in);
                  int y;
                  char temp;
                  char temp1;
    	        printf.info("Please enter the string: ");
    	        input = scanner.nextLine();
    	        
                final int j=input.length();
    	        for(int i = 0; i <j ; i++) {
    	            ch1.add(input.charAt(i)); 
    	        }
    	        
    	        final Iterator itr=ch1.iterator();  
    	       
    	        
    	        /*Checking if any number is repeating itself more than half of total number of digits
    	          then we can not arrange the in required order(valid for any range of number)
    	        */
    	       while(itr.hasNext())
    	        {  
    	    	  final int x11= Collections.frequency(ch1,itr.next());
                       if(x11>((j+1)/2))
                       {
                         count1++;
                         printf.info(" ");
                         break;
                       }
                      
    	        }
    	       
    	       
    	       //Rearranging the characters so that two matching characters do not remain adjacent
    	       //(Mainly for 3 characters string)
    	       if(count1==0)
    	       {   
                     char[] c=input.toCharArray(); 	       
        	         for(int x=0;x<(j-1);x++)
        	         {  
        	     
        	        	 if(c[x]!=c[x+1])
        	        	 {
        	        		 final int z11=x+2;
        	        		
        	        		 if(c[x+1]==c[z11])
        	        		 {
        	        			 temp1=c[z11];
        	        			 c[z11]=c[x];
        	        			 c[x]=c[z11];
        	        			 
        	        		 }
        	        		 final String str=String.valueOf(c);    	        	     
        	      	         printf.info("String - "+str);
        	        		 break;
        	        	 }
        	        	 else if(c[x]==c[x+1])
        	        	 {
        	        		 y=x+2;
        	        		 temp=c[x+1];
        	        		 c[x+1]=c[y];
        	        		 c[y]=temp;
        	        		 
        	        		 final String str=String.valueOf(c);
           	      	         printf.info("String - "+str);
          	        		 break;
        	        		 
        	        	 }
        	        	 
        	         }
        	         
               }    
        	
             scanner.close();  
         	 
         }
}
