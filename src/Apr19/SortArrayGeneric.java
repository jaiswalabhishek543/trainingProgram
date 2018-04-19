package day4;

/*
 *@abhi 
 */

public class SortArrayGeneric {
	/*
	 * Print Array
	 * 
	 * Using Generic Method printing array
	 */
	
	//Generic method
	public static <E> void printArray(E[] arr)
	{
		for(E i:arr)
		{
			System.out.println(i);
		}
		
	}
	
	//Main class
	public static void main(String[] args)
	{
		String[] arr1=new String[] {"apple","orange"};
		Integer[] arr2=new Integer[] {1,2,3};
		printArray(arr1);
		printArray(arr2);
		
		
	}
	

}
