package com.xworkz.collection.generic;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Country {

	public static void main(String[] args) {

		String country1 = "India";
		String country2 = "Indonesia";
		String country3 = "Algeria";
		String country4 = "Iran";
		String country5 = "Australia";
		String country6 = "Bangladesh";
		String country7 = "Bhutan";
		String country8 = "Belgium";
		String country9 = "Brazil";
		String country10 = "Iceland";

		Collection<String> collect = new ArrayList<String>();
		boolean added = false;
		added = collect.add(country10);
		added = collect.add(country1);
		added = collect.add(country3);
		added = collect.add(country5);
		added = collect.add(country7);
		added = collect.add(country9);
		added = collect.add(country2);
		added = collect.add(country4);
		added = collect.add(country6);
		added = collect.add(country8);

		System.out.println(added);
		
		int total=collect.size();
		System.out.println("Total size:"+total);
		
		
	   String check="India";
	   boolean contain = collect.contains(check);
		System.out.println("Contain:" + contain);
		
		//boolean removed = collect.remove("Bangladesh");

		Iterator<String> itr=collect.iterator();
		
		while (itr.hasNext()) {
			String string=itr.next();
			System.out.println(string.toUpperCase());
		}
	}

}
