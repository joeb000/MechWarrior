package com.vlad.mech;

import java.util.Random;

/**
 *
 * @author vladimirmujakovic
 */
public class MK1Factory {


	public MK1Factory(int hp, int accuracy){
		mechHitpoints=hp;
		mechAccuracy=accuracy;
		setInitiative();
	}
	public MK1Factory(String name, int hp, int accuracy){
		mechName=name;
		mechHitpoints=hp;
		mechAccuracy=accuracy;
		setInitiative();
	}

	private int mechHitpoints;
	private String mechName = "MK1";
	private int mechAccuracy;
	private int initiative;

	public String getMechInfo(){
		StringBuilder sb = new StringBuilder();
		sb.append("Mech Name: "+ mechName);
		sb.append("\n");
		sb.append("Hitpoints: "+ mechHitpoints);
		sb.append("\n");
		sb.append("Accuracy: "+ mechAccuracy);
		return sb.toString();
	}


	public int getMechHitpoints() {
		return mechHitpoints;
	}

	public void setMechHitpoints(int mechHitpoints) {
		this.mechHitpoints = mechHitpoints;

	}

	public String getMechName() {
		return mechName;
	}

	public void setMechName(String mechName) {
		this.mechName = mechName;
	}

	public int getMechAccuracy() {
		return mechAccuracy;
	}

	public void setMechAccuracy(int mechAccuracy) {
		this.mechAccuracy = mechAccuracy;
	}
	public int getInitiative() {
		return initiative;
	}
	
	private void setInitiative() {
		Random rand = new Random();
		initiative = rand.nextInt(10) + 1;
	}
	
	public int attack(){
		int damageDealt=10;
		int roll = roll();
		if (roll==50){
			System.out.println("You have been critically hit!");
			damageDealt=20;
		}
		else if (roll>mechAccuracy){
			damageDealt=0;
		}
		return damageDealt;
	}
	public int roll(){
		Random rand = new Random();
		return rand.nextInt(99)+1;
	}
}
