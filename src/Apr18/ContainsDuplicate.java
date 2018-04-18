package training;

import org.apache.log4j.Logger;

//Class
public class ContainsDuplicate {
	
	// This method is going to check duplicates in String Array
	public static boolean duplicateInString(String[] arr)
	{    
	    final int i=arr.length;                       
		for(int j=0;j<=(i-1);j++)
		{
			
			for(int k=j+1;k<=(i-1);k++)
			{	
				if(arr[j]==arr[k])
				{
					return true;
					
				}
				
			}	
				
		}
		
		
		return false;
		
	}
	
	 // This method is going to check duplicates in Integer Array
	public static boolean duplicateInInteger(Integer[] arr)
	{    
		final int i=arr.length;       

		
		for(int j=0;j<=(i-1);j++)
		{
			
			for(int k=(j+1);k<=(i-1);k++)
			{	
				if(arr[j]==arr[k])
				{
					return true;
					
				}
				
			}	
				
		}
		
		
		return false;
		
	}

	
	
	
	public static void main(final String[] args)
	{
		final Logger printf=Logger.getLogger(ContainsDuplicate.class.getName());
		final String[] arr1 = new String[] {"Apple", "Banana", "Orange", "Grapes", "Apple"};
		final Integer[] arr2 = new Integer[] {1,2,3,4,5};
		printf.info(duplicateInString(arr1));
		printf.info(duplicateInInteger(arr2));
		
		
	}
	
	

}
