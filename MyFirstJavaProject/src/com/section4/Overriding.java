package com.section4;

/**
 * Overriding - Mechanism to modify/replace an existing function of the base
 * class.
 */

class Person {
	private String name;

	public void setName(String name) {
		this.name = name;
	}

	public void print() {
		System.out.println("name is - " + name);
	}
}

class Contacts extends Person {
	private String address;

	public void setaddress(String address) {
		this.address = address;
	}
//@override                  
	public void print() {
		super.print(); // OVERRIDE
		//System.out.println("Address" + address);
	}
}

public class Overriding {

	public static void main(String[] args) {
		Person p1 = new Person();
		p1.setName("a");
		p1.print();

		Contacts c1 = new Contacts();
		c1.setName("b");
		c1.setaddress("trichy");
		c1.print();
	}

}
