package com.xworkz.service;

import com.xworkz.dto.TransformerDTO;

public class TransformerServiceimpl implements TransformerService {

	@Override
	public String validateAndSave(TransformerDTO dto) {
		System.out.println("invoked validateAndSave " + dto);
		boolean nameValid = false;
		boolean placeValid = false;
		boolean angryValid = false;
		boolean happyValid = false;
		boolean sadValid = false;
		boolean likeToDoValid = false;

		if (dto != null) {
			System.out.println("dto is not null ,started validation");
			String name = dto.getName();
			if (name != null && !name.isEmpty() && name.length() >= 3 && name.length() < 15) {
				System.out.println("name is valid");
				nameValid = true;

			} else {
				System.out.println("name is invalid");
				nameValid = false;

			}
			String place = dto.getPlace();
			if (place != null && !place.isEmpty() && place.length() >= 3 && place.length() < 15) {
				System.out.println("place is valid");
				placeValid = true;

			} else {
				System.out.println("place is invalid");
				placeValid = false;
			}

			String angry = dto.getAngry();
			if (angry != null && !angry.isEmpty() && angry.length() >= 5 && angry.length() < 30) {
				System.out.println("angry is valid");
				angryValid = true;

			} else {
				System.out.println("angry is invalid");
				angryValid = false;

			}

			String happy = dto.getHappy();
			if (happy != null && !happy.isEmpty() && happy.length() >= 4 && happy.length() < 44) {
				System.out.println("happy is valid");
				happyValid = true;

			} else {
				System.out.println("happy is invalid");
				happyValid = false;
			}
			String sad = dto.getSad();
			if (sad != null && !sad.isEmpty() && sad.length() >= 5 && sad.length() < 40) {
				System.out.println("sad is valid");
				sadValid = true;

			} else {
				System.out.println("sad is invalid");
				sadValid = false;
			}
			String likeToDo = dto.getLikeToDo();
			if (likeToDo != null && !likeToDo.isEmpty() && likeToDo.length() >= 15 && likeToDo.length() < 300) {
				System.out.println("likeToDo is valid");
				likeToDoValid = true;

			} else {
				System.out.println("likeToDo is invalid");
				likeToDoValid = false;
			}

			if (nameValid && angryValid && likeToDoValid && happyValid && placeValid && sadValid) {
				System.out.println("data is valid ,returing success");
				
				return "Success";
			}

			return "Failure";
		}
		System.out.println("dto is  null ,cannot started  validation");
		return "Failure";

	}
}
