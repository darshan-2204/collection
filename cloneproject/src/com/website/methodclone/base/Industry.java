package com.website.methodclone.base;

import com.website.methodclone.constants.*;

public class Industry  implements Cloneable {
	public String name;
	public IndustryType type;
	public double noOfEmpolye;

	@Override
	public Industry clone() throws CloneNotSupportedException {
		System.out.println("invoking clone method");
		return (Industry) super.clone();
	}

	public void displayInfo() {

		System.out.println(" Name:" + this.name);
		System.out.println(" IndustryType:" + this.type);
		System.out.println(" NoOfEmpolye:" + this.noOfEmpolye);

	}
}
