package com.springcore.ci;

public class Person {
	
	private String name;
	private int personId;
	
	public Person(String name,int id){
		this.name = name;
		this.personId = id;
	}

	@Override
	public String toString() {
		return "Person [name=" + this.name + ", personId=" + this.personId + "]";
	}
	
	

}
