package com.darshan_solution.lamda.dao;

import java.util.Collection;
import java.util.Optional;

import com.darshan_solution.lamda.dto.RogiDTO;
import com.darshan_solution.lamda.function.RogiSearch;

public interface RogiDAO {
	
	boolean save(RogiDTO dto);

	Optional<RogiDTO> findOne(RogiSearch search);

	Optional<Integer> totalSize();

	Optional<RogiDTO> findByMaxAge();

	Optional<RogiDTO> findByMinAge();

	Collection<RogiDTO> findAll();

	Collection<RogiDTO> findAll(RogiSearch search);

	
}
