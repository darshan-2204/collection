package com.darshan_solution.lamda.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import com.darshan_solution.lamda.dto.RogiDTO;
import com.darshan_solution.lamda.function.RogiSearch;

public class RogiDAOImpl<T> implements RogiDAO {

	private List<RogiDTO> list = new ArrayList<RogiDTO>();

	@Override
	public boolean save(RogiDTO dto) {

		return list.add(dto);
	}

	@Override
	public Optional<RogiDTO> findOne(RogiSearch search) {
		Iterator<RogiDTO> itr = this.list.iterator();
		Optional<RogiDTO> opt = Optional.empty();
		while (itr.hasNext()) {
			RogiDTO dto = itr.next();
			if (search.test(dto)) {
				opt = Optional.of(dto);
			}
		}

		return opt;
	}

	@Override
	public Optional<Integer> totalSize() {

		return Optional.of(list.size());
	}
	
	
	@Override
	public Optional<RogiDTO> findByMaxAge() {
		// TODO Auto-generated method stub
		return null;
	}


	

	@Override
	public Optional<RogiDTO> findByMinAge() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<RogiDTO> findAll() {
		
		return this.list;
	}

	@Override
	public Collection<RogiDTO> findAll(RogiSearch search) {
		Collection<RogiDTO> collection = new ArrayList<>();
		list.forEach((dto) -> {
			if (search.test(dto))
				collection.add(dto);
		});
		System.out.println("\nFind all search :");
		return collection;
	}

	
	
	

}
