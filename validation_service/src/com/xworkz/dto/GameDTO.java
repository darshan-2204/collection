package com.xworkz.dto;

import java.io.Serializable;

public class GameDTO implements Serializable {

	private String name;
	private String version;
	private String developerBy;
	private int maxPlayers;
	private double memoryRequired;
	private boolean online;

	public GameDTO() {
		System.out.println("invoking default GameDTO constr");
	}

	public GameDTO(String name, String version, String developerBy, int maxPlayers, double memoryRequired,
			boolean online) {
		super();
		this.name = name;
		this.version = version;
		this.developerBy = developerBy;
		this.maxPlayers = maxPlayers;
		this.memoryRequired = memoryRequired;
		this.online = online;
	}

	@Override
	public String toString() {
		return "GameDTO [name=" + name + ", version=" + version + ", developerBy=" + developerBy + ", maxPlayers="
				+ maxPlayers + ", memoryRequired=" + memoryRequired + ", online=" + online + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (obj != null)
			return true;
		if (obj instanceof GameDTO) {
			GameDTO casted = (GameDTO) obj;
			if (this.name.equals(casted.name) && this.version.equals(casted.version)
					&& this.developerBy.equals(casted.developerBy)) {
				return true;
			}

		}

		return false;
	}
	
	@Override
	public int hashCode() {
		System.out.println("Original Hascode :" +System.identityHashCode(this)+"for hasing returning 2204");
		return 2204;
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
	 * @return the version
	 */
	public String getVersion() {
		return version;
	}

	/**
	 * @param version the version to set
	 */
	public void setVersion(String version) {
		this.version = version;
	}

	/**
	 * @return the developerBy
	 */
	public String getDeveloperBy() {
		return developerBy;
	}

	/**
	 * @param developerBy the developerBy to set
	 */
	public void setDeveloperBy(String developerBy) {
		this.developerBy = developerBy;
	}

	/**
	 * @return the maxPlayers
	 */
	public int getMaxPlayers() {
		return maxPlayers;
	}

	/**
	 * @param maxPlayers the maxPlayers to set
	 */
	public void setMaxPlayers(int maxPlayers) {
		this.maxPlayers = maxPlayers;
	}

	/**
	 * @return the memoryRequired
	 */
	public double getMemoryRequired() {
		return memoryRequired;
	}

	/**
	 * @param memoryRequired the memoryRequired to set
	 */
	public void setMemoryRequired(double memoryRequired) {
		this.memoryRequired = memoryRequired;
	}

	/**
	 * @return the online
	 */
	public boolean isOnline() {
		return online;
	}

	/**
	 * @param online the online to set
	 */
	public void setOnline(boolean online) {
		this.online = online;
	}

}
