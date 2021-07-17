package com.website.deepclonemethod.parent;

public class Address implements Cloneable {

	public int pinCode;
	public String city;

	public Address(int pinCode, String city) {
		this.pinCode = pinCode;
		this.city = city;
	}

	@Override
	public Address clone() throws CloneNotSupportedException {
		System.out.println("invoking clone method");
		return (Address) super.clone();
	}

	public void displayInfo() {
		System.out.println("PinCode:" + this.pinCode);
		System.out.println("City Name:" + this.city);
	}
}
