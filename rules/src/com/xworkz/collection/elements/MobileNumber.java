package com.xworkz.collection.elements;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class MobileNumber {

	public static void main(String[] args) {

		long number1 = 7996657688l;
		long number2 = 7892441472l;
		long number3 = 9449473736l;
		long number4 = 9620692429l;
		long number5 = 9986709046l;
		long number6 = 9964511132l;
		long number7 = 7894567898l;
		long number8 = 9987678657l;
		long number9 = 9877657786l;
		long number10 = 6362575875l;

		Collection collect = new ArrayList();
		boolean added = false;
		added = collect.add(number1);
		added = collect.add(number3);
		added = collect.add(number5);
		added = collect.add(number7);
		added = collect.add(number9);
		added = collect.add(number8);
		added = collect.add(number6);
		added = collect.add(number4);
		added = collect.add(number2);
		added = collect.add(number10);

		System.out.println(added);

		int total = collect.size();
		System.out.println("Total size:" + total);
		long check = 9996665557l;
		boolean contain = collect.contains(check);
		System.out.println("Contain:" + contain);
		boolean removed = collect.remove("7996657688");

		Iterator iterator = collect.iterator();
		iterator.hasNext();
		Object obj = iterator.next();
		System.out.println("Number:" + obj);

		iterator.hasNext();
		Object ob = iterator.next();
		System.out.println("Number:" + ob);

		iterator.hasNext();
		Object bj = iterator.next();
		System.out.println("Number:" + bj);

		iterator.hasNext();
		Object obje = iterator.next();
		System.out.println("Number:" + obje);

		iterator.hasNext();
		Object objt = iterator.next();
		System.out.println("Number:" + objt);

	}

}
