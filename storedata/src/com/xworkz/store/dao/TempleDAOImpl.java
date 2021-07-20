package com.xworkz.store.dao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.xworkz.store.dto.TempleDTO;

public class TempleDAOImpl implements TempleDAO {

	 private List<TempleDTO> list = new ArrayList<TempleDTO>();
     
	 @Override
	public boolean save(TempleDTO dto) {
		boolean added = list.add(dto);
		System.out.println("dto :" + dto);
		//System.out.println("dto was added :" + added);
		return added;
	}
     
	 @Override
	public int totalItems() {
		int total = list.size();
		//System.out.println("total :" + total);
		return total;
	}

	@Override
	public TempleDTO findFirstItem() {
		 
		TempleDTO name= null;
		Iterator<TempleDTO> itr = this.list.iterator();
		while (itr.hasNext()) {
			TempleDTO temp = itr.next();
			if(TempleDTO.getName().equals(name)) {
				
			}
		}
		return name;
	}
	 
	
	

	
}
	


