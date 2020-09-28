package com.cg.address;

public class Contact {
	
	String firstName;
	String lastName;
	String address;
	String city;
	String state;
	int zipCode;
	
	public Contact(String firstName,String lastName,String address,String city,String state,int zipCode)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zipCode = zipCode;
	}

	@Override
	public String toString() {
		return "Contact [firstName=" + firstName + ", lastName=" + lastName + ", address=" + address + ", city=" + city
				+ ", state=" + state + ", zipCode=" + zipCode + "]";
	}
}
