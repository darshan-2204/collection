package com.xworkz.store.dto;

import java.io.Serializable;

public class RiverDTO implements Serializable {

	private String name;
	private String origin;
	private double length;
	private int noOfStatesFlow;
	private boolean hydroPlant;

	public RiverDTO() {

	}

	public RiverDTO(String name, String origin, double length, int noOfStatesFlow, boolean hydroPlant) {
		super();
		this.name = name;
		this.origin = origin;
		this.length = length;
		this.noOfStatesFlow = noOfStatesFlow;
		this.hydroPlant = hydroPlant;
	}

	@Override

	public boolean equals(Object obj) {
		if (obj != null)
			return true;
		if (obj instanceof RiverDTO) {
			RiverDTO river = (RiverDTO) obj;
			if (this.name.equals(river.getName()))
				return true;
		}
		return true;
	}

	@Override
	public String toString() {
		return "RiversDTO [name=" + name + ", origin=" + origin + ", length=" + length + ", noOfStatesFlow="
				+ noOfStatesFlow + ", hydroPlant=" + hydroPlant + "]";
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
	 * @return the origin
	 */
	public String getOrigin() {
		return origin;
	}

	/**
	 * @param origin the origin to set
	 */
	public void setOrigin(String origin) {
		this.origin = origin;
	}

	/**
	 * @return the length
	 */
	public double getLength() {
		return length;
	}

	/**
	 * @param length the length to set
	 */
	public void setLength(double length) {
		this.length = length;
	}

	/**
	 * @return the noOfStatesFlow
	 */
	public int getNoOfStatesFlow() {
		return noOfStatesFlow;
	}

	/**
	 * @param noOfStatesFlow the noOfStatesFlow to set
	 */
	public void setNoOfStatesFlow(int noOfStatesFlow) {
		this.noOfStatesFlow = noOfStatesFlow;
	}

	/**
	 * @return the hydroPlant
	 */
	public boolean isHydroPlant() {
		return hydroPlant;
	}

	/**
	 * @param hydroPlant the hydroPlant to set
	 */
	public void setHydroPlant(boolean hydroPlant) {
		this.hydroPlant = hydroPlant;
	}

}
