package com.vlad.mech;

import java.util.Random;

import com.vlad.weapons.Weapon;

public class Player {

	private int playerHitpoints;
	private String playerName;
	private int playerAccuracy;
	private int initiative;
	private Weapon currentWeapon;
	
	public Player(String name, int hp, int accuracy){
		playerAccuracy=accuracy;
		playerHitpoints=hp;
		playerName=name;
		setInitiative();
	}
	
	public String getPlayerInfo(){
		StringBuilder sb = new StringBuilder();
		sb.append("Name: "+ playerName);
		sb.append("\n");
		sb.append("Hitpoints: "+ playerHitpoints);
		sb.append("\n");
		sb.append("Accuracy: "+ playerAccuracy);
		sb.append("\n");
		sb.append("Initiative: "+ initiative);
		return sb.toString();
	}
	
	
	

	public int getPlayerHitpoints() {
		return playerHitpoints;
	}
	public void setPlayerHitpoints(int playerHitpoints) {
		this.playerHitpoints = playerHitpoints;
	}
	public String getPlayerName() {
		return playerName;
	}
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	public int getPlayerAccuracy() {
		return playerAccuracy;
	}
	public void setPlayerAccuracy(int playerAccuracy) {
		this.playerAccuracy = playerAccuracy;
	}
	public int getInitiative() {
		return initiative;
	}
	public void incrementInitiative() {
		initiative++;
	}
	private void setInitiative() {
		Random rand = new Random();
		initiative = rand.nextInt(5) + 5;
	}

	public Weapon getCurrentWeapon() {
		return currentWeapon;
	}

	public void setCurrentWeapon(Weapon currentWeapon) {
		this.currentWeapon = currentWeapon;
	}

	
}
