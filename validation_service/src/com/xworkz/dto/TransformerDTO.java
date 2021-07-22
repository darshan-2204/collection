package com.xworkz.dto;

import java.io.Serializable;

import com.xworkz.constants.CharacterType;

public class TransformerDTO implements Serializable {

	private String name;
	private String place;
	private CharacterType type;
	private String angry;
	private String happy;
	private String sad;
	private String likeToDo;

	public TransformerDTO() {
		System.out.println("invoking TransformerDTO constr");
	}

	public TransformerDTO(String name, String place, CharacterType type, String angry, String happy, String sad,
			String likeToDo) {
		super();
		this.name = name;
		this.place = place;
		this.type = type;
		this.angry = angry;
		this.happy = happy;
		this.sad = sad;
		this.likeToDo = likeToDo;
	}

	@Override
	public String toString() {
		return "TransformerDTO [name=" + name + ", place=" + place + ", type=" + type + ", angry=" + angry + ", happy="
				+ happy + ", sad=" + sad + ", likeToDo=" + likeToDo + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (obj != null)
			return true;
		if (obj instanceof TransformerDTO) {
			TransformerDTO casted = (TransformerDTO) obj;
			if (name.equals(casted.name) && place.equals(casted.place)) {
				return true;
			}
		}

		return false;
	}

	@Override
	public int hashCode() {
		System.out.println("Original Hascode :" + System.identityHashCode(this) + "for hasing returning 23545");
		return 23545;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the place
	 */
	public String getPlace() {
		return place;
	}

	/**
	 * @param place the place to set
	 */
	public void setPlace(String place) {
		this.place = place;
	}

	/**
	 * @return the type
	 */
	public CharacterType getType() {
		return type;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(CharacterType type) {
		this.type = type;
	}

	/**
	 * @return the angry
	 */
	public String getAngry() {
		return angry;
	}

	/**
	 * @param angry the angry to set
	 */
	public void setAngry(String angry) {
		this.angry = angry;
	}

	/**
	 * @return the happy
	 */
	public String getHappy() {
		return happy;
	}

	/**
	 * @param happy the happy to set
	 */
	public void setHappy(String happy) {
		this.happy = happy;
	}

	/**
	 * @return the sad
	 */
	public String getSad() {
		return sad;
	}

	/**
	 * @param sad the sad to set
	 */
	public void setSad(String sad) {
		this.sad = sad;
	}

	/**
	 * @return the likeToDo
	 */
	public String getLikeToDo() {
		return likeToDo;
	}

	/**
	 * @param likeToDo the likeToDo to set
	 */
	public void setLikeToDo(String likeToDo) {
		this.likeToDo = likeToDo;
	}

}
