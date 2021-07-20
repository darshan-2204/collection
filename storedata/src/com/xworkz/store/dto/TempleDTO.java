package com.xworkz.store.dto;

import java.io.Serializable;

public class TempleDTO implements Serializable {

	private int id;
	private String name;
	private String location;
	private double entryFee;
	private String speciasPrasada;
	private int noOfPoojaris;
	private boolean male;
	private String mainGod;
	private boolean kalyani;

	public TempleDTO() {
		System.out.println("invoking default TempleDTO constr");
	}

	public TempleDTO(int id, String name, String location, double entryFee, String speciasPrasada, int noOfPoojaris,
			boolean male, String mainGod, boolean kalyani) {
		super();
		this.id = id;
		this.name = name;
		this.location = location;
		this.entryFee = entryFee;
		this.speciasPrasada = speciasPrasada;
		this.noOfPoojaris = noOfPoojaris;
		this.male = male;
		this.mainGod = mainGod;
		this.kalyani = kalyani;
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
		return "TempleDTO [id=" + id + ", name=" + name + ", location=" + location + ", entryFee=" + entryFee
				+ ", speciasPrasada=" + speciasPrasada + ", noOfPoojaris=" + noOfPoojaris + ", male=" + male
				+ ", mainGod=" + mainGod + ", kalyani=" + kalyani + "]";
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public  String getName() {
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
	 * @return the entryFee
	 */
	public double getEntryFee() {
		return entryFee;
	}

	/**
	 * @param entryFee the entryFee to set
	 */
	public void setEntryFee(double entryFee) {
		this.entryFee = entryFee;
	}

	/**
	 * @return the speciasPrasada
	 */
	public String getSpeciasPrasada() {
		return speciasPrasada;
	}

	/**
	 * @param speciasPrasada the speciasPrasada to set
	 */
	public void setSpeciasPrasada(String speciasPrasada) {
		this.speciasPrasada = speciasPrasada;
	}

	/**
	 * @return the noOfPoojaris
	 */
	public int getNoOfPoojaris() {
		return noOfPoojaris;
	}

	/**
	 * @param noOfPoojaris the noOfPoojaris to set
	 */
	public void setNoOfPoojaris(int noOfPoojaris) {
		this.noOfPoojaris = noOfPoojaris;
	}

	/**
	 * @return the male
	 */
	public boolean isMale() {
		return male;
	}

	/**
	 * @param male the male to set
	 */
	public void setMale(boolean male) {
		this.male = male;
	}

	/**
	 * @return the mainGod
	 */
	public String getMainGod() {
		return mainGod;
	}

	/**
	 * @param mainGod the mainGod to set
	 */
	public void setMainGod(String mainGod) {
		this.mainGod = mainGod;
	}

	/**
	 * @return the kalyani
	 */
	public boolean isKalyani() {
		return kalyani;
	}

	/**
	 * @param kalyani the kalyani to set
	 */
	public void setKalyani(boolean kalyani) {
		this.kalyani = kalyani;
	}

}