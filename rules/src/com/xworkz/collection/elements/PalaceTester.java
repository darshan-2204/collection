package com.xworkz.collection.elements;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class PalaceTester {

	public static void main(String[] args) {

		String palace1 = "Mysore Palace";
		String palace2 = "Bangalore Palace - Bengaluru";
		String palace3 = "Jayalakshmi Vilas -Mysore";
		String palace4 = "Lalitha Mahal-Mysore";
		String palace5 = "Rajendra Vilas -Mysore";
		String palace6 = "Lotus Mahal - Hampi";
		String palace7 = "Tipu Sultan Summer Palace- Bengaluru";
		String palace8 = "Ranjin Mahal- Bidar";
		String palace9 = "Nalknad Palace- Kodagu";
		String palace10 = "Asar Mahal- Vijayapura";

		Collection collection = new ArrayList();
		boolean added = false;

		added = collection.add(palace1);
		added = collection.add(palace2);
		added = collection.add(palace4);
		added = collection.add(palace6);
		added = collection.add(palace8);
		added = collection.add(palace10);
		added = collection.add(palace3);
		added = collection.add(palace5);
		added = collection.add(palace7);
		added = collection.add(palace9);

		System.out.println(added);
		
		String check = "Mysore Palace";
		boolean contain = collection.contains(check);
		System.out.println("Contain:" + contain);

		int total = collection.size();
		System.out.println("Total size:" + total);

		boolean removed = collection.remove("Asar Mahal- Vijayapura");
		System.out.println("Removed:" + removed);
		
		int sum = collection.size();
		System.out.println("Total size:" +sum);

		Iterator iterator = collection.iterator();
		iterator.hasNext();
		Object obj = iterator.next();
		System.out.println("Palace:" + obj);
		System.out.println(iterator.hasNext());


		iterator.hasNext();
		Object pala = iterator.next();
		System.out.println("Palace:" + pala);

		iterator.hasNext();
		Object ob = iterator.next();
		System.out.println("Palace:" + ob);

	}

}
