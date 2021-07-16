package com.website.methodclone.tester;

import com.website.methodclone.base.*;
import com.website.methodclone.constants.*;

public class IndustryTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Industry indus = new Industry();
		indus.name = "Accenture";
		indus.type = IndustryType.IT;
		indus.noOfEmpolye = 2500;

		indus.displayInfo();

		System.out.println("Duplicating************");
		try {
			Industry indus1 = (Industry) indus.clone();
			System.out.println(indus1.name);
			System.out.println(indus1.type);
			System.out.println(indus1.noOfEmpolye);

		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}

	}

}
