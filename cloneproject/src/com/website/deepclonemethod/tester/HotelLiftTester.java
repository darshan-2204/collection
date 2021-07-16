package com.website.deepclonemethod.tester;

import com.website.deepclonemethod.parent.Hotel;
import com.website.deepclonemethod.parent.Lift;


public class HotelLiftTester {

	public static void main(String[] args) {
		
		Lift lif=new Lift("Schneider", 15, true);
		Hotel hot=new Hotel("Raddison", 5, 5, lif);
		
		

		 hot.displayProperties();
		System.out.println("Duplicating************");

		try {
			Hotel  hot1 = (Hotel)  hot .Clone();
			hot1.displayProperties();
			hot1.name="Taj";
			hot1.noOfFloars=12;
			
			System.out.println("Duplicating************");
			Hotel hot2 = (Hotel) hot1 .Clone();
			hot2.displayProperties();

		} catch (Exception e) {

		}
	}
	}



		
	


