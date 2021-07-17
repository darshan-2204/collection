package com.website.deepclonemethod.parent;

public class Lift implements Cloneable {
	public String brand;
	public int capacity;
	public boolean working;

	public Lift(String brand, int capacity, boolean working) {
		this.brand = brand;
		this.capacity = capacity;
		this.working = working;
	}

	@Override
	public Lift clone() throws CloneNotSupportedException {
		System.out.println("invoking clone method");
		return (Lift) super.clone();
	}

	public void displayInfo() {
		System.out.println("Brand:" + this.brand);
		System.out.println("Capacity:" + this.capacity);
		System.out.println("Working:" + this.working);
	}

}
