import java.awt.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

/*
 * Reorganize String
 * 
 *  For given String checking if letters can be rearranged so that characters that are adjacent 
 *  to each other are not same
 */

public class ReorganizeString {
         public static void main(String[] args)
         {

    		 String input;
    		 int count1=0;
    		 //Creating ArrayList
    		    ArrayList<Character> ch = new ArrayList<>();
    	        Scanner scanner = new Scanner(System.in);
                  int y;
                  char temp,temp1;
    	        System.out.print("Please enter the string: ");
    	        input = scanner.nextLine();
    	        
                int j=input.length();
    	        for(int i = 0; i <j ; i++) {
    	            ch.add(input.charAt(i)); 
    	        }
    	        
    	        Iterator itr=ch.iterator();  
    	       
    	        
    	        /*Checking if any number is repeating itself more than half of total number of digits
    	          then we can not arrange the in required order(valid for any range of number)
    	        */
    	       while(itr.hasNext())
    	        {  
    	    	  int x= Collections.frequency(ch,itr.next());
                       if(x>((j+1)/2))
                       {
                         count1++;             	
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
        	        		 int z=x+2;
        	        		
        	        		 if(c[x+1]==c[z])
        	        		 {
        	        			 temp1=c[z];
        	        			 c[z]=c[x];
        	        			 c[x]=c[z];
        	        			 
        	        		 }
        	        		 String str=String.valueOf(c);    	        	     
        	      	         System.out.println("String - "+str);
        	        		 break;
        	        	 }
        	        	 else if(c[x]==c[x+1])
        	        	 {
        	        		 y=x+2;
        	        		 temp=c[x+1];
        	        		 c[x+1]=c[y];
        	        		 c[y]=temp;
        	        		 
        	        		 String str=String.valueOf(c);
           	      	         System.out.println("String - "+str);
          	        		 break;
        	        		 
        	        	 }
        	        	 
        	         }
        	         
               }    
        	
               System.out.println(" ");
         	 
         }
}
