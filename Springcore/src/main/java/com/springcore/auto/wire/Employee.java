package com.springcore.auto.wire;

public class Employee {
	
	private Address address;

	@Override
	public String toString() {
		return "Employee [address=" + address + "]";
	}

	public Employee(Address address) {
		super();
		this.address = address;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

}
