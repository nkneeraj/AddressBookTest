package com.cg.address;

import java.util.*;

public class UI {
	public void function(AddressBook book) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to Address Book");
			
		int input = 1;
		while(input != 0) {
			System.out.println("Input 0 For no action.");
			System.out.println("Input 1 to Add a contact.");
			System.out.println("Input 2 to update an existing contact");
			System.out.println("Input 3 to delete an existing contact");
			
			input = sc.nextInt();sc.nextLine();
			switch(input) {
			case 1:
				System.out.println("Enter first name");
				String firstName = sc.nextLine();
				if(book.hasContact(firstName))
				System.out.println("Enter last name");
				String lastName = sc.nextLine();
				System.out.println("Enter address line");
				String address = sc.nextLine();
				System.out.println("Enter city name");
				String city = sc.nextLine();
				System.out.println("Enter state name");
				String state = sc.next();
				System.out.println("Enter zip name");
				int zipCode = sc.nextInt();
				sc.nextLine();
				Contact newContact = new Contact(firstName, lastName, address, city, state, zipCode);
				book.addContact(newContact);
				break;
			case 2:
				System.out.println("Input first name of person");
				String searchName = sc.nextLine();
				book.updateContact(searchName);
				break;	
			case 3:
				System.out.println("Input first name of the contact you want to delete");
				String Name = sc.nextLine();
				book.deleteContact(Name);
				break;
			}
		}
	}
}
