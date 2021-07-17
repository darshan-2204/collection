package com.website.deepclonemethod.tester;

import com.website.deepclonemethod.parent.Address;
import com.website.deepclonemethod.parent.Amazon;

public class Tester {

	public static void main(String[] args) {

		Address address = new Address(560040, "Bangalore");
		Amazon zon = new Amazon("USA", "2008", address);

		zon.displayProperties();
		System.out.println("Duplicating************");

		try {
			Amazon zon1 = (Amazon) zon.clone();
			zon1.displayProperties();
			zon1.country="India";
			zon1.address.city="Mandya";
			System.out.println("Duplicating************");
			Amazon zon2 = (Amazon) zon1.clone();
			zon2.displayProperties();

		} catch (Exception e) {

		}
	}

}
