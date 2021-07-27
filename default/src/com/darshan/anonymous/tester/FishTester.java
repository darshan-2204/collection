package com.darshan.anonymous.tester;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

import com.darshan.anonymous.dto.FishDTO;

public class FishTester {

	public static void main(String[] args) {

		FishDTO gouramiFish = new FishDTO("Kissing Gourami", "flesh-colored", 6, 1000d);
		FishDTO molliesFish = new FishDTO("Mollies", "white", 3, 20);
		FishDTO PlecostomusFish = new FishDTO("Plecostomus", "Brown", 10, 435.48);
		FishDTO BettaFish = new FishDTO("Betta Fish", "Red", 3, 150.00);

		List<FishDTO> list = new ArrayList<FishDTO>();

		list.add(gouramiFish);
		list.add(molliesFish);
		list.add(PlecostomusFish);
		list.add(BettaFish);

		Comparator<FishDTO> sortBycostDesc = new Comparator<FishDTO>() {

			@Override
			public int compare(FishDTO o1, FishDTO o2) {

				return Double.valueOf(o2.getCost()).compareTo(o1.getCost());

			}

		};

		Comparator<FishDTO> sortBylisfeSpan = new Comparator<FishDTO>() {

			@Override

			public int compare(FishDTO o1, FishDTO o2) {

				return Integer.valueOf(o2.getLifeSpan()).compareTo(o1.getLifeSpan());

			}

		};

		Comparator<FishDTO> sortByname = new Comparator<FishDTO>() {

			@Override

			public int compare(FishDTO o1, FishDTO o2) {

				return o1.getName().compareTo(o2.getName());

			}

		};

		Comparator<FishDTO> sortByColor = new Comparator<FishDTO>() {

			@Override

			public int compare(FishDTO o1, FishDTO o2) {

				return o1.getColor().compareTo(o2.getColor());

			}

		};

		Comparator<FishDTO> sortBynameDesc = new Comparator<FishDTO>() {

			@Override

			public int compare(FishDTO o1, FishDTO o2) {

				return o2.getName().compareTo(o1.getName());

			}

		};

		Collections.sort(list, sortBynameDesc);
		
	      
        Collections.sort(list, sortByColor);

        Collections.sort(list, sortBynameDesc);

         Collections.sort(list,sortBycostDesc);

        Collections.sort(list,sortBylisfeSpan);


		Iterator<FishDTO> itr = list.iterator();

		while (itr.hasNext()) {

			FishDTO fishdt = itr.next();

			System.out.println(fishdt.getName() + "," + fishdt.getColor() + " ," + fishdt.getCost());

			 System.out.println(fishdt.getColor());

            System.out.println(fishdt.getCost());

            System.out.println(fishdt.getLifeSpan());

		}

	}
}
