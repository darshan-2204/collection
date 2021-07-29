package com.darshan_solution.stream.tester;

import java.util.Arrays;
import java.util.Collection;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class PANTester {

	public static void main(String[] args) {
		Collection<String> pan = Arrays.asList("AZKPH4047B", "AZGPH4037B", "ADGPH4047B", "AZKPF6047R", "AZKPH45057R",
				"AZKHJ0047S", "AERG9047R");
		
		Collection<String> account = pan
				.stream()
				.filter((permanet)->permanet.contains("GP"))
				.collect(Collectors.toList());
		System.out.println(account+" "+"Size:"+account.size());
		
		account.forEach((s)->System.out.println(s));
		
		Set<String> list = pan.stream().filter(w -> w.startsWith("A")).collect(Collectors.toSet());
		System.out.println(" no duplicates allowed :" + list);
	}

}
