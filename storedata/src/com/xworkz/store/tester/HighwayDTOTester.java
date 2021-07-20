package com.xworkz.store.tester;

import java.util.Collection;

import com.xworkz.store.constants.HighwayType;
import com.xworkz.store.dto.HighwayDTO;
import com.xworkz.store.dao.HighwayDAO;
import com.xworkz.store.dao.HighwayDAOImpl;

public class HighwayDTOTester {

	public static void main(String[] args) {

		HighwayDTO dto = new HighwayDTO("NH17", 17, HighwayType.NATIONALHIGHWAY, "Karnataka,Kerala,Goa", 1065.00d, true,
				"KolkarConstructions");
		HighwayDTO dto1 = new HighwayDTO("NH48", 48, HighwayType.NATIONALHIGHWAY, "Karnataka", 720.00d, true,
				"SunilConstructions");
		HighwayDTO dto2 = new HighwayDTO("NH63", 63, HighwayType.NATIONALHIGHWAY, "Andhra", 929.00d, true,
				"PPRConstructions");
		HighwayDTO dto3 = new HighwayDTO("SH4", 4, HighwayType.STATEHIGHWAY, "Karnataka,Tamilnadu", 1665.00d, true,
				"KRSConstructions");

		HighwayDAO dao = new HighwayDAOImpl();
		dao.save(dto);
		dao.save(dto1);
		dao.save(dto2);
		dao.save(dto3);

		System.out.println("totalItems : " + dao.totalItems());

		Collection<HighwayDTO> all = dao.findAll();
		for (HighwayDTO highway : all) {
			System.out.println("FindAll : " + highway);
		}

		Collection<Integer> findnumber = dao.findAllNumber();
		for (Integer in : findnumber) {
			System.out.println("find all number : " + in);
		}

		Collection<HighwayDTO> numberbystatename = dao.findNumberByStateName("Karnataka");
		for (HighwayDTO highway : numberbystatename) {
			System.out.println(highway);
		}

		Collection<HighwayDTO> bystatename = dao.findByStateName("Andhra");
		for (HighwayDTO dt : bystatename) {
			System.out.println(dt);
		}

		boolean contain = dao.exist(dto3);
		System.out.println("found : " + contain);

		Collection<HighwayDTO> highwaytype = dao.findByHighwayType(HighwayType.STATEHIGHWAY);
		for (HighwayDTO way : highwaytype) {
			System.out.println(way);
		}

		boolean condition = dao.isCondition(63);
		System.out.println("Highway condition : " + condition);

		double len = dao.lengthByNumber(48);
		System.out.println("findbylength : " + len);

		HighwayDTO maxleng = dao.findByMaxLength();
		System.out.println("max length : " + maxleng);

		HighwayDTO minleng = dao.findByminLength();
		System.out.println("min length : " + minleng);

	}

}