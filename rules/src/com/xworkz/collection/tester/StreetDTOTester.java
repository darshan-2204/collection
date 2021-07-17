package com.xworkz.collection.tester;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import com.xworkz.collection.constraints.StreetDTO;

public class StreetDTOTester {

	public static void main(String[] args) {

		StreetDTO street = new StreetDTO("VV road", 571401, "Near GandhiBhavan", "Mandya");
		StreetDTO street1 = new StreetDTO("100feet road", 571401, "KarnatkaBar", "Mandya");
		StreetDTO street2 = new StreetDTO("M G road", 560036, "Near MG road MetroStation", "Banglore");
		StreetDTO street3 = new StreetDTO("Brigde road", 560036, "Next to MG road", "Banglore");
		StreetDTO street4 = new StreetDTO("Hoshalli metro road", 560040, "Vijayanagar", "Mandya");
		StreetDTO street5 = new StreetDTO("Arasu Road", 570001, "DevarajuMarket", "Mysore");
		StreetDTO street6 = new StreetDTO("Palace Road", 570001, "Near MysorePalace", "Mysore");

		List<StreetDTO> collect = new ArrayList<StreetDTO>();

		collect.add(street);
		collect.add(street1);
		collect.add(street2);
		collect.add(street3);
		collect.add(street4);
		collect.add(street5);
		collect.add(street6);

		System.out.println(collect.size());

		// Traversing list through Iterator
		Iterator<StreetDTO> itr = collect.iterator();// getting the Iterator

		while (itr.hasNext()) {// check if iterator has the elements
			//boolean stree = itr.hasNext();

			System.out.println(itr.next());// printing the element and move to next

		}

		System.out.println("*********************************************");
		
		List<StreetDTO> list = new ArrayList<StreetDTO>();

		list.add(street);
		list.add(street1);
		list.add(street2);
		list.add(street3);
		list.add(street4);
		list.add(street5);
		list.add(street6);

		System.out.println(list.size());

		ListIterator<StreetDTO> iter = list.listIterator(3);
		while (iter.hasPrevious()) {
			System.out.println(iter.previous());

		}

		System.out.println("*********************************************");
		
		ListIterator<StreetDTO> iter1 = list.listIterator(4);
		while (iter1.hasNext()) {

			System.out.println(iter1.next());
			System.out.println(iter1.nextIndex());
		}
		System.out.println("*********************************************");
		
		list.add(0, street2);
		System.out.println(list.add(street1));
		 System.out.println(list.size());
		System.out.println(list.contains(list));
		 System.out.println(list.get(2));
		 System.out.println(list.isEmpty());
		 System.out.println(list.remove(1));
		 System.out.println(list.size());
		 System.out.println(list.subList(2, 3));
		 
		//list.clear();
		System.out.println(list);
		System.out.println("-----------------------------------");
		//boolean remove=list.removeAll(collect);
		//System.out.println(remove);
		//System.out.println(list);
		System.out.println("-----------------------------------");
		boolean containAll=list.containsAll(collect);
		System.out.println(containAll);
		System.out.println(list.size());
		boolean retain=list.retainAll(list);
		System.out.println(retain);
		
	}
}


