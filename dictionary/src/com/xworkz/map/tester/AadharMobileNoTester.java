package com.xworkz.map.tester;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class AadharMobileNoTester {

	public static void main(String[] args) {
		Map<Long, Long> aadharAndMobile = new TreeMap<Long, Long>();
		aadharAndMobile.put(84667657034l, 7996657688l);
		aadharAndMobile.put(78976976578l, 6564746884l);
		aadharAndMobile.put(83546786589l, 9620692423l);
		aadharAndMobile.put(84667547609l, 8997464933l);
		aadharAndMobile.put(35473638693l, 7996656388l);
		aadharAndMobile.put(67547686980l, 7954673353l);
		aadharAndMobile.put(54737539353l, 8876947688l);
		aadharAndMobile.put(64874648368l, 6464545688l);
		aadharAndMobile.put(74547354723l, 9449475878l);

		System.out.println(aadharAndMobile.size());

		System.out.println(aadharAndMobile.containsKey(54737539353l));

		System.out.println(aadharAndMobile.containsValue(9449475878l));

		// aadharAndMobile.clear();

		// System.out.println(aadharAndMobile.size());

		System.out.println(aadharAndMobile.remove(54737539353l));

		System.out.println(aadharAndMobile.size());

		Set<Long> keySet = aadharAndMobile.keySet();

		System.out.println("******************************Aadhar And MobileNo***********************************");

		Iterator<Long> itr = keySet.iterator();
		while (itr.hasNext()) {
			Long lon = itr.next();
			Long value = aadharAndMobile.get(lon);
			System.out.println(lon + "  " + value);
		}

		System.out.println("************************************Mobile(value)*****************************");

		Collection<Long> values = aadharAndMobile.values();

		Iterator<Long> itrValues = values.iterator();

		while (itrValues.hasNext()) {
			Long Str = itrValues.next();
			System.out.println(Str);
		}
		System.out.println("*********************************Aadhar (key)********************************");

		Iterator<Long> itrs = keySet.iterator();
		while (itrs.hasNext()) {
			Long string = itrs.next();
			System.out.println(string);
		}

	}

}
