package com.cg.address;

import java.util.*;

public class UI {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to Address Book");

		AddressBook book = new AddressBook();
		
		
		int input = 1;
		while(input != 0) {
			System.out.println("Input 0 For no action.");
			System.out.println("Input 1 to Add a contact.");
			System.out.println("Input 2 to update an existing contact");
			input = sc.nextInt();
			switch(input) {
			case 1:
				System.out.println("Enter first name");
				sc.nextLine();
				String firstName = sc.nextLine();
				System.out.println("Enter last name");
				String lastName = sc.next();
				System.out.println("Enter address line");
				sc.nextLine();
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
				sc.nextLine();
				String searchName = sc.nextLine();
				book.updateContact(searchName);
			}
		}
	}
}
