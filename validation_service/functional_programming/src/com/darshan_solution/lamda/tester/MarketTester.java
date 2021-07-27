package com.darshan_solution.lamda.tester;

import java.util.Collection;

import com.darshan_solution.lamda.constants.MarketType;
import com.darshan_solution.lamda.dao.MarketDAO;
import com.darshan_solution.lamda.dao.MarketDAOImpl;
import com.darshan_solution.lamda.dto.MarketDTO;

public class MarketTester {

	public static void main(String[] args) {

		MarketDAO market = new MarketDAOImpl();

		MarketDTO more = market.findBy((d) -> d.getName().equals("KR Market"));
		System.out.println(more);

		more = market.findBy((e) -> e.getLocation().equals("Mysore"));
		System.out.println(more);

		more = market.findBy((g) -> g.getType().equals(MarketType.FLOWERS_MARKET));
		System.out.println(more);

		more = market.findBy((r) -> r.getNoOfShops() > 150);
		System.out.println(more);

		System.out.println("*************************************************************");
		Collection<MarketDTO> collect = market.findAll((s) -> s.getNoOfShops() > 100);
		for (MarketDTO dto : collect) {
			System.out.println(dto);

		}
	}
}
