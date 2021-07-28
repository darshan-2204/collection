package com.darshan_solution.lamda.dto;

import java.io.Serializable;

public class RogiDTO implements Serializable {

	private Integer id;
	private String name;
	private Integer age;
	private String kayile;
	private boolean badukuGurantee;

	public RogiDTO() {
		System.out.println("invoking default RogiDTO");
	}

	public RogiDTO(Integer id, String name, Integer age, String kayile, boolean badukuGurantee) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.kayile = kayile;
		this.badukuGurantee = badukuGurantee;
	}

	@Override
	public String toString() {
		return "RogiDTO [id=" + id + ", name=" + name + ", age=" + age + ", kayile=" + kayile + ", badukuGurantee="
				+ badukuGurantee + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((age == null) ? 0 : age.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
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
		RogiDTO other = (RogiDTO) obj;
		if (age == null) {
			if (other.age != null)
				return false;
		} else if (!age.equals(other.age))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getKayile() {
		return kayile;
	}

	public void setKayile(String kayile) {
		this.kayile = kayile;
	}

	public boolean isBadukuGurantee() {
		return badukuGurantee;
	}

	public void setBadukuGurantee(boolean badukuGurantee) {
		this.badukuGurantee = badukuGurantee;
	}

}
