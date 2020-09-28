package com.cg.address;

import java.util.*;

public class AddressBook {

	public List<Contact> book = new ArrayList<Contact>();

	public void addContact(Contact newContact) {
		book.add(newContact);
		System.out.println("New contact Added successfully with the first name: " + newContact.firstName);
	}

	public void DisplayContact(Contact contact) {
		System.out.println(contact);
	}

	public void updateContact(String firstName) {
		int update = 0;
		int count = 0;
		String newFirstName = firstName;
		Scanner sc = new Scanner(System.in);
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
			}
			DisplayContact(oldContact);
		}
	}
}