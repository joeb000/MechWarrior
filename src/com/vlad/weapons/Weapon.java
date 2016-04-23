package com.vlad.weapons;

import java.util.Random;

public abstract class Weapon {
	public Weapon(){
		init();
	}
	
	private int damage;
	private int accuracy;
	private String weaponName="";
	public abstract void init();
	
	public int fireWeapon(int playerAccuracy){
		System.out.println("Firing "+ getWeaponName()+"...");
		int retVal=0;
		if (isHit(playerAccuracy)){
			retVal = getDamage();
		}
		return retVal;
	}
	
	public boolean isHit(int playerAccuracy){
		int modAcc = playerAccuracy + accuracy;
		if (roll()<modAcc){
			System.out.println("ITS A HIT!");
			return true;
		}
		else {
			System.out.println("YOU MISSED YOU PIECE OF SHIT!");
			return false;
		}
	}
	
	public int roll(){
		Random rand = new Random();
		return rand.nextInt(99)+1;
	}
	
	public int getDamage() {
		return damage;
	}
	public void setDamage(int damage) {
		this.damage = damage;
	}
	public int getAccuracy() {
		return accuracy;
	}
	public void setAccuracy(int accuracy) {
		this.accuracy = accuracy;
	}

	public String getWeaponName() {
		return weaponName;
	}

	public void setWeaponName(String weaponName) {
		this.weaponName = weaponName;
	}
	
	

}
