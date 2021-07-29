package com.darshan_solution.stream.tester;

import java.util.Arrays;
import java.util.Collection;
import java.util.Set;
import java.util.stream.Collectors;

public class WatchTester {

	public static void main(String[] args) {
		Collection<String> watch = Arrays.asList("Fasttrack", "Toyota", "Sonata", "Apple smart watch", "Mi samrt-Band",
				"Tellus", "Technotime", "Realme");
		Collection<String> duplicateStore = watch
				.stream()
				.filter(n -> n.startsWith("T"))
				.collect(Collectors.toList());
		System.out.println(duplicateStore + " size :" + duplicateStore.size());
		duplicateStore.forEach(n -> System.out.println(n));
		Set<String> list = watch.stream().filter(t -> t.startsWith("T")).collect(Collectors.toSet());
		System.out.println(" no duplicates allowed :" + list);
	}

}
