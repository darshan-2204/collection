package com.website.methodclone.base;

public class Language implements Cloneable {
public String name;
public String region;
public int old;

@Override
public Language clone() throws CloneNotSupportedException {
	System.out.println("invoking clone method");
	return (Language) super.clone();
}

public void displayInfo() {
	
	System.out.println(" Name:" + this.name);
	System.out.println(" region:" + this.region);
	System.out.println("  ProductType:" + this.old);

}
}