package com.website.deepclonemethod.parent;

public class Amazon implements Cloneable {
	public String country;
	public String founded;
	public Address address;

	public Amazon(String country, String founded, Address address) {
		this.country = country;
		this.founded = founded;
		this.address = address;

	}

	@Override
	public Amazon clone() throws CloneNotSupportedException {
		System.out.println("invoking clone method");
		Amazon cloneRef = (Amazon) super.clone();
		if (this.address != null) {
			cloneRef.address = address.clone();
		}
		return cloneRef;
	}

	public void displayProperties() {

		System.out.println("Country:"+this.country);
		System.out.println("Founded:"+this.founded);
		
		if (this.address != null) {
			this.address.displayInfo();
		}

	}

}
