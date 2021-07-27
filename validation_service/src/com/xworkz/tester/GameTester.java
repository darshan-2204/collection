package com.xworkz.tester;

import com.xworkz.dto.GameDTO;
import com.xworkz.service.GameService;
import com.xworkz.service.GameServiceimpl;

public class GameTester {

	public static void main(String[] args) {

		GameDTO game = new GameDTO("PUBG", "1.5", "Battle royal", 2, 500, true);

		GameService service = new GameServiceimpl();
		String saved = service.validateAndSave(game);
		System.out.println(saved);

	}

}
