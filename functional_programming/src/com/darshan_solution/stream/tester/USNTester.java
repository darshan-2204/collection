package com.darshan_solution.stream.tester;

import java.util.Arrays;
import java.util.Collection;
import java.util.Set;
import java.util.stream.Collectors;

public class USNTester {

	public static void main(String[] args) {
		Collection<String> usn = Arrays.asList("1ST16ME016", "4ST16CS056", "2ST16ME017", "1ST16ME015", "1ST16ME088",
				"1ST16ME046", "4ST16CS0156", "2ST16EC016", "1ST16EE045", "4ST16IS0135", "2ST16ME067", "1ST16ME045",
				"3ST16CV016");
		
		Collection<String> rollNo = usn
				.stream()
				.filter((seat)->seat.contains("ME"))
				.collect(Collectors.toList());
		System.out.println(rollNo + " size :" + rollNo.size());
		rollNo.forEach(seat -> System.out.println(seat));
		
		Set<String> list = usn.stream().filter(t -> t.endsWith("6")).collect(Collectors.toSet());
		System.out.println(" no duplicates allowed :" + list);
	}

}
