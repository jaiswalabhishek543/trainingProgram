package Training;

import java.util.Scanner;

public class DescPalindromeSort {
	
	public static void main(String[] args)
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 10 inputs");
		String[] arr=new String[10];
		int[] intarr=new int[10];
		int count=0;
		String rev="";
		for(int i=0;i<10;i++) 
		{
			arr[i]=sc.nextLine();   //Taking 10 inputs from user
			
			
		}
		
		
		//Checking for the palindrome in the inputs 
		for(int j=0;j<10;j++)  
		{
			int len = arr[j].length();
			 
		      for ( int k = len - 1; k >= 0; k-- )
		         rev = rev + arr[j].charAt(k);
		 
		      if (arr[j].equals(rev))
		      {
		    	  intarr[count]=j;
		    	  count++;
		      }
	
			
		}
		
		
		
		
		
		String[] arr2=new String[count];
		int n=0;
		if(count>0)
		{
			for(int x=0;x<=count;x++)
			{
				arr2[n]=arr[intarr[x]];
				n++;
			}
			
			
			
			
		}
		
		
		//Sort the array of string
		 for(int y=1;y<=count;y++)
		{
			String temp = arr2[y];

			int z = y - 1;
			while (z >= 0 && temp.length() < arr2[z].length())
			{
				arr2[z+1] = arr2[z];
				z--;
			}
			arr2[z+1] = temp;
		}
		 
		 
			for (int m=0; m<=count; m++)
				{System.out.println(arr2[m]);}
		
		
		
		
		
		
	}

}
