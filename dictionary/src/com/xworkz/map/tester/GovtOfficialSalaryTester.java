package com.xworkz.map.tester;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
;

public class GovtOfficialSalaryTester {

	public static void main(String[] args) {

		Map<String, Integer> govtOfficialSalary = new LinkedHashMap<String, Integer>();
		govtOfficialSalary.put("President", 500000);
		govtOfficialSalary.put("Vice President", 400000);
		govtOfficialSalary.put("Prime Minister", 280000);
		govtOfficialSalary.put("Chief Justice of India", 280000);
		govtOfficialSalary.put("Governors", 350000);
		govtOfficialSalary.put("Cabinet Secretary", 500000);
		govtOfficialSalary.put("Chief Election Commissioner", 300000);
		govtOfficialSalary.put("Chiefs of Staff", 2500000);
		govtOfficialSalary.put("Judges of High Courts", 255000);

		System.out.println(govtOfficialSalary.size());

		System.out.println(govtOfficialSalary.containsKey("Chiefs of Staff"));

		System.out.println(govtOfficialSalary.containsValue(255000));

		// govtOfficialSalary.clear();

		// System.out.println(govtOfficialSalary.size());

		System.out.println(govtOfficialSalary.remove("Judges of High Courts"));

		System.out.println(govtOfficialSalary.size());

		Set<String> keySet = govtOfficialSalary.keySet();

		System.out.println("*****************************************************************");

		Iterator<String> itr = keySet.iterator();
		while (itr.hasNext()) {
			String string = itr.next();
			Integer value = govtOfficialSalary.get(string);
			System.out.println(string + "" + value);
		}

		System.out.println("*****************************************************************");

		Collection<Integer> values = govtOfficialSalary.values();

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
