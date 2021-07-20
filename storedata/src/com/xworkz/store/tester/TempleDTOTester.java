package com.xworkz.store.tester;

import com.xworkz.store.dao.TempleDAO;
import com.xworkz.store.dao.TempleDAOImpl;
import com.xworkz.store.dto.TempleDTO;

public class TempleDTOTester {

	public static void main(String[] args) {

		TempleDTO temple = new TempleDTO(14534, "ChamundiHill", "Mysore", 100, "Ladu", 20, false, "Chamundi", false);
		TempleDTO temple1 = new TempleDTO(25465, "Tirupathi", "AndhraPradesh", 300, "Ladu", 200, true, "Vekhateshwara",
				true);
		TempleDTO temple2 = new TempleDTO(14546, "Melkotte", "Mandya", 50, "Puloyogaere", 15, true, "Chaluvanaryana",
				true);
		TempleDTO temple3 = new TempleDTO(16758, "Iskcon", "Banglore", 0, "Pongal", 30, true, "Srikrishna", false);
		TempleDTO temple4 = new TempleDTO(34567, "Sringeri", "Shimoga", 100, "Ladu", 10, false, "Sharadamba", true);

		TempleDAO dao = new TempleDAOImpl();
		dao.save(temple);
		dao.save(temple3);
		dao.save(temple1);
		dao.save(temple2);
		dao.save(temple4);

		System.out.println(dao.totalItems());
		
		System.out.println(dao.FirstItems());

	}

}
