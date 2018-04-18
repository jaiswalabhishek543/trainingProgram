import java.awt.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

/*
 * Reorganize String
 * 
 *  
 */




public class ReorganizeString {
         public static void main(String[] args)
         {

    		 String input;
    		 //Creating ArrayList
    		 ArrayList<Character> ch = new ArrayList<>();
    	        Scanner scanner = new Scanner(System.in);
                  int y;
                  char temp;
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
                         System.out.println(" ");
                         System.exit(0);               	
                       }
                      
    	        }
    	       
    	       
    	       //Rearranging the characters
                     char[] c=input.toCharArray(); 	       
        	         for(int x=0;x<(j-1);x++)
        	         {  
        	     
        	        	 if(c[x]==c[x+1])
        	        	 {
        	        		 continue;
        	        	 }
        	        	 else
        	        	 {
        	        		 y=x+1;
        	        		 temp=c[x];
        	        		 c[x]=c[y];
        	        		 c[y]=temp;
        	        		 
        	        		 
        	        		 
        	        	 }
        	            
        	         }
        	
    	        
    	        String str=String.valueOf(c);
    	     
    	       System.out.println("String - "+str);
        	 
         }
}
