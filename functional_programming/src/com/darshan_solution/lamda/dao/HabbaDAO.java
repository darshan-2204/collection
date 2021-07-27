package com.darshan_solution.lamda.dao;

import java.util.Collection;

import com.darshan_solution.lamda.dto.HabbaDTO;
import com.darshan_solution.lamda.function.HabbaSearch;

public interface HabbaDAO {
	
	boolean ulisu(HabbaDTO dto);
	
	HabbaDTO ondunaHuduku(HabbaSearch habba);
	
	Collection<HabbaDTO> yellavanuHuduku(HabbaSearch habba);

}
