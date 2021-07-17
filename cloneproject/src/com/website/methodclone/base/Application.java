package com.website.methodclone.base;

public class Application implements Cloneable {
	public String name;
	public String developer;
	public double version;

	@Override
	public Application clone() throws CloneNotSupportedException {
		System.out.println("invoking clone method");
		return (Application) super.clone();
	}

	public void displayInfo() {

		System.out.println(" Name:" + this.name);
		System.out.println(" Developer:" + this.developer);
		System.out.println("   Version:" + this.version);

	}
}
