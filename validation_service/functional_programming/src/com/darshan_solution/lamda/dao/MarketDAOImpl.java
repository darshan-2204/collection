package com.darshan_solution.lamda.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import com.darshan_solution.lamda.constants.MarketType;
import com.darshan_solution.lamda.dto.MarketDTO;
import com.darshan_solution.lamda.function.MarketSearch;

public class MarketDAOImpl implements MarketDAO {

	private Collection<MarketDTO> collection = new ArrayList<MarketDTO>();

	public MarketDAOImpl() {
		MarketDTO market = new MarketDTO("KR Market", "Banglore", 200, MarketType.ALLTYPE);
		MarketDTO market1 = new MarketDTO("Devaraju market", "Mysore", 150, MarketType.FLOWERS_MARKET);
		MarketDTO market2 = new MarketDTO("Mandi Market", "Mysore", 100, MarketType.MUTTON_MARKET);
		MarketDTO market3 = new MarketDTO(" Market", "Mandya", 100, MarketType.FLOWERS_MARKET);
		MarketDTO market4 = new MarketDTO("Mangalore Market", "Mangalore", 130, MarketType.FISH_MARKET);

		this.collection.add(market);
		this.collection.add(market4);
		this.collection.add(market2);
		this.collection.add(market3);
		this.collection.add(market1);

	}

	@Override
	public MarketDTO findBy(MarketSearch marketSearch) {
		Iterator<MarketDTO> itr = this.collection.iterator();
		MarketDTO temp = null;
		while (itr.hasNext()) {
			MarketDTO marketDTO = itr.next();

			if (marketSearch.test(marketDTO)) {
				temp = marketDTO;
				break;
			}

		}
		return temp;
	}

	@Override

	public Collection<MarketDTO> findAll(MarketSearch marketSearch) {
		Iterator<MarketDTO> itr = this.collection.iterator();
		Collection<MarketDTO> temp = new ArrayList<MarketDTO>();

		while (itr.hasNext()) {
			MarketDTO marketDTO = itr.next();

			if (marketSearch.test(marketDTO)) {
				temp.add(marketDTO);

			}

		}
		return temp;
	}

}
