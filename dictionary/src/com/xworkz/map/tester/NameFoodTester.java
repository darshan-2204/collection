package com.xworkz.map.tester;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class NameFoodTester {

	public static void main(String[] args) {
		
		Map<String, String> nameANDFood = new TreeMap<String, String>();
		nameANDFood.put("Darshan", "NatiKolli Mudde Otta");
		nameANDFood.put("Sachin", "Chicken65");
		nameANDFood.put("Aishwarya", "Tandoori");
		nameANDFood.put("Vaish", "Chiken Lollip");
		nameANDFood.put("Sunil", "Biriyani");
		nameANDFood.put("Sunitha", "Mutton Briyani");
		nameANDFood.put("Pavithra", "ChickenHyderabadi");
		nameANDFood.put("Mridula", "FishCurry");
		nameANDFood.put("Girija", "MuttonCurry");
		nameANDFood.put("Ranjitha", "AndharaMeals");
		nameANDFood.put("Chitra", "SouthMeals");
		nameANDFood.put("Harshitha", "SouthMeals");
		
		System.out.println(nameANDFood.size());

		System.out.println(nameANDFood.containsKey("Harshitha"));

		System.out.println(nameANDFood.containsValue("SouthMeals"));

		// nameANDFood.clear();

		// System.out.println(nameANDFood.size());

		System.out.println(nameANDFood.remove("Harshitha"));

		System.out.println(nameANDFood.size());

		Set<String> keySet = nameANDFood.keySet();
		
		System.out.println("*****************************************************************");

		Iterator<String> itr = keySet.iterator();
		while (itr.hasNext()) {
			String string = itr.next();
			String value = nameANDFood.get(string);
			System.out.println(string + "" + value);
		}

		System.out.println("*****************************************************************");

		Collection<String> values = nameANDFood.values();

		Iterator<String> itrValues = values.iterator();

		while (itrValues.hasNext()) {
			String Str = itrValues.next();
			System.out.println(Str);
		}
		System.out.println("*****************************************************************");

		Iterator<String> itrs = keySet.iterator();
		while (itrs.hasNext()) {
			String string = itrs.next();
			System.out.println(string);
		}
		
	}

}
