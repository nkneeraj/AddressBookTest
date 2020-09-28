package com.cg.address;

import java.util.*;

public class AddressBook {
	
	private String bookName = null;
	public AddressBook(String bookName)
	{
		this.bookName= bookName;
	}
	
	public String getName()
	{
		return bookName;
	}
	
	public void setName(String bookName)
	{
		this.bookName = bookName;
	}

	public List<Contact> book = new ArrayList<>();
	
	public List<Contact> getBook()
	{
		return book;
	}
	
	public void setBook(List<Contact> book)
	{
		this.book = book;
	}
	
	public void displayBook(List<Contact> book)
	{
		for(Contact oldContact : book)
		{
			System.out.println(oldContact);
		}
	}
	public void addContact(Contact newContact) {
		book.add(newContact);
		System.out.println("New contact Added successfully with the first name: " + newContact.firstName);
	}	

	public String updateContact(String firstName) {
		String newFirstName = firstName;
		Scanner sc = new Scanner(System.in);
		int contactPresent = 0;
		for (Contact oldContact : book) {
			if (oldContact.firstName.equals(newFirstName)) {
				int input = 1;
				while (input != 0) {
					System.out.println("Input 0: No more changes");
					System.out.println("Input 1: Update last name for");
					System.out.println("Input 2: Update address for");
					System.out.println("Input 3: Enter city for");
					System.out.println("Input 4: Enter state for");
					System.out.println("Input 5: Enter zip code for");
					input = sc.nextInt();
					sc.nextLine();
					switch (input) {
					case 0:
						System.out.println("No need of update");
						break;

					case 1:
						System.out.println("Enter the new last name");
						oldContact.lastName = sc.nextLine();
						System.out.println("Updated Last Name: " + oldContact.lastName);
						break;

					case 2:
						System.out.println("Enter the new address line");
						oldContact.address = sc.nextLine();
						System.out.println("Updated Last Name: " + oldContact.address);
						break;

					case 3:
						System.out.println("Enter the new city");
						oldContact.city = sc.nextLine();
						System.out.println("Updated Last Name: " + oldContact.city);
						break;

					case 4:
						System.out.println("Enter the state");
						oldContact.state = sc.nextLine();
						System.out.println("Updated Last Name: " + oldContact.state);
						break;

					case 5:
						System.out.println("Enter the new zipCode");
						oldContact.zipCode = sc.nextInt();
						sc.nextLine();
						System.out.println("Updated Last Name: " + oldContact.zipCode);
						break;
					}
				}
				contactPresent =1;
			}			
		}
		if(contactPresent == 1)
			return "Contact Updated";
		else
			return "No contact found with this name";
	}

	public void deleteContact(String firstName) {
		int contactPresent = 0;
		for (Contact oldContact : book) {
			if (oldContact.firstName.equals(firstName)) {
				book.remove(oldContact);
				contactPresent=1;
			}
			if(contactPresent==1)
			{
				System.out.println("Contact Deleted successfully");
			}
		}
		if(contactPresent==0)
		{
			System.out.println("There's no such contact with the first name: "+firstName);
		}
		displayBook(book);
	}
	public boolean hasContact(String firstName) {
		for(Contact x : book) {
			if(x.firstName.equalsIgnoreCase(firstName)) {
				return true;
			}
		}
		return false;
	}
}