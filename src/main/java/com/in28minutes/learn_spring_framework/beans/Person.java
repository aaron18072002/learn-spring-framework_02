package com.in28minutes.learn_spring_framework.beans;

public class Person {
	private String name;
	private int age;
	private Address address = null;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public Person(String name, int age, Address address) {
		this.name = name;
		this.age = age;
		this.address = address;
	}
	
	public Address getAddress() {
		return this.address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return String.format("[name: %s, age: %d], address: %s", 
				this.getName(), this.getAge(), 
				this.getAddress() != null ? this.getAddress().toString() : "");
	}
}
