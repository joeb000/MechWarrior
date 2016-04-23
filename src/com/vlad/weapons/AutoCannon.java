package com.vlad.weapons;

public class AutoCannon extends Weapon {
	
	private static int CANNON_DAMAGE = 12;
	private static int CANNON_ACCURACY = 75;
	private static String CANNON_NAME = "Auto Cannon";

	@Override
	public void init() {
		setDamage(CANNON_DAMAGE);
		setAccuracy(CANNON_ACCURACY);
		setWeaponName(CANNON_NAME);
	}

	@Override
	public int fireWeapon(int playerAccuracy){
		int ret = 0;
		ret = super.fireWeapon(playerAccuracy);
		ret+=super.fireWeapon(playerAccuracy);
		
		return ret;
		
	}
	
}
