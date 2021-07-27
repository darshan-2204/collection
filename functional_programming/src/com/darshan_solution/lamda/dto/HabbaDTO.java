package com.darshan_solution.lamda.dto;

import java.io.Serializable;

import com.darshan_solution.lamda.constants.Religion;

public class HabbaDTO implements Serializable {

	private String name;
	private String region;
	private Integer noOfDays;
	private Religion type;
	private String specialFood;
	private boolean shouldBath;
	private boolean wakeUpEarly;

	public HabbaDTO() {
		System.out.println("invoking default constructor");

	}

	public HabbaDTO(String name, String region, Integer noOfDays, Religion type, String specialFood, boolean shouldBath,
			boolean wakeUpEarly) {
		super();
		this.name = name;
		this.region = region;
		this.noOfDays = noOfDays;
		this.type = type;
		this.specialFood = specialFood;
		this.shouldBath = shouldBath;
		this.wakeUpEarly = wakeUpEarly;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((region == null) ? 0 : region.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		HabbaDTO other = (HabbaDTO) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (region == null) {
			if (other.region != null)
				return false;
		} else if (!region.equals(other.region))
			return false;
		if (type != other.type)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "HabbaDTO [name=" + name + ", region=" + region + ", noOfDays=" + noOfDays + ", type=" + type
				+ ", specialFood=" + specialFood + ", shouldBath=" + shouldBath + ", wakeUpEarly=" + wakeUpEarly + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public Integer getNoOfDays() {
		return noOfDays;
	}

	public void setNoOfDays(Integer noOfDays) {
		this.noOfDays = noOfDays;
	}

	public Religion getType() {
		return type;
	}

	public void setType(Religion type) {
		this.type = type;
	}

	public String getSpecialFood() {
		return specialFood;
	}

	public void setSpecialFood(String specialFood) {
		this.specialFood = specialFood;
	}

	public boolean isShouldBath() {
		return shouldBath;
	}

	public void setShouldBath(boolean shouldBath) {
		this.shouldBath = shouldBath;
	}

	public boolean isWakeUpEarly() {
		return wakeUpEarly;
	}

	public void setWakeUpEarly(boolean wakeUpEarly) {
		this.wakeUpEarly = wakeUpEarly;
	}

}
