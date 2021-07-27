package com.darshan_solution.lamda.dao;

import java.util.Collection;

import com.darshan_solution.lamda.dto.MarketDTO;
import com.darshan_solution.lamda.function.MarketSearch;

public interface MarketDAO {

	MarketDTO findBy(MarketSearch marketSearch);

	Collection<MarketDTO> findAll(MarketSearch marketSearch);

}
