package com.xworkz.collection.generic;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;


public class EmployeeId {

	public static void main(String[] args) {
		int employeeId1=23754;
		int employeeId2=34567;
		int employeeId3=45673;
		int employeeId4=26574;
		int employeeId5=23245;
		int employeeId6=43253;
		int employeeId7=34265;
		int employeeId8=54673;
		
		Collection<Integer> id = new ArrayList<>();
		id.add(employeeId4);
		id.add(employeeId5);
		id.add(employeeId6);
		id.add(employeeId3);
		id.add(employeeId8);
		id.add(employeeId2);
		id.add(employeeId1);
		id.add(employeeId7);

		Iterator<Integer> itr = id.iterator();//Iterator<String> itr=collect.iterator();
		while (itr.hasNext()) {
			int num = itr.next();
			System.out.println(num);
		}

	}
	
	
	
	}

