package com.xworkz.collection.tester;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import com.xworkz.collection.constants.AlcoholType;
import com.xworkz.collection.constraints.AlcoholDTO;

public class AlcoholDTOTester {

	public static void main(String[] args) {

		AlcoholDTO al = new AlcoholDTO("Old Monk", 290, true, 0.5d, AlcoholType.RUM);
		AlcoholDTO al1 = new AlcoholDTO("Original Choice", 500, true, 0.5d, AlcoholType.WHISKEY);
		AlcoholDTO al2 = new AlcoholDTO("SilverCup", 50, false, 0.25, AlcoholType.RUM);
		AlcoholDTO al3 = new AlcoholDTO("Johnnie Walker", 1000, true, 0.5d, AlcoholType.WHISKEY);
		AlcoholDTO al4 = new AlcoholDTO("kingsman ", 2000, true, 0.5d, AlcoholType.BEER);

		List<AlcoholDTO> list = new ArrayList<AlcoholDTO>();
		list.add(al4);
		list.add(al2);
		list.add(al3);
		list.add(al3);
		list.add(al);

		Collections.sort(list);
		Iterator itr = list.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
