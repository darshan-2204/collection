package com.xworkz.store.dao;

import com.xworkz.store.dto.TempleDTO;

public interface TempleDAO {
	
	boolean save (TempleDTO dto);
	
	int totalItems();
	
	
	TempleDTO findFirstItem();

	

	
	

}
