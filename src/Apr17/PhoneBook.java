import java.awt.List;
import java.util.ArrayList;
import java.util.Scanner;



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
			
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args)
	{   //Creating list of Phonebook
		Scanner sc=new Scanner(System.in);
		ArrayList<Pbook> list=new ArrayList<Pbook>();
		int k;
		
		System.out.println("Select from menu");
		System.out.println("1.Add Data");
		System.out.println("2.Remove Data");
		System.out.println("3.Search by name");
		System.out.println("4.Search by id");
		System.out.println("5.Search by mobile no");
		
		k=sc.nextInt();
		switch(k)
		{
			case 1:
				System.out.println("Enter your id");
			    int a=sc.nextInt();
				System.out.println("Enter your first name");
				String f=sc.nextLine();
				System.out.println("Enter your last name");
			    String l=sc.nextLine();
			    System.out.println("Enter your mobile no.");
			    int b=sc.nextInt();
			    list.add(new Pbook(a,f,l,b));
			    break;
			case 2:
				System.out.println("Enter the index to remove data");
				int ab=sc.nextInt();
				list.remove(ab);
				break;
			case 3:
				System.out.println("Enter the First name or Last name for data");
				break;
			case 4:
				System.out.println("Enter id to look for data");
				break;
			case 5:
				System.out.println("Enter mobile number to look for data");
				break;


				

			    
			    
			    
			    
			
			
		}
		
		
		
	}
	
	
	

}
