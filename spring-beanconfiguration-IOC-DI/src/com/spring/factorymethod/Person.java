package com.spring.factorymethod;

public class Person {
	
	private int id;
	private String name;
	private int taxId;
	private Address address;
	
	public Person() {
		
	}
	public static Person getInstance(int id, String name) {
		System.out.println("Creating Person using factory method.");
		return new Person(id, name);
	}
	
	public Person(int id, String name) {
		this.id = id;
		this.name = name;
	}


	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", address=" + address + "]";
	}

	
}
