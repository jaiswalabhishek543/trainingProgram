package training;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.InputMismatchException;
import java.util.Scanner;

import org.apache.log4j.Logger;

/*
 * Phone book
 * 
 * Creating phonebook that consist user first name, last name ,mobile number and id
 * and using mobile no., name, id to look or remove data from phone book
 * 
 */


class Pbook{
	
	String fname,lname;
	Integer phoneno,id;
	
	public Pbook(Integer i,String fname,String lname,Integer p)
	{
		this.id=i;
		this.fname=fname;
		this.lname=lname;
		this.phoneno=p;
		
	}
	// Used to print details 
    public String toString()
    {
        return this.fname + " " + this.lname +
                           " " + this.phoneno+" "+this.id;
    }

	
	
	
}



class Sortbyname implements Comparator<Pbook>
{
    // Used for sorting in ascending order of name
    public int compare(Pbook a, Pbook b)
    {
        return a.fname.compareTo(b.fname);
    }
}






public class PhoneBook {
			
	
	public static void main(String[] args) throws IOException
	{   
		//Creating list of Phonebook
		final Scanner sca=new Scanner(System.in);
		final ArrayList<Pbook> list=new ArrayList<Pbook>();
		final Logger print=Logger.getLogger(Palindrome.class.getName());
		int k;
		
    char a1;
try {
    do {	
	  //Printing the menu
	
    	print.info("Select from menu");
    	print.info("1.Add Data");
    	print.info("2.Remove Data");
    	print.info("3.Search by name");
    	print.info("4.Search by id");
    	print.info("5.Search by mobile no");
    	print.info("6.Sort the list in ascending order of first name");
		
		k=sca.nextInt();
		switch(k)
		{
		
          //Adding details		
			case 1:
				print.info("Enter your id");
			    final int a=sca.nextInt();
				print.info("Enter your first name");
				final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

				final String f = br.readLine();
				print.info("Enter your last name");
				final BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
				final String l = br1.readLine();
				print.info("Enter your 10 digits mobile no.");
			    final int b=sca.nextInt();
			    list.add(new Pbook(a,f,l,b));
			   // System.out.println(list.size());
			    print.info("Data added and size of phone book size is "+list.size());
			    break;
			
			//Using Mobile number to remove data
			case 2:
				print.info("Enter the mobile number to remove data");
				final int num=sca.nextInt();
				int l1=0;
				for(Pbook o:list)
				{
					if(o.phoneno==num)
					{
						print.info("Data removed for "+o.fname+" "+o.lname);

						list.remove(o);
						l1++;
					}
					
				}
			if(l1==0)
			{
				print.info("Data not found");
				
			}
				break;
			
			//Using first name or last name to fetch data
			case 3:
				print.info("Enter the First name or Last name for data");
				final BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
				final String n1 = br2.readLine();		
				int l2=0;
				for(Pbook o2:list)
				{
					if(o2.lname.equalsIgnoreCase(n1) || o2.fname.equalsIgnoreCase(n1))
					{
						print.info("First name: "+o2.fname+", "+"Last name: "+o2.lname+", "+"Phone no. : "+o2.phoneno+", "+"Id"+o2.id);
                        l2++;					
					}
				}
				
				if(l2==0)
				{
					print.info("Data not found");
					
				}
				
				
				break;
			
				//Using id to look for data
			case 4:
				print.info("Enter id to look for data");
				final Integer n4=sca.nextInt();
				int l3=0;
				for(Pbook o3:list)
				{
					if(o3.id.equals(n4))
					{
						print.info("First name: "+o3.fname+", "+"Last name: "+o3.lname+", "+"Phone no. : "+o3.phoneno+", "+"Id : "+o3.id);
                        l3++;					
					}
				}
				
				if(l3==0)
				{
					print.info("Data not found");
					
				}
				
				break;
			
				//Using mobile number to look for data	
			case 5:
				print.info("Enter 10 digits mobile number to look for data");
				int l4=0;
				final Integer n5=sca.nextInt();
				for(Pbook o4:list)
				{
					if(o4.phoneno.equals(n5))
					{
						print.info("First name: "+o4.fname+", "+"Last name: "+o4.lname+", "+"Phone no. : "+o4.phoneno+", "+"Id : "+o4.id);
					l4++;
					}
				}
				if(l4==0)
				{
					print.info("Data not found");
					
				}
				break;
			//Sorting List in ascending order	
			case 6:
				print.info("Sorted List->");
				if(list.size()>0)
				{
					Collections.sort(list, new Sortbyname());
					 
			        //System.out.println("\nSorted by name");
			        for (int i1=0; i1<list.size(); i1++)
			        	print.info(list.get(i1));
					
					
				}
				else
				{
					print.info("Empty List");

				}
				break;
            default :
            	print.info("Invalid Input");

				

		}
             		
		print.info("If you want to continue enter(Y/y)");
		a1=sca.next().charAt(0);
		
	}while(a1=='y' ||a1=='Y');
   }catch (InputMismatchException e) {
	   print.info("Enter write input, try again");
   }
sca.close();
}
	
	
	

}
