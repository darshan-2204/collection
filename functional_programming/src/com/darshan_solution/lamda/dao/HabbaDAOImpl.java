package com.darshan_solution.lamda.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import com.darshan_solution.lamda.constants.Religion;
import com.darshan_solution.lamda.dto.HabbaDTO;
import com.darshan_solution.lamda.dto.MarketDTO;
import com.darshan_solution.lamda.function.HabbaSearch;
import com.darshan_solution.lamda.function.MarketSearch;

public class HabbaDAOImpl implements HabbaDAO {

	private Collection<HabbaDTO> collection = new ArrayList<HabbaDTO>();
	
	@Override
	public boolean ulisu(HabbaDTO dto) {
		boolean added=collection.add(dto);
		System.out.println(dto);
		return added;
	}

	
	

	@Override
	public HabbaDTO ondunaHuduku(HabbaSearch habba) {
		Iterator<HabbaDTO> itr = this.collection.iterator();
		HabbaDTO temp = null;
		while (itr.hasNext()) {
			HabbaDTO dto = itr.next();

			if (habba.huduku(dto)) {
				temp = dto;
				break;

			}

		}
		return temp;
	}

	@Override
	public Collection<HabbaDTO> yellavanuHuduku(HabbaSearch habba) {
		Iterator<HabbaDTO> itr = this.collection.iterator();
		Collection<HabbaDTO> temp = new ArrayList<HabbaDTO>();

		while (itr.hasNext()) {
			HabbaDTO dto = itr.next();

			if (habba.huduku(dto)) {
				temp.add(dto);

			}
			return temp;
		}
		return temp;

	}

	
}
