package com.darshan_solution.lamda.tester;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

import com.darshan_solution.lamda.constants.Religion;
import com.darshan_solution.lamda.dao.HabbaDAO;
import com.darshan_solution.lamda.dao.HabbaDAOImpl;
import com.darshan_solution.lamda.dto.HabbaDTO;

public class HabbaTester {

	public static void main(String[] args) {

		HabbaDTO dto = new HabbaDTO("MakraSankarthi", "SouthIndia", 1, Religion.HINDU, "Pongal", true, true);
		HabbaDTO dto1 = new HabbaDTO("GowriGanesha", "India", 2, Religion.HINDU, "kadabu", true, true);
		HabbaDTO dto2 = new HabbaDTO("Christmas", "India", 1, Religion.CHRIST, "Cake", false, false);
		HabbaDTO dto3 = new HabbaDTO("Ramzan", "India", 1, Religion.MUSLIM, "Briyani", false, false);
		HabbaDTO dto4 = new HabbaDTO("MahalyaAmvase", "SouthKarnataka", 1, Religion.HINDU, "NonVeg", true, true);

		HabbaDAO dao = new HabbaDAOImpl();

		boolean jodisu = dao.ulisu(dto);
		dao.ulisu(dto1);
		dao.ulisu(dto4);
		dao.ulisu(dto3);
		dao.ulisu(dto2);
		//dao.ulisu(dto1);

		System.out.println(jodisu);
		
		System.out.println("*********************************************");

		Collection<HabbaDTO> collection = Arrays.asList(dto, dto1, dto2, dto3, dto4);
		

		collection.forEach((festival) -> System.out.println(festival.getName().toUpperCase()));
		
		System.out.println("*********************************************");

		collection.forEach((habba) -> System.out.println(habba.getRegion().toLowerCase()));
System.out.println("*********************************************");
		collection.forEach((fest) -> {
			if (fest.getNoOfDays() >= 2) {
				System.out.println(fest.getSpecialFood().toUpperCase());
				
				//return ;

			} else {
				System.out.println(fest.getSpecialFood());
			}
		});

	}

}
