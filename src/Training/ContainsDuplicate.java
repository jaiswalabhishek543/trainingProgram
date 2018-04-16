package Training;

public class ContainsDuplicate {
	
	public static boolean DuplicateInString(String[] arr)
	{    
		int i=arr.length;                       /* This method is going to check duplicates in
		                                                 String Array*/
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
	
	public static boolean DuplicateInInteger(Integer[] arr)
	{    
		int i=arr.length;        /* This method is going to check duplicates in
                                      Integer Array*/

		
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

	
	
	
	public static void main(String[] args)
	{
		String[] arr1 = new String[] {"Apple", "Banana", "Orange", "Grapes", "Apple"};
		Integer[] arr2 = new Integer[] {1,2,3,4,5};
		System.out.println(DuplicateInString(arr1));
		System.out.println(DuplicateInInteger(arr2));
		
		
	}
	
	

}
