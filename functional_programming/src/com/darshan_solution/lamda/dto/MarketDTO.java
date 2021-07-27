package com.darshan_solution.lamda.dto;

import java.io.Serializable;

import com.darshan_solution.lamda.constants.MarketType;

public class MarketDTO implements Serializable{
	
	private String name;
	private String location;
	private Integer noOfShops;
	private MarketType type;
	
	public MarketDTO() {
		System.out.println("invoking default constr");
	}

	public MarketDTO(String name, String location, Integer noOfShops, MarketType type) {
		super();
		this.name = name;
		this.location = location;
		this.noOfShops = noOfShops;
		this.type = type;
	}

	@Override
	public String toString() {
		return "MarketDTO [name=" + name + ", location=" + location + ", noOfShops=" + noOfShops + ", type=" + type
				+ "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((location == null) ? 0 : location.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		MarketDTO other = (MarketDTO) obj;
		if (location == null) {
			if (other.location != null)
				return false;
		} else if (!location.equals(other.location))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
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
	 * @return the location
	 */
	public String getLocation() {
		return location;
	}

	/**
	 * @param location the location to set
	 */
	public void setLocation(String location) {
		this.location = location;
	}

	/**
	 * @return the noOfShops
	 */
	public Integer getNoOfShops() {
		return noOfShops;
	}

	/**
	 * @param noOfShops the noOfShops to set
	 */
	public void setNoOfShops(Integer noOfShops) {
		this.noOfShops = noOfShops;
	}

	/**
	 * @return the type
	 */
	public MarketType getType() {
		return type;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(MarketType type) {
		this.type = type;
	}
	
	

}
