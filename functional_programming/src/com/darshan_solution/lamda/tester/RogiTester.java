package com.darshan_solution.lamda.tester;

import java.util.Collection;
import java.util.Optional;

import com.darshan_solution.lamda.dao.RogiDAO;
import com.darshan_solution.lamda.dao.RogiDAOImpl;
import com.darshan_solution.lamda.dto.RogiDTO;

public class RogiTester {

	public static void main(String[] args) {
		RogiDTO dto1 = new RogiDTO(1, "Darshan", 23, "JAVA fever", true);
		RogiDTO dto2 = new RogiDTO(2, "sachin", 25, "BrainTumor", false);
		RogiDTO dto3 = new RogiDTO(3, "Mridula", 25, "cancer", false);
		RogiDTO dto4 = new RogiDTO(4, "Sunil", 21, "BloodCancer", false);
		RogiDTO dto5 = new RogiDTO(5, "Girija", 24, "Kidney Failure", false);
		
		RogiDAO dao = new RogiDAOImpl();
		dao.save(dto5);
		dao.save(dto4);
		dao.save(dto3);
		dao.save(dto2);
		dao.save(dto1);
		
		Optional<RogiDTO> dto = dao.findOne((id)-> id.getId() == 5);
		System.out.println(dto);
		
		dto = dao.findOne((name)-> name.getName().equals("sachin"));
		System.out.println(dto);
		
		System.out.println(dao.totalSize());
		
		
		Collection<RogiDTO> collection = dao.findAll();
		for(RogiDTO rogiDTO: collection) {
			System.out.println(rogiDTO);
		}
		
		collection = dao.findAll((d)->d.isBadukuGurantee() == true);
		for(RogiDTO rogiDTO: collection) {
			System.out.println(rogiDTO);
		}

	}

}
