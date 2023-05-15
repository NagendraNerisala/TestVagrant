package com.testvagrant;


//This POJO class is to convert team JSON to java object (for player specific details)

public class TeamRCB {

	String name;

	@Override
	public String toString() {
		return "TeamRCB [name=" + name + ", location=" + location + ", players=" + players + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Player[] getPlayers() {
		return players;
	}

	public void setPlayers(Player[] players) {
		this.players = players;
	}

	String location;
	Player[] players;

}
