package com.testvagrant;



public class Player {
	

	@Override
	public String toString() {
		return "Players [name=" + name + ", country=" + country + ", role=" + role + ", priceInCrores=" + priceInCrores
				+ "]";
	}

	String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country=country;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public int getPriceInCrores() {
		return priceInCrores;
	}

	public void setPriceInCrores(int priceInCrores) {
		this.priceInCrores = priceInCrores;
	}

	String country;
	String role;
	int priceInCrores;

}
