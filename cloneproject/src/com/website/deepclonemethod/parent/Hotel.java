package com.website.deepclonemethod.parent;

public class Hotel implements Cloneable {
	public String name;
	public int noOfFloars;
	public int ratings;
	public Lift lif;
	
	
	public Hotel(String name,int noOfFloars,int ratings,Lift lif) {
		this.name=name;
		this.noOfFloars=noOfFloars;
		this.ratings=ratings;
		this.lif=lif;
		
	}
	@Override
	public Hotel clone() throws CloneNotSupportedException {
		Hotel cloneRef = (Hotel) super.clone();
		if (this.lif != null) {
			cloneRef.lif = lif.clone();
		}
		return cloneRef;
	}
	public void displayProperties() {

		System.out.println("Name:"+this.name);
		System.out.println("NoOfFloars:"+this.noOfFloars);
		System.out.println("Ratings:"+this.ratings);
		
		if (this.lif != null) {
			this.lif.displayInfo();
		}

	}
}
