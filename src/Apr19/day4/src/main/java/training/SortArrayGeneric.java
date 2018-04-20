package training;

import org.apache.log4j.Logger;

/*
 *  @author Abhishek
 */

public class SortArrayGeneric {
	/*
	 * Print Array
	 * 
	 * Using Generic Method printing array
	 */

	//Generic method
	final static Logger printf=Logger.getLogger(SortArrayGeneric.class.getName());

	public <E> Integer printArray(final E[] arr)
	{   

		int count=0;
		for(E i:arr)
		{
			//System.out.println(i);
			printf.info(i);
			count++;
		}
		return count;
	}

	//Main class
	public static void main(final String[] args)
	{	
		SortArrayGeneric sor=new SortArrayGeneric();
		final String[] arr1=new String[] {"apple","orange"};
		final Integer[] arr2=new Integer[] {1,2,3};
		sor.printArray(arr1);
		sor.printArray(arr2);


	}


}
