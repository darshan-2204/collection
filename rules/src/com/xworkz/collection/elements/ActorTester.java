package com.xworkz.collection.elements;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class ActorTester {

	public static void main(String[] args) {

		String actor1 = "Katrina Kaif";
		String actor2 = "Sunny Deol";
		String actor3 = "Amitabh Bachchan";
		String actor4 = "Sanjeev Kumar";
		String actor5 = "Sunny Deol";
		String actor6 = "Mahima Chaudhry";
		String actor7 = "Saif Ali Khan";
		String actor8 = "Sunny Leon";
		String actor9 = "Akshay Kumar";
		String actor10 = "Rajinikanth";
		String actor11 = "Shilpa Shetty";

		Collection<String> collect = new ArrayList<String>();
		boolean added = false;
		added = collect.add(actor11);
		added = collect.add(actor1);
		added = collect.add(actor3);
		added = collect.add(actor5);
		added = collect.add(actor7);
		added = collect.add(actor9);
		added = collect.add(actor2);
		added = collect.add(actor4);
		added = collect.add(actor6);
		added = collect.add(actor8);
		added = collect.add(actor10);

		System.out.println(added);
		
		String check = "Sunny Leon";
		boolean contain = collect.contains(check);
		System.out.println("Contain:" + contain);

		int total = collect.size();
		System.out.println("Total size:" + total);

		boolean removed = collect.remove("Sunny Leon");
		System.out.println("removed :" + removed );

		int tota = collect.size();
		System.out.println("Total size:" + tota);
	
		Iterator iterator = collect.iterator();
		iterator.hasNext();
		Object obj = iterator.next();
		System.out.println("Act:"+obj);

		iterator.hasNext();
		iterator.hasNext();
		iterator.hasNext();
		iterator.hasNext();
		iterator.hasNext();
		iterator.hasNext();
		iterator.hasNext();
		iterator.hasNext();
		iterator.hasNext();
		iterator.hasNext();
		iterator.hasNext();
		Object act = iterator.next();
		System.out.println("Act:" + act);

	}

}
