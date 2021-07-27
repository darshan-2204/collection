package com.xworkz.tester;

import javax.xml.transform.Transformer;

import com.xworkz.constants.CharacterType;
import com.xworkz.dto.TransformerDTO;
import com.xworkz.service.GameService;
import com.xworkz.service.GameServiceimpl;
import com.xworkz.service.TransformerServiceimpl;

public class TransformerTester {

	public static void main(String[] args) {

		TransformerDTO dto = new TransformerDTO("Darshan", "Mandya", CharacterType.SIMPLE, "Disturb While Sleeping",
				"When ever with my friends", "Lose something or someone",
				"Travelling with freinds ,Party,listen to music, nightouts,Bussiness");

		TransformerServiceimpl service = new TransformerServiceimpl();
		String saved = service.validateAndSave(dto);
		System.out.println(saved);

	}

}
