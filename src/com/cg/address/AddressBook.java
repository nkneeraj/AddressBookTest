package com.cg.address;

import java.util.*;

public class AddressBook {

	public List<Contact> book = new ArrayList<Contact>();

	public void addContact(Contact newContact) {
		book.add(newContact);
		System.out.println("New contact Added successfully with the first name: "+newContact.firstName);
	}
}
