package com.xworkz.map.tester;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class CountryMapTester {

	public static void main(String[] args) {
		Map<String, Integer> countryNameAndPopulationMap = new HashMap<String, Integer>();
		countryNameAndPopulationMap.put("India", 1354051854);
		countryNameAndPopulationMap.put("China", 1415045928);
		countryNameAndPopulationMap.put("United States", 326766748);
		countryNameAndPopulationMap.put("Brazil", 210867954);
		countryNameAndPopulationMap.put("Pakistan", 200813818);
		countryNameAndPopulationMap.put("Russia", 143964709);
		countryNameAndPopulationMap.put("Japan", 127185332);
		countryNameAndPopulationMap.put("Egypt", 99375741);

		System.out.println(countryNameAndPopulationMap.size());

		System.out.println(countryNameAndPopulationMap.containsKey("India"));

		System.out.println(countryNameAndPopulationMap.containsValue(210867954));

		// countryNameAndPopulationMap.clear();

		// System.out.println(countryNameAndPopulationMap.size());

		System.out.println(countryNameAndPopulationMap.remove("China"));

		System.out.println(countryNameAndPopulationMap.size());

		Set<String> keySet = countryNameAndPopulationMap.keySet();
		
		System.out.println("*****************************************************************");

		Iterator<String> itr = keySet.iterator();
		while (itr.hasNext()) {
			String string = itr.next();
			Integer value = countryNameAndPopulationMap.get(string);
			System.out.println(string + "" + value);
		}

		System.out.println("*****************************************************************");

		Collection<Integer> values = countryNameAndPopulationMap.values();

		Iterator<Integer> itrValues = values.iterator();

		while (itrValues.hasNext()) {
			Integer integer = itrValues.next();
			System.out.println(integer);
		}
		System.out.println("*****************************************************************");

		Iterator<String> itrs = keySet.iterator();
		while (itrs.hasNext()) {
			String string = itrs.next();
			System.out.println(string);
		}
	}

}
