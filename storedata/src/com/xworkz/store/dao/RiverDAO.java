package com.xworkz.store.dao;

import com.xworkz.store.dto.RiverDTO;

public interface RiverDAO {

	boolean save(RiverDTO dto);

	int totalItems();

	void update(RiverDTO dto);

	boolean delete(RiverDTO dto);

}
