import java.awt.List;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.text.html.HTMLDocument.Iterator;

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

	
	
	
}

public class PhoneBook {
			
	
	public static void main(String[] args) throws IOException
	{   
		//Creating list of Phonebook
		Scanner sc=new Scanner(System.in);
		ArrayList<Pbook> list=new ArrayList<Pbook>();
		int k;
		
    char a1;
do {	
	  //Printing the menu
	
	    System.out.println("Select from menu");
		System.out.println("1.Add Data");
		System.out.println("2.Remove Data");
		System.out.println("3.Search by name");
		System.out.println("4.Search by id");
		System.out.println("5.Search by mobile no");
		
		k=sc.nextInt();
		switch(k)
		{
		
          //Adding details		
			case 1:
				System.out.println("Enter your id");
			    int a=sc.nextInt();
				System.out.println("Enter your first name");
				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

				String f = br.readLine();
				System.out.println("Enter your last name");
				BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
				String l = br1.readLine();
			    System.out.println("Enter your 10 digits mobile no.");
			    int b=sc.nextInt();
			    list.add(new Pbook(a,f,l,b));
			   // System.out.println(list.size());
			    System.out.println("Data added and size of phone book is "+list.size());
			    break;
			
			//Using Mobile number to remove data
			case 2:
				System.out.println("Enter the mobile number to remove data");
				int num=sc.nextInt();
				int l1=0;
				for(Pbook o:list)
				{
					if(o.phoneno==num)
					{
						System.out.println("Data removed for "+o.fname+" "+o.lname);

						list.remove(o);
						l1++;
					}
					
				}
			if(l1==0)
			{
				System.out.println("Data not found");
				
			}
				break;
			
			//Using first name or last name to fetch data
			case 3:
				System.out.println("Enter the First name or Last name for data");
				BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
				String n1 = br2.readLine();		
				int l2=0;
				for(Pbook o2:list)
				{
					if(o2.lname.equalsIgnoreCase(n1) || o2.fname.equalsIgnoreCase(n1))
					{
						System.out.println("First name: "+o2.fname+", "+"Last name: "+o2.lname+", "+"Phone no. : "+o2.phoneno+", "+"Id"+o2.id);
                        l2++;					
					}
				}
				
				if(l2==0)
				{
					System.out.println("Data not found");
					
				}
				
				
				break;
			
				//Using id to look for data
			case 4:
				System.out.println("Enter id to look for data");
				int n4=sc.nextInt();
				int l3=0;
				for(Pbook o3:list)
				{
					if(o3.id==n4)
					{
						System.out.println("First name: "+o3.fname+", "+"Last name: "+o3.lname+", "+"Phone no. : "+o3.phoneno+", "+"Id : "+o3.id);
                        l3++;					
					}
				}
				
				if(l3==0)
				{
					System.out.println("Data not found");
					
				}
				
				break;
			
				//Using mobile number to look for data	
			case 5:
				System.out.println("Enter 10 digits mobile number to look for data");
				int l4=0;
				int n5=sc.nextInt();
				for(Pbook o4:list)
				{
					if(o4.phoneno==n5)
					{
						System.out.println("First name: "+o4.fname+", "+"Last name: "+o4.lname+", "+"Phone no. : "+o4.phoneno+", "+"Id : "+o4.id);
					l4++;
					}
				}
				if(l4==0)
				{
					System.out.println("Data not found");
					
				}
				break;
            default:
            	System.out.println("Invalid Input");

				

		}
             		
		System.out.println("If you want to continue enter(Y/y)");
		a1=sc.next().charAt(0);
		
	}while(a1=='y' ||a1=='Y');
}
	
	
	

}
