package com.xworkz.service;

import com.xworkz.dto.GameDTO;

public class GameServiceimpl implements GameService {

	@Override
	public String validateAndSave(GameDTO dto) {

		System.out.println("invoking validateAndSave" + dto);

		boolean nameValid = false;
		boolean versionValid = false;
		boolean developerByValid = false;
		boolean maxPlayersValid=false;
		boolean memoryRequiredValid=false;
		if (dto != null) {
			System.out.println("dto is null,will start validating");
			String name = dto.getName();
			if (name != null && !name.isEmpty() && name.length() >= 3 && name.length() < 10) {
				System.out.println("name is valid");
				nameValid = true;
			} else {
				System.out.println("name is invalid");
				nameValid = false;
			}
			String version = dto.getVersion();
			if (version != null && version.length() > 1 && version.length() < 30) {
				System.out.println("version is valid");
				versionValid = true;
			} else {
				System.out.println("version is invalid");
				versionValid = false;
			}

			String developerBy = dto.getDeveloperBy();
			if (developerBy != null && developerBy.length() > 1 && developerBy.length() < 30) {
				System.out.println("developerBy is valid");
				developerByValid = true;
			} else {
				System.out.println("developerBy is invalid");
				developerByValid = true;
			}
			
			int maxPlayers = dto.getMaxPlayers();
			if(maxPlayers !=0 && maxPlayers>=1 && maxPlayers<10) {
				System.out.println("maxPlayers is valid");
				maxPlayersValid=true;
			}
			else {
				System.out.println("maxPlayers is not valid");
				maxPlayersValid=false;
			}
			
			
			double memoryRequired = dto.getMemoryRequired();
			if(memoryRequired !=0 && memoryRequired>=500 && memoryRequired<100000) {
				System.out.println("memoryRequired is valid");
				memoryRequiredValid=true;
			}
			else {
				System.out.println("memoryRequired is not valid");
				memoryRequiredValid=false;
			}

			if (nameValid && versionValid && developerByValid && maxPlayersValid && memoryRequiredValid) {
				System.out.println("data is valid ,returing success");
				return "Success";
			}
			return "Failed";

		}
		System.out.println("dto is null,cannot pass to dao");
		return "Failed";
	}

}
