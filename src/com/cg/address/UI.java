package com.cg.address;

import java. util.*;

public class UI{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to Address Book");
		
		AddressBook book = new AddressBook();
		
		System.out.println("Input 1 to Add a contact.");
		int input = sc.nextInt();
		if(input==1)
		{
			System.out.println("Enter first name"); sc.nextLine(); String firstName = sc.nextLine();
			System.out.println("Enter last name"); String lastName = sc.next();
			System.out.println("Enter address line"); sc.nextLine();  String address = sc.nextLine();
			System.out.println("Enter city name"); String city = sc.next();
			System.out.println("Enter state name"); String state = sc.next();
			System.out.println("Enter zip name"); int zipCode = sc.nextInt();
			
			Contact newContact = new Contact(firstName, lastName, address, city, state, zipCode);
			book.addContact(newContact);
		}
	
	}

}
