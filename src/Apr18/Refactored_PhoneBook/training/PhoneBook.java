package com.training;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Scanner;

public class PhoneBook {

	static Scanner sc = new Scanner(System.in);
	static ArrayList<Pbook> list = new ArrayList<Pbook>();

	private static Integer addDetail() throws IOException {
		System.out.println("Enter your id");
		int a = sc.nextInt();
		System.out.println("Enter your first name");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String f = br.readLine();
		System.out.println("Enter your last name");
		BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
		String l = br1.readLine();
		System.out.println("Enter your 10 digits mobile no.");
		int b = sc.nextInt();
		list.add(new Pbook(a, f, l, b));
		// System.out.println(list.size());
		System.out.println("Data added and size of phone book size is " + list.size());
       return 1;
	}

	// Using mobile number to remove data
	private static Integer remove() {
		System.out.println("Enter the mobile number to remove data");
		int num = sc.nextInt();
		int l1 = 0;
		for (Pbook o : list) {
			if (o.phoneno == num) {
				System.out.println("Data removed for " + o.fname + " " + o.lname);

				list.remove(o);
				l1++;
			}

		}

		if (l1 == 0) {
			System.out.println("Data not found");

		}
       return 1;
	}

	// Using first name to fetch data
	private static Integer fNameData() throws IOException {
		System.out.println("Enter the First name or Last name for data");
		BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
		String n1 = br2.readLine();
		int l2 = 0;
		for (Pbook o2 : list) {
			if (o2.lname.equalsIgnoreCase(n1) || o2.fname.equalsIgnoreCase(n1)) {
				System.out.println("First name: " + o2.fname + ", " + "Last name: " + o2.lname + ", " + "Phone no. : "
						+ o2.phoneno + ", " + "Id" + o2.id);
				l2++;
			}
		}

		if (l2 == 0) {
			System.out.println("Data not found");

		}
    return 1;
	}

	private static Integer idData() {
		System.out.println("Enter id to look for data");
		Integer n4 = sc.nextInt();
		int l3 = 0;
		for (Pbook o3 : list) {
			if (o3.id.equals(n4)) {
				System.out.println("First name: " + o3.fname + ", " + "Last name: " + o3.lname + ", " + "Phone no. : "
						+ o3.phoneno + ", " + "Id : " + o3.id);
				l3++;
			}
		}

		if (l3 == 0) {
			System.out.println("Data not found");

		}
     return 1;
	}
	
//Using Mobile number to fetch data
    private static Integer mData()
    {
    	System.out.println("Enter 10 digits mobile number to look for data");
		int l4 = 0;
		Integer n5 = sc.nextInt();
		for (Pbook o4 : list) {
			if (o4.phoneno.equals(n5)) {
				System.out.println("First name: " + o4.fname + ", " + "Last name: " + o4.lname + ", "
						+ "Phone no. : " + o4.phoneno + ", " + "Id : " + o4.id);
				l4++;
			}
		}
		
		if (l4 == 0) {
			System.out.println("Data not found");

		}
    	return 1;
    }
	
    
    private static Integer sort()
    {
    	System.out.println("Sorted List->");
		if (list.size() > 0) {
			Collections.sort(list, new Sortbyname());

			// System.out.println("\nSorted by name");
			for (int i1 = 0; i1 < list.size(); i1++)
				System.out.println(list.get(i1));

		} else {
			System.out.println("Empty List");

		}
    	return 1;
    }
	
	// Main Method
	public static void main(String[] args) throws IOException {

		int k;
		char a1;

		try {

			do {

				// Printing the menu

				System.out.println("Select from menu");
				System.out.println("1.Add Data");
				System.out.println("2.Remove Data");
				System.out.println("3.Search by name");
				System.out.println("4.Search by id");
				System.out.println("5.Search by mobile no");
				System.out.println("6.Sort the list in ascending order of first name");

				k = sc.nextInt();
				switch (k) {

				   // Adding details
				case 1:
					addDetail();

					break;

					// Using Mobile number to remove data
				case 2:
					remove();
					break;

					// Using first name or last name to fetch data
				case 3:
					fNameData();
					break;

					// Using id to look for data
				case 4:
					idData();
					break;

					// Using mobile number to look for data
				case 5:
					mData();
					break;
					// Sorting List in ascending order
				case 6:
					sort();
					break;
				default:
					System.out.println("Invalid Input");

				}

				System.out.println("If you want to continue enter(Y/y)");
				a1 = sc.next().charAt(0);

			} while (a1 == 'y' || a1 == 'Y');
		} catch (InputMismatchException e) {
			System.out.print("Enter write input, try again");
		}

	}

}
